package com.hanfeng.chess.client;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.JTextComponent;

/*
 * 这里放置着许多关于UI的方法
 * 
 * 
 * 说明：为了简单，使用System.exit(0);关闭程序，虽然这可能会造成关闭JVM虚拟机所导致的
 * 其他程序的关闭
 * */


public class UI {
	/*
	 * 文本框获得焦点清空其内容类
	 * 实现FocusListener接口
	 * 无法使用Lambda表达式，故采取内部类方式
	 * */
	class clearText implements FocusListener {
		//声明一个J文本组件类型变量
		JTextComponent jt = null;
		//构造器
		public clearText(JTextComponent jtx) {
			jt = jtx;
		}
		//接口实现1
		public void focusGained(FocusEvent e) {
			jt.setText("");
		}
		//接口实现2
		public void focusLost(FocusEvent e) {
			;
		}
	}
	{
		//禁用皮肤自带按钮
		UIManager.put("RootPane.setupButtonVisible", false);
	}
	/*
	 * 登录窗口
	 * */
	public JFrame creatLoginFrame() throws Throwable {
		//创建变量
		JFrame jf = new JFrame("登录窗口");
		JButton loginB = new JButton("登录");
		JButton exitB = new JButton("退出");
		JButton registerB = new JButton("注册");
		JTextField text1 = new JTextField("用户名",1);
		JPasswordField text2 = new JPasswordField("密码",1);
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createVerticalBox();
		Box box3 = Box.createVerticalBox();
		JMenuBar loginBar = new JMenuBar();
		JMenu setting = new JMenu("选项");
		JMenuItem set = new JMenuItem("设置");
		JMenuItem about = new JMenuItem("关于");
		JMenuItem exit = new JMenuItem("退出");
		
		//throw new loginException();
		
		//处理菜单
		setting.add(set);
		setting.add(about);
		setting.add(exit);
		loginBar.add(setting);
		jf.setJMenuBar(loginBar);

		//布局
		box1.add(loginB);
		box1.add(Box.createHorizontalGlue());
		box1.add(registerB);
		box1.add(Box.createHorizontalGlue());
		box1.add(exitB);
		box2.add(text1);
		box2.add(text2);
		box3.add(box2);
		box3.add(box1);
		
		//事件监听
		text1.addFocusListener(new clearText(text1));
		text2.addFocusListener(new clearText(text2));
		loginB.addActionListener(e -> {
			User u = new User(text1.getText());
			u.setPassword(text2.getPassword().toString());
			try {
				MethodOfGame.getmog().startLogin(u);
				MainClass.loginStates = true;
				JOptionPane.showMessageDialog(jf, "登录成功！",  "成功", JOptionPane.INFORMATION_MESSAGE);
			}catch (GameException le) {
				JOptionPane.showMessageDialog(jf, le.getMessage(),  "错误", JOptionPane.ERROR_MESSAGE);
			}catch (Exception e1) {
				System.out.println("尝试登录失败");
				e1.printStackTrace();
			}
			System.out.println("Start login......");
			
		});
		exitB.addActionListener(e -> {
			System.out.println("Program will exit.");
			ConfigFileRW.getConfigFileRWClass().exitSavingFiles();
		});
		registerB.addActionListener(e -> {
			User u = new User(text1.getText());
			u.setPassword(text2.getPassword().toString());
			if(Server.isUserExist(u.name)) {
				try {
					MethodOfGame.getmog().register(u);
					JOptionPane.showMessageDialog(jf, "注册成功","成功", JOptionPane.INFORMATION_MESSAGE);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(jf,e1.getMessage(),"错误", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}else JOptionPane.showMessageDialog(jf,"用户名非法","错误", JOptionPane.ERROR_MESSAGE);
		});
		about.addActionListener(e -> {
			JOptionPane.showMessageDialog(jf, "版权所有"
					+ "©\n作者：韩枫"
					+ "\n日期：2017年2月"
					+ "\n一个联网的图形化五子棋游戏"
					+ "\n说明：本程序皮肤来自网络，作者说明可用于一切用途，若有侵权可联系我删除"
					+ "\n邮箱：life.app.hanfeng@hotmail.com","关于", JOptionPane.INFORMATION_MESSAGE);
		});
		exit.addActionListener(e -> {
			System.out.println("Program will exit.");
			ConfigFileRW.getConfigFileRWClass().exitSavingFiles();
		});
		set.addActionListener(e -> {
			JFrame setjf = this.creatSettingFrame();
			setjf.setVisible(true);
		});
		
		//窗口设置
		text1.setHorizontalAlignment(JTextField.CENTER);	//设置文字居中
		text2.setHorizontalAlignment(JPasswordField.CENTER);
		jf.setSize(500,200);	//大小
		jf.setLocationRelativeTo(null);	//居中
		jf.add(box3);	//加入盒子布局
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//设置“X”键的作用为关闭
		jf.setResizable(false);	//设置禁止缩放
		return jf;
	}
	
	/*
	 * 大厅窗口
	 * 绘制一些桌子，桌子数从服务器读取
	 * 还有座位，每个桌子两个座位
	 * */
	public JFrame creatDFrame() throws Exception{
		JFrame jf = new JFrame("大厅");
		JLabel jl = new JLabel("test");
		JMenuBar loginBar = new JMenuBar();
		JMenu setting = new JMenu("选项");
		JMenuItem set = new JMenuItem("设置");
		JMenuItem about = new JMenuItem("关于");
		JMenuItem exit = new JMenuItem("退出");
		
		//处理菜单
		setting.add(set);
		setting.add(about);
		setting.add(exit);
		loginBar.add(setting);
		jf.setJMenuBar(loginBar);
		
		 
		//菜单事件
		about.addActionListener(e -> {
			JOptionPane.showMessageDialog(jf, "版权所有"
					+ "©\n作者：韩枫"
					+ "\n日期：2017年2月"
					+ "\n一个联网的图形化五子棋游戏"
					+ "\n说明：本程序皮肤来自网络，作者说明可用于一切用途，若有侵权可联系我删除"
					+ "\n邮箱：life.app.hanfeng@hotmail.com","关于", JOptionPane.INFORMATION_MESSAGE);
		});
		exit.addActionListener(e -> {
			System.out.println("Program will exit.");
			ConfigFileRW.getConfigFileRWClass().exitSavingFiles();
		});
		set.addActionListener(e -> {
			JFrame setjf = this.creatSettingFrame();
			setjf.setVisible(true);
		});
		
		jf.add(jl);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setSize(new Dimension(800,800));
		
		return jf;
	}
	
	/*
	 * 游戏窗口
	 * 绘制一个棋盘，还要有棋子
	 * 当然游戏窗口要重写repaint方法，所以
	 * */
	public static class gameFrame extends JFrame {
		public gameFrame() {
			super("游戏窗口");
		}
		
		//color:0为白色，非0黑色
		public void repaint(int x,int y,int color) {
			JLabel jlb = new JLabel();
			super.repaint();
		}
	}
	
	/*
	 * 设置窗口
	 * */
	public JFrame creatSettingFrame() {
		JFrame jf = new JFrame("设置");
		JCheckBox jck1 = new JCheckBox("AI设置");
		//JCheckBox jck2 = new JCheckBox("皮肤");
		Box box0 = new Box(BoxLayout.Y_AXIS);
		Box box1 = new Box(BoxLayout.Y_AXIS);
		Box box2 = new Box(BoxLayout.X_AXIS);
		JButton save = new JButton("保存");
		
		//布局
		box2.add(Box.createHorizontalGlue());
		box2.add(save);
		box2.add(Box.createHorizontalGlue());
		
		box1.add(Box.createVerticalGlue());
		box1.add(jck1);
		//box1.add(jck2);
		box1.add(Box.createVerticalGlue());
		
		box0.add(box1);
		box0.add(box2);

		jf.add(box0);
		jf.setSize(new Dimension(150,200));
		
		//事件
		save.addActionListener(e -> {
			String set = "on";
			if(!jck1.isSelected()) {
				set = "off";
			}
			ConfigFileRW.getConfigFileRWClass().setSetting("AI", set);
			new settingFrameListener(jf).windowClosing(null);
		});
		jf.addWindowListener(new settingFrameListener(jf));
		
		jf.setLocationRelativeTo(null);	//居中
		jf.setResizable(false);

		
		return jf;
	}
	
	/*
	 * 设置窗口监听类
	 * */
	public class settingFrameListener implements WindowListener {
		JFrame j = null;
		public settingFrameListener(JFrame jf) {
			j = jf;
		}
		public void windowOpened(WindowEvent e) {}
		public void windowClosing(WindowEvent e) {
			j.setVisible(false);
			j.dispose();
			j = null;
			System.gc();
		}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}
}
