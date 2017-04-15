/**
 * 
 */
package com.hanfeng.chess.client.view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author HanFeng
 *
 */
public class LoginFrame extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public LoginFrame() throws HeadlessException {
		// TODO 自动生成的构造函数存根
		super("登录");
	}

	/**
	 * @param gc
	 */
	public LoginFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public LoginFrame(String title) throws HeadlessException {
		super(title);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param title
	 * @param gc
	 */
	public LoginFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO 自动生成的构造函数存根
	}
	
	public void init() {
		// 创建变量
		JButton loginB = new JButton("登录");
		JButton exitB = new JButton("退出");
		JButton registerB = new JButton("注册");
		JTextField text1 = new JTextField("用户名", 1);
		JPasswordField text2 = new JPasswordField("密码", 1);
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createVerticalBox();
		Box box3 = Box.createVerticalBox();
		JMenuBar loginBar = new JMenuBar();
		JMenu setting = new JMenu("选项");
		JMenuItem set = new JMenuItem("设置");
		JMenuItem about = new JMenuItem("关于");
		JMenuItem exit = new JMenuItem("退出");

		// throw new loginException();

		// 处理菜单
		setting.add(set);
		setting.add(about);
		setting.add(exit);
		loginBar.add(setting);
		this.setJMenuBar(loginBar);

		// 布局
		box1.add(loginB);
		box1.add(Box.createHorizontalGlue());
		box1.add(registerB);
		box1.add(Box.createHorizontalGlue());
		box1.add(exitB);
		box2.add(text1);
		box2.add(text2);
		box3.add(box2);
		box3.add(box1);
		text1.setHorizontalAlignment(JTextField.CENTER); // 设置文字居中
		text2.setHorizontalAlignment(JPasswordField.CENTER);
		this.setSize(500, 200); // 大小
		this.setLocationRelativeTo(null); // 居中
		this.add(box3); // 加入盒子布局
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置“X”键的作用为关闭
		this.setResizable(false); // 设置禁止缩放
	}

}
