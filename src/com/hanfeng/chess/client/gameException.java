package com.hanfeng.chess.client;
/*
 * ����һ�������쳣��
 * 
 * */
public class gameException extends Exception{
	String exceptionMsg = new String("δ֪����");
	public gameException() {
		
	}
	public gameException(String exceptionMessage) {
		exceptionMsg = exceptionMessage;
	}
	public String getMessage() {
		return(exceptionMsg);
	}
}
