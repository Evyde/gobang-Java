package com.hanfeng.chess.client.module;
import com.hanfeng.chess.client.controller.Server;
import com.hanfeng.chess.client.module.exception.GameException;

/**
 * 这里放着一些关于游戏的方法
 * 首先，该类有一个构造器，限制只能实例化一个
 */
public class MethodOfGame {
	private static MethodOfGame mf = null;
	private static int numOfmf = 0;
	private Server s = null;

	private MethodOfGame() {
		try {
			s = new Server();
			s.connectServer();
		}catch(Exception e) {
			System.out.println("创建服务器实例失败！");
			e.printStackTrace();
		}
	}
	
	public static MethodOfGame creatMethodOfGameClass() throws Exception {
		if(numOfmf == 0) {
			mf = new MethodOfGame();
			numOfmf = 1;
			return mf;
		}else return mf;
	}
	
	public static MethodOfGame getmog() {
		return mf;
		//直接get一个，比较简单
	}

	//注册方法，简单注册一下
	public boolean register(User u) throws GameException{
		//throw new gameException("用户名错误");
		return true;
	}
	
	/*
	 * 登录方法
	 * 用于和服务器交互判断用户名密码是否正确
	 * 并且将用户的状态置为在线
	 * */
	public void startLogin(User u) throws Exception{
		if(!getServer().isUserExist(u.name))
			throw new GameException("用户名错误");
		
		if(u.getPassword().equals(getServer().getServerUserPassword(u.name)));
	}

	/**
	 * @return s
	 */
	public Server getServer() {
		return s;
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
