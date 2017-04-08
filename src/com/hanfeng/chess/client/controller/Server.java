package com.hanfeng.chess.client;

import java.io.*;
import java.net.*;
import javax.swing.*;

/*
 * 处理服务器类
 * 为什么不限制连接？
 * 因为唯一实例化此类的只有methodOfGame类
 * 而该类已经限制为只能实例化一个
 * 所以此类不限制
 * 不考虑其他问题
 * */

public class Server {
	private int port = 23232;
	private String serverIP = "127.0.0.1";
	public final int LOGIN = 1;
	public final int IS_USER_EXIST = 2;
	public final int REGISTER = 3;
	public final int GAME = 4;
	private static Socket s = null;
	private static InputStream in = null;
	private static PrintStream out = null;
	
	
	public Server() {
		
	}
	/*
	 * 连接服务器方法
	 * 用于连接服务器
	 * */
	public void connectServer() throws Exception {
		s = new Socket(serverIP,port);
		s.connect(null);
		in = s.getInputStream();
		out = new PrintStream(s.getOutputStream());
	}	
	
	//获取用户密码
	public byte[] getServerUserPassword(String uname) throws Exception {
		String hd = configRequestHead(LOGIN, uname);
		byte[] a = new byte[1024];
		out.print(hd);
		while(in.read(a)==0) ;
		return a;
	}
	
	//判断用户是否存在的方法，存在返回true
	public boolean isUserExist(String userName) throws Exception {
		String hd = configRequestHead(IS_USER_EXIST, userName);
		boolean b = true;
		byte[] a = new byte[1024];
		out.print(hd);
		while(in.read(a)==0) ;
		if(a.toString()=="TRUE") b = true;
		else b = false;
		return b;
	}
	
	/**
	 * 配置请求头
	 * */
	
	private String configRequestHead(int requestMethod,String... args) {
		String head;
		switch(requestMethod) {
		case LOGIN : head = "LOGIN"; break;
		case IS_USER_EXIST : head = "IS_USER_EXIST"; break;
		case REGISTER : head = "REGISTER"; break;
		
		default: head = "REQUEST";
		}
		head+=" ";
		for(int i = 0;i<args.length;i++) {
			head+=args[i]+" ";
		}
		head+="\r\n";
		
		return head;
	}
	
}
