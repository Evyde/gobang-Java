/**
 * 
 */
package com.hanfeng.chess.client.module.exception;

/**
 * @author HanFeng
 *
 */
public class GameException extends Exception {

	/**
	 * 
	 */
	public GameException() {
		// TODO 自动生成的构造函数存根
		super("未知游戏错误！");
	}

	/**
	 * @param message
	 */
	public GameException(String message) {
		super(message);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param cause
	 */
	public GameException(Throwable cause) {
		super(cause);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param message
	 * @param cause
	 */
	public GameException(String message, Throwable cause) {
		super(message, cause);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public GameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO 自动生成的构造函数存根
	}

}
