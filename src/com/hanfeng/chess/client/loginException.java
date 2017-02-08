package com.hanfeng.chess.client;
/*
 * 这是一个登陆异常类
 * 
 * */
public class loginException extends Exception{
	String exceptionMsg = new String("未知登录错误！");
	public loginException() {
		
	}
	public loginException(String exceptionMessage) {
		exceptionMsg = exceptionMessage;
	}
	public String getMessage() {
		return(exceptionMsg);
	}
}
