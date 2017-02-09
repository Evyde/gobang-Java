/*
 * 五子棋程序JAVA版
 * 拟定图形界面+网络大厅
 * 所以有以下功能：
 * 登录
 * 大厅
 * 显示当前在线用户
 * //聊天
 * 5个桌子
 * 加入游戏
 * 退出游戏
 * AI
 * */

package com.hanfeng.chess.client;
import java.io.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class mainClass {
	public static boolean loginStates = false;
	
	public static void main(String[] args) {
		configFileRW cfg = configFileRW.getConfigFileRWClass();
		//判断配置文件是否存在
		try {
			File f = new File(cfg.getConfigFilePath());
			if(f.exists()) {
				cfg.setFile(f);
				cfg.readNowSetting();
			}else cfg.writeNowSetting();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "错误","文件读取错误！将使用出厂设置！", JOptionPane.ERROR_MESSAGE);
		}
		
		try {
			methodOfGame mfg = methodOfGame.creatMethodOfGameClass(null);
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch(Exception e) {
				System.out.println("初始化失败！");
				e.printStackTrace();
		}
		//创建登录界面
		UI ui = new UI();
		//创建一个Socket
		//Socket serevrSocket = new Socket(127.0.0.1,80);

		JFrame jf = null;
		/*
		 * 这里补充说明一下
		 * 首先应当连接网络，即连接服务器
		 * 获得与服务器的连接之后
		 * 将此Socket保存
		 * 并且获得一个methodOfGame
		 * 将此Socket传入
		 * */
		
		try {
			jf = ui.creatLoginFrame();
		} catch(Throwable t) {
			JOptionPane.showMessageDialog(jf, "创建登录窗口失败，请重新启动程序！",  "错误", JOptionPane.ERROR_MESSAGE);
			t.printStackTrace();
		}
		jf.setVisible(true);	//设置窗口可见
		//阻塞，等待登陆完成
		while(!loginStates) System.out.println("Pause...");
		
		jf.setVisible(false);
		jf = null;
		
		//建议系统回收
		System.gc();
		
		//建立新的大厅窗口
		try {
			jf = ui.creatDFrame();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(jf, "创建大厅窗口失败，请重新启动程序！",  "错误", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		//设置窗口可见
		jf.setVisible(true);
		
	}
		
		

}
