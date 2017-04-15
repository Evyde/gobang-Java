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

import com.hanfeng.chess.client.controller.ConfigFileRW;
import com.hanfeng.chess.client.module.MethodOfGame;
import com.hanfeng.chess.client.view.GameFrame;

public class MainClass {
	public static boolean loginStates = false;
	
	public static void main(String[] args) {
		ConfigFileRW cfg = ConfigFileRW.getConfigFileRWClass();
		//判断配置文件是否存在
		try {
			File f = new File(cfg.getConfigFilePath());
			if(f.exists()) {
				cfg.setFile(f);
				cfg.readNowSetting();
			}else cfg.writeNowSetting();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, Messages.getString("MainClass.error"),Messages.getString("MainClass.fileReadError"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
		}
		
		try {
			MethodOfGame mfg = MethodOfGame.creatMethodOfGameClass();
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch(Exception e) {
				System.out.println(Messages.getString("MainClass.initError")); //$NON-NLS-1$
				e.printStackTrace();
		}
		//创建登录界面
		GameFrame ui = new GameFrame();
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
			JOptionPane.showMessageDialog(jf, Messages.getString("MainClass.initLoginFrameError"),  Messages.getString("MainClass.error"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
			t.printStackTrace();
		}
		jf.setVisible(true);	//设置窗口可见
		//阻塞，等待登陆完成
		while(!loginStates) ;
		
		jf.setVisible(false);
		jf.dispose();
		jf = null;
		
		//建议系统回收
		System.gc();
		
		//建立新的大厅窗口
		try {
			jf = ui.creatDFrame();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(jf, Messages.getString("MainClass.initHallFrameError"),  Messages.getString("MainClass.error"), JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
			e.printStackTrace();
		}
		//设置窗口可见
		jf.setVisible(true);
		
	}
		
		

}
