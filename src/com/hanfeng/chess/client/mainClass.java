package com.hanfeng.chess.client;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class mainClass {
	public static boolean loginStates = false;
	
	public static void main(String[] args) {
		try {
			methodOfGame mfg = methodOfGame.creatMethodOfGameClass(null);
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		}catch(Exception e) {
				System.out.println("��ʼ��ʧ�ܣ�");
				e.printStackTrace();
		}
		//������¼����
		UI ui = new UI();
		//����һ��Socket
		//Socket serevrSocket = new Socket(127.0.0.1,80);

		JFrame jf = null;
		/*
		 * ���ﲹ��˵��һ��
		 * ����Ӧ���������磬�����ӷ�����
		 * ����������������֮��
		 * ����Socket����
		 * ���һ��һ��methodOfGame
		 * ����Socket����
		 * */
		
		try {
			jf = ui.creatLoginFrame();
		} catch(Throwable t) {
			JOptionPane.showMessageDialog(jf, "������¼����ʧ�ܣ���������������",  "����", JOptionPane.ERROR_MESSAGE);
			t.printStackTrace();
		}
		
		//�������ȴ���½���
		for(;!loginStates;) ;
		
		jf.setVisible(false);
		jf = null;
		
		//����ϵͳ����
		System.gc();
		
		//�����µĴ�������
		try {
			jf = ui.creatDFrame();
		}catch (Exception e) {
			JOptionPane.showMessageDialog(jf, "������������ʧ�ܣ���������������",  "����", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}

		
	}
		
		

}
