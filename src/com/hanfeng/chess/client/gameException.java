package com.hanfeng.chess.client;
/*
 * 这是一个自用异常类
 * 
 * */
public class gameException extends Exception{
	String exceptionMsg = new String("未知错误！");
	public gameException() {
		
	}
	public gameException(String exceptionMessage) {
		exceptionMsg = exceptionMessage;
	}
	public String getMessage() {
		return(exceptionMsg);
	}
}
