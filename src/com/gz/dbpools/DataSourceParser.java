package com.gz.dbpools;

import java.io.*;
import java.util.*;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

/**
 * 操作配置文件类 读 写 修改 删除等操作
 * 
 * 下面是五个在XML文档中预定义好的实体：
 * 
 * &lt; < 小于号 &gt; > 大于号 &amp; & 和 &apos; ' 单引号 &quot; " 双引号
 * 
 * 实体必须以符号"&"开头，以符号";"结尾。
 * 
 * @author  
 * @since 2007-2-27
 * @version 1.0
 */
public class DataSourceParser {
	/**
	 * 构造函数
	 */
	public DataSourceParser() {
	}

	/**
	 * 读取xml配置文件
	 * 
	 * @param path
	 * @return
	 */
	public Vector<ConnectionParam> readConfigInfo(String path) {
//		path = getClass().getResource("").getPath().substring(1) + path;

		Vector<ConnectionParam> dsConfig = null;
		FileInputStream fi = null;
		try {
			fi = new FileInputStream(path);// 读取路径文件
			dsConfig = new Vector<ConnectionParam>();
			SAXBuilder sb = new SAXBuilder();
			Document doc = sb.build(fi);
			Element root = doc.getRootElement();

			List pools = root.getChildren();
			Element pool = null;

			Iterator allPool = pools.iterator();
			while (allPool.hasNext()) {
				pool = (Element) allPool.next();
				ConnectionParam connParam = new ConnectionParam();
				connParam.setName(pool.getChildText("name"));
				connParam.setDriver(pool.getChildText("driver"));
				connParam.setUrl(pool.getChildText("url"));
				connParam.setUser(pool.getChildText("username"));
				connParam.setPassword(pool.getChildText("password"));
				connParam.setMinConnection(Integer.parseInt(pool
						.getChildText("minconn")));
				connParam.setMaxConnection(Integer.parseInt(pool
						.getChildText("maxconn")));
				connParam.setTimeoutValue(Long.parseLong(pool
						.getChildText("freetimeout")));
				connParam.setWaitTime(Integer.parseInt(pool
						.getChildText("waittime")));
				dsConfig.add(connParam);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				fi.close();
			} catch (IOException e) {
			}
		}

		return dsConfig;
	}

	/**
	 * 修改配置文件,待完成。。。
	 */
	public void modifyConfigInfo(String path, ConnectionParam ds)
			throws Exception {
	}

	/**
	 * 增加配置文件
	 * 
	 * @param path
	 *            配置路径文件名
	 * @param dsb
	 *            配置文件Bean
	 */
	@SuppressWarnings("unchecked")
	public void addConfigInfo(String path, ConnectionParam ds) {
		String rpath = this.getClass().getResource("").getPath().substring(1)
				+ path;
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream(rpath);// 读取xml流

			SAXBuilder sb = new SAXBuilder();

			Document doc = sb.build(fi); // 得到xml
			Element root = doc.getRootElement();
			List pools = root.getChildren();// 得到xml子树

			Element newpool = new Element("pool"); // 创建新连接池

			pools.add(newpool);// 将child添加到root
			Format format = Format.getPrettyFormat();
			format.setIndent("");
			format.setEncoding("utf-8");
			XMLOutputter outp = new XMLOutputter(format);
			fo = new FileOutputStream(rpath);
			outp.output(doc, fo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				fo.close();
			} catch (IOException e) {
			}
		}
	}
	/**
	 * 删除配置文件
	 */
	public void delConfigInfo(String path, String name) {
		String rpath = this.getClass().getResource("").getPath().substring(1)
				+ path;
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try {
			fi = new FileInputStream(rpath);// 读取路径文件
			SAXBuilder sb = new SAXBuilder();
			Document doc = sb.build(fi);
			Element root = doc.getRootElement();
			List pools = root.getChildren();
			Element pool = null;
			Iterator allPool = pools.iterator();
			while (allPool.hasNext()) {
				pool = (Element) allPool.next();
				if (pool.getChild("name").getText().equals(name)) {
					pools.remove(pool);
					break;
				}
			}
			Format format = Format.getPrettyFormat();
			format.setIndent("");
			format.setEncoding("utf-8");
			XMLOutputter outp = new XMLOutputter(format);
			fo = new FileOutputStream(rpath);
			outp.output(doc, fo);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				fi.close();
			} catch (IOException e) {
			}
		}
	}

	// public static void main(String[] args) {
	// new DataSourceParser().readConfigInfo("conf/ds.config.xml");
	// }
}
