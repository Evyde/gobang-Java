package com.hanfeng.chess.client;

import java.net.*;

/*
 * 处理服务器类
 * 为什么不限制连接？
 * 因为唯一实例化此类的只有methodOfGame类
 * 而该类已经限制为只能实例化一个
 * 所以该类不限制
 * 不考虑其他问题
 * */

public class server {
	public server(InetAddress ip) {

	}
	/*
	 * 连接服务器方法
	 * 用于连接服务器
	 * */
	public void connectServer() throws Exception {
		
		
	}
	
	//获取用户密码
	public byte[] getServerUserPassword(String uname) {
		return uname.getBytes();
	}
	
	//判断用户是否存在的方法，存在返回true
	private boolean isUserExist(String userName) {
		
		return false;
	}
	
	public InetAddress getServerIPAddress() {
		return null;
	}
}
