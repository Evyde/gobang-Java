package com.hanfeng.chess.client;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;

/**
 * 这里放着一些关于游戏的方法
 * 首先，该类有一个构造器，限制只能实例化一个
 */
public class methodOfGame {
	private static methodOfGame mf = null;
	private static int numOfmf = 0;
	private server s = null;

	private methodOfGame(InetAddress ip) {
		try {
			s = new server(ip);
		}catch(Exception e) {
			System.out.println("创建服务器实例失败！");
			e.printStackTrace();
		}
	}
	
	public static methodOfGame creatMethodOfGameClass(InetAddress serverIP) throws Exception {
		if(numOfmf == 0) {
			if(serverIP != null) mf = new methodOfGame(serverIP);
			else mf = new methodOfGame(InetAddress.getLocalHost());
			numOfmf = 1;
			return mf;
		}else return mf;
	}
	
	public static methodOfGame getmog() {
		return mf;
		//直接get一个，比较简单
	}

	//注册方法，简单注册一下
	public boolean register(user u) throws gameException{
		//throw new gameException("用户名错误");
		return true;
	}
	
	/*
	 * 登录方法
	 * 用于和服务器交互判断用户名密码是否正确
	 * 并且将用户的状态置为在线
	 * */
	public void startLogin(user u) throws Exception{
		//throw new gameException("用户名错误");
		//if(u.getPassword().equals(s.getServerUserPassword(u.name)));
	}
	
	/*
	 * 棋盘：15线*15线，225交点
	 * 分区：15行*15列，225块
	 * 当用户点击时，产生一个坐标
	 * 判断该坐标位于哪一块，该块对应一个交点
	 * 然后进行棋子、边框绘制
	 * 并置于数组中
	 * */
}
