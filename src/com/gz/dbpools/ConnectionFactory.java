package com.gz.dbpools;

import java.util.*;

import javax.naming.*;
import javax.sql.*;

import java.sql.*;

/**
 * 连接池类厂，该类常用来保存多个数据源名称和数据库连接池对应的哈希
 * @author  
 * @since 2007-3-5 
 * @version 1.0
 */
public class ConnectionFactory {
	private static String DS_FILENAME = "conf/datasource_config.xml";
	// 该哈希表用来保存数据源名和连接池对象的关系表
	static Hashtable<String,DataSource> connectionPools = null;
	static {
		connectionPools = new Hashtable<String,DataSource>(2, 0.75F);
		init();
	}
	/**
	 * 从连接池工厂中获取指定名称对应的连接池对象
	 * @param dataSource	连接池对象对应的名称
	 * @return DataSource 	返回名称对应的连接池对象
	 * @throws NameNotFoundException	无法找到指定的连接池
	 */
	public static DataSource lookup(String dataSource)
			throws NameNotFoundException {
		DataSource ds = connectionPools.get(dataSource);
		if (ds == null){
			throw new NameNotFoundException(dataSource);
		}
		return ds;
	}
	/**
	 * 将指定的名字和数据库连接配置绑定在一起并初始化数据库连接池
	 * 
	 * @param name			对应连接池的名称
	 * @param param			连接池的配置参数，具体请见类ConnectionParam
	 * @return DataSource 	如果绑定成功后返回连接池对象
	 * @throws NameAlreadyBoundException
	 *             一定名字name已经绑定则抛出该异常
	 * @throws ClassNotFoundException
	 *             无法找到连接池的配置中的驱动程序类
	 * @throws IllegalAccessException
	 *             连接池配置中的驱动程序类有误
	 * @throws InstantiationException
	 *             无法实例化驱动程序类
	 * @throws SQLException
	 *             无法正常连接指定的数据库
	 */
	public static DataSource bind(String name, ConnectionParam param)
			throws NameAlreadyBoundException, ClassNotFoundException,
			IllegalAccessException, InstantiationException, SQLException {
		DataSourceImpl source = null;
		try {
			lookup(name);
			throw new NameAlreadyBoundException(name);
		} catch (NameNotFoundException e) {
			source = new DataSourceImpl(param);
			// source.initConnection();
			connectionPools.put(name, source);
		}
		return source;
	}
	/**
	 * 重新绑定数据库连接池
	 * 
	 * @param name			对应连接池的名称
	 * @param param			连接池的配置参数，具体请见类ConnectionParam
	 * @return DataSource 	如果绑定成功后返回连接池对象
	 * @throws NameAlreadyBoundException
	 *             一定名字name已经绑定则抛出该异常
	 * @throws ClassNotFoundException
	 *             无法找到连接池的配置中的驱动程序类
	 * @throws IllegalAccessException
	 *             连接池配置中的驱动程序类有误
	 * @throws InstantiationException
	 *             无法实例化驱动程序类
	 * @throws SQLException
	 *             无法正常连接指定的数据库
	 */
	public static DataSource rebind(String name, ConnectionParam param)
			throws NameAlreadyBoundException, ClassNotFoundException,
			IllegalAccessException, InstantiationException, SQLException {
		try {
			unbind(name);
		} catch (Exception e) {
		}
		return bind(name, param);
	}
	
	/**
	 * 删除一个数据库连接池对象
	 * @param name
	 * @throws NameNotFoundException
	 */
	public static void unbind(String name) throws NameNotFoundException {
		DataSource dataSource = lookup(name);
		if (dataSource instanceof DataSourceImpl) {
			DataSourceImpl dsi = (DataSourceImpl) dataSource;
			try {
				dsi.close();
			} catch (Exception e) {
			} finally {
				dsi = null;
			}
		}
		connectionPools.remove(name);
	}

	/**
	 * 从配置文件加载数据源
	 * @param props
	 */
	private static void init() {
		DataSourceParser pd = new DataSourceParser();
		System.out.println("Reading connection parameter from "+DS_FILENAME);
		// 读取数据库配置文件
		Vector<ConnectionParam> drivers = pd.readConfigInfo(DS_FILENAME);
		System.out.println("Reading complete！");
		for(ConnectionParam cp : drivers){
			try{
				System.out.println("Binding data source:"+cp.getName()+"......");
				bind(cp.getName(),cp);
				System.out.println("Bind successfully!!!");
			}catch(Exception e){
				System.err.println("Initial connection pool from "+DS_FILENAME+" failed!");
				e.printStackTrace();
			}
		}

	}
	
//	public static void main(String[] args) throws Exception{
//		DataSource ds = lookup("sms");
//		ds.getConnection();
//	}
}
