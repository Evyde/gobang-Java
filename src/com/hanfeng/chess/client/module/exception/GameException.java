package com.hanfeng.chess.client;
/*
 * 这是一个自用异常类
 * 
 * */
public class GameException extends Exception{
	String exceptionMsg = new String("未知错误！");
	public GameException() {
		
	}
	public GameException(String exceptionMessage) {
		exceptionMsg = exceptionMessage;
	}
	public String getMessage() {
		return(exceptionMsg);
	}
}
