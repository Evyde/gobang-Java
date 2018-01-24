/**
 * 
 */
package win.r6up.gobang.test;

import javax.swing.UIManager;

import win.r6up.gobang.client.Messages;
import win.r6up.gobang.client.module.*;
import win.r6up.gobang.client.view.LoginFrame;

/**
 * @author HanFeng
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		{
			// ����Ƥ���Դ���ť
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
