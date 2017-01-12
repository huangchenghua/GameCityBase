package com.gz.dbpools;

/**
 * 连接bean
 * @author  
 * @since 2007-3-8 
 * @version 1.0
 */
public class ConnectionParam {
	private String name;
	private String driver;					//数据库驱动程序
	private String url;						//数据连接的URL
	private String user;					//数据库用户名
	private String password;				//数据库密码
	private int minConnection = 0;			//初始化连接数
	private int maxConnection = 50;			//最大连接数
	private long timeoutValue = 600000;		//连接的最大空闲时间
	private int waitTime = 30000;			//取连接的时候如果没有可用连接最大的等待时间
	
	public String getDriver() {
		return driver;
	}
	public int getMaxConnection() {
		return maxConnection;
	}
	public int getMinConnection() {
		return minConnection;
	}
	public String getPassword() {
		return password;
	}
	public long getTimeoutValue() {
		return timeoutValue;
	}
	public String getUrl() {
		return url;
	}
	public String getUser() {
		return user;
	}
	public int getWaitTime() {
		return waitTime;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void setMaxConnection(int maxConnection) {
		this.maxConnection = maxConnection;
	}
	public void setMinConnection(int minConnection) {
		this.minConnection = minConnection<0 ? 0 : minConnection;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setTimeoutValue(long timeoutValue) {
		this.timeoutValue = timeoutValue;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
