/**
 * 
 */
package com.hanfeng.chess.client.view;

import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * @author HanFeng
 *
 */
public class SettingFrame extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public SettingFrame() throws HeadlessException {
		// TODO 自动生成的构造函数存根
		super("设置窗口");
	}

	/**
	 * @param gc
	 */
	public SettingFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public SettingFrame(String title) throws HeadlessException {
		super(title);
		// TODO 自动生成的构造函数存根
	}

	/**
	 * @param title
	 * @param gc
	 */
	public SettingFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO 自动生成的构造函数存根
	}
	
	public void init() {
		JCheckBox jck1 = new JCheckBox("AI设置");
		// JCheckBox jck2 = new JCheckBox("皮肤");
		Box box0 = new Box(BoxLayout.Y_AXIS);
		Box box1 = new Box(BoxLayout.Y_AXIS);
		Box box2 = new Box(BoxLayout.X_AXIS);
		JButton save = new JButton("保存");

		// 布局
		box2.add(Box.createHorizontalGlue());
		box2.add(save);
		box2.add(Box.createHorizontalGlue());

		box1.add(Box.createVerticalGlue());
		box1.add(jck1);
		// box1.add(jck2);
		box1.add(Box.createVerticalGlue());

		box0.add(box1);
		box0.add(box2);

		this.add(box0);
		this.setSize(new Dimension(150, 200));
		
	}

}
