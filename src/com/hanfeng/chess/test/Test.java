/**
 * 
 */
package com.hanfeng.chess.test;

import javax.swing.UIManager;

import com.hanfeng.chess.client.Messages;
import com.hanfeng.chess.client.module.*;
import com.hanfeng.chess.client.view.LoginFrame;

/**
 * @author HanFeng
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		{
			// 禁用皮肤自带按钮
			UIManager.put("RootPane.setupButtonVisible", false);
		}
	try {
		org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	}catch(Exception e) {
			System.out.println();
			e.printStackTrace();
	}
		LoginFrame lf = new LoginFrame();
		lf.init();
		lf.setVisible(true);
		User u = new User("ForeverOpp");
		u.setPassword("Hanfeng@20143330_");
		System.out.println(u.getPassword());

	}

}
