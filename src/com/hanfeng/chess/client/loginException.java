package com.hanfeng.chess.client;
/*
 * ����һ����½�쳣��
 * 
 * */
public class loginException extends Exception{
	String exceptionMsg = new String("δ֪��¼����");
	public loginException() {
		
	}
	public loginException(String exceptionMessage) {
		exceptionMsg = exceptionMessage;
	}
	public String getMessage() {
		return(exceptionMsg);
	}
}
