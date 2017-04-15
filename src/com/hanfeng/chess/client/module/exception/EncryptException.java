/**
 * 加密异常类
 */
package com.hanfeng.chess.client.module.exception;

/**
 * @author HanFeng
 *
 */
public class EncryptException extends Exception {

	/**
	 * 
	 */
	public EncryptException() {
		// TODO 自动生成的构造函数存根
		super("加密未知错误！");
	}

	/**
	 * @param message
	 */
	public EncryptException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param cause
	 */
	public EncryptException(Throwable cause) {
		super(cause);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param message
	 * @param cause
	 */
	public EncryptException(String message, Throwable cause) {
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public EncryptException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

}
