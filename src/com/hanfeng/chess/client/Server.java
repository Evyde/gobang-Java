package com.hanfeng.chess.client;

import java.net.*;

import javax.swing.JOptionPane;

import sun.net.InetAddressCachePolicy;

/*
 * 处理服务器类
 * 为什么不限制连接？
 * 因为唯一实例化此类的只有methodOfGame类
 * 而该类已经限制为只能实例化一个
 * 所以该类不限制
 * 不考虑其他问题
 * */

public class Server {
	private int port = 23232;
	private String serverIP = "127.0.0.1";
	public Server() {
		
	}
	/*
	 * 连接服务器方法
	 * 用于连接服务器
	 * */
	public void connectServer() throws Exception {
		Socket s = new Socket(serverIP,port);
		System.out.println("123");
		s.connect(null);
	}
	
	public InetAddress getServerIPAddress() {
		return null;
	}
	
	//获取用户密码
	public byte[] getServerUserPassword(String uname) {
		return uname.getBytes();
	}
	
	//判断用户是否存在的方法，存在返回true
	public static boolean isUserExist(String userName) {
		
		return true;
	}
}
