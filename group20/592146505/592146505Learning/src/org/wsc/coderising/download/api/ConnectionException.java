package org.wsc.coderising.download.api;

/**
 *
 * 连接异常类
 * 
 * @author Administrator
 * @date 2017年3月6日下午6:59:41
 * @version v1.0
 *
 */
public class ConnectionException extends Exception {

	private static final long serialVersionUID = -249834831447340792L;

	private ConnectionException() {
		super();
	}

	private ConnectionException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	private ConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	private ConnectionException(String message) {
		super(message);
	}

	private ConnectionException(Throwable cause) {
		super(cause);
	}

}
