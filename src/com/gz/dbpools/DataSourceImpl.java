package com.gz.dbpools;

import java.io.PrintWriter;
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;

import javax.sql.DataSource;

/**
 * 实现了接口javax.sql.DataSource的类，该类维护着一个连接池的对象
 * @author  
 * @since 2007-3-5 
 * @version 1.0
 */
public class DataSourceImpl implements DataSource {
	private static final long CHECK_INTERVAL = 1000*60*5;

	private final ConnectionParam connParam;
	private List<_Connection> pool = new ArrayList<_Connection>();
	
	private Timer timer = new Timer();

	/**
	 * 构造函数
	 * @param connParam 
	 */
	public DataSourceImpl(ConnectionParam connParam) {
		this.connParam = connParam;
		this.initConnectionPool();
		timer.schedule(new TimerTask() {
			public void run() {
				check();
			}
		}, CHECK_INTERVAL, CHECK_INTERVAL);
	}

//	/**
//	 * 检查空闲连接，如果空闲超时就关闭此连接 
//	 */
//	private void check() {
//		synchronized(pool){//避免在关闭的空闲连接的时候，其它线程获取了这个关闭的连接
//			for(int i=0; i<pool.size(); i++){
//				_Connection con = ((_Connection) pool.get(i));
//				if (con != null) {
//					//当前时间离此连接的最后访问时间间隔大于超时值，就关闭此连接
//					if (System.currentTimeMillis() - con.getLastAccessTime() > connParam
//							.getTimeoutValue()) {
//						if(!con.isInUse()){
//							try {
//								con.close();
//							} catch (SQLException e) {
//								e.printStackTrace();
//							}
//							pool.remove(i);
//						}
//					}
//				}
//			}//end of for
//		}
//	}
	
	/**
	 * 检查空闲连接，如果空闲超时就关闭此连接 
	 */
	private void check() {
		synchronized(pool){//避免在关闭的空闲连接的时候，其它线程获取了这个关闭的连接
			Iterator<_Connection> it = pool.iterator();
			while(it.hasNext()){
				_Connection con = it.next();
//				当前时间离此连接的最后访问时间间隔大于超时值，就关闭此连接并从池里面删除
				if (System.currentTimeMillis() - con.getLastAccessTime() > connParam
						.getTimeoutValue()) {
					if(!con.isInUse()){
						try {
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
						it.remove();
					}
				}
			}//end of for
		}
	}

	/**
	 * @see javax.sql.DataSource#getConnection(String,String)
	 */
	public synchronized Connection getConnection(String user, String password)
			throws SQLException {
		// 首先从连接池中找出空闲的对象
		Connection conn = getFreeConnection(0);
		if (conn == null) {
			// 判断是否超过最大连接数,如果超过最大连接数
			// 则等待一定时间查看是否有空闲连接,否则抛出异常告诉用户无可用连接
			if (getConnectionCount() >= connParam.getMaxConnection())
				conn = getFreeConnection(connParam.getWaitTime());
			else {// 没有超过连接数，重新获取一个数据库的连接
				connParam.setUser(user);
				connParam.setPassword(password);		
				conn = createConnection(connParam,true);
			}
		}
		return conn;
	}

	/**
	 * 获取连接总数
	 * @return 
	 */
	private int getConnectionCount() {
		return pool.size();
	}

	/**
	 * 初始化连接池 
	 */
	protected void initConnectionPool() {
		try {
			Class.forName(connParam.getDriver());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i < connParam.getMinConnection(); i++) {
			try {
				createConnection(connParam,false);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 创建一个新的连接并入池,返回代理连接
	 * @param connParam
	 * @param inUse 此新建连接是否在使用
	 * @return
	 * @throws SQLException 
	 */
	protected Connection createConnection(ConnectionParam connParam,boolean inUse)
			throws SQLException {
		Connection conn = DriverManager.getConnection(connParam.getUrl(),
				connParam.getUser(), connParam.getPassword());
		// 代理将要返回的连接对象
		_Connection _conn = new _Connection(conn, inUse);
//		synchronized (pool) {
			pool.add(_conn);
//		}
		
		return _conn.getConnection();
	}
	

	/**
	 * 关闭该连接池中的所有数据库连接
	 * 并取消检查空闲连接的时钟
	 * @return int 返回被关闭连接的个数
	 * @throws SQLException
	 */
	public void close() throws SQLException {
		timer.cancel();
		
		for(_Connection _conn : pool){
			_conn.close();
		}
	}

	/**
	 * 从连接池中取一个空闲的连接
	 * 
	 * @param nTimeout
	 *            如果该参数值为0则没有连接时只是返回一个null 否则的话等待nTimeout毫秒看是否还有空闲连接，如果没有抛出异常
	 * @return Connection
	 * @throws SQLException
	 */
	protected  Connection getFreeConnection(long nTimeout)
			throws SQLException {
		Connection conn = null;
		for(_Connection _conn : pool){
			if (!_conn.isInUse()) {
				conn = _conn.getConnection();
				_conn.setInUse(true);
				break;
			}
		}
		
		if (conn == null && nTimeout > 0) {
			// 等待nTimeout毫秒以便看是否有空闲连接
			try {
				System.err.println("获取连接时等待"+nTimeout+"毫秒。。。");
				Thread.sleep(nTimeout);
			} catch (Exception e) {
			}
			conn = getFreeConnection(0);
			if (conn == null)
				throw new SQLException("没有可用的数据库连接");
		}
		return conn;
	}

	public Connection getConnection() throws SQLException {
		return getConnection(connParam.getUser(), connParam.getPassword());
	}
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public void setLogWriter(PrintWriter out) throws SQLException {
		// TODO Auto-generated method stub

	}
	public void setLoginTimeout(int seconds) throws SQLException {
		connParam.setWaitTime(seconds);
	}
	public int getLoginTimeout() throws SQLException {
		return connParam.getWaitTime();
	}
	@SuppressWarnings("unchecked")
	public Object unwrap(Class arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean isWrapperFor(Class arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

}
