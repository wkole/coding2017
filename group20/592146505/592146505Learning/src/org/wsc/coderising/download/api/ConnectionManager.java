package org.wsc.coderising.download.api;

/**
 *
 * 管理连接接口
 * 
 * @author Administrator
 * @date 2017年3月6日下午7:02:30
 * @version v1.0
 *
 */
public interface ConnectionManager {
	/**
	 * 给定一个url , 打开一个连接
	 * 
	 * @param url
	 * @return
	 */
	public Connection open(String url) throws ConnectionException;
}
