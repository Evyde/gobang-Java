package com.hanfeng.chess.client;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;

/**
 * �������һЩ������Ϸ�ķ���
 * ���ȣ�������һ��������������ֻ��ʵ����һ��
 */
public class methodOfGame {
	private methodOfGame mf = null;
	private int numOfmf = 0;
	private server s = null;
	private methodOfGame(InetAddress ip) {
		try {
			s = new server(ip);
		}catch(Exception e) {
			System.out.println("����������ʵ��ʧ�ܣ�");
			e.printStackTrace();
		}
	}
	
	public methodOfGame creatMethodOfGameClass(InetAddress serverIP) throws Exception {
		if(numOfmf == 0) {
			if(serverIP != null) this.mf = new methodOfGame(serverIP);
			else this.mf = new methodOfGame(InetAddress.getLocalHost());
			numOfmf = 1;
			return mf;
		}else return mf;
	}

	//ע�᷽������ע��һ��
	public void register(user u) {
		
		
	}
	
	/*
	 * ��¼����
	 * ���ںͷ����������ж��û��������Ƿ���ȷ
	 * ���ҽ��û���״̬��Ϊ����
	 * */
	public void startLogin(user u) throws Exception{
		if(u.getPassword().equals(s.getServerUserPassword(u.name)));
	}
	
	/*
	 * ���̣�15��*15�ߣ�225����
	 * ������15��*15�У�225��
	 * ���û����ʱ������һ������
	 * �жϸ�����λ����һ�飬�ÿ��Ӧһ������
	 * Ȼ��������ӡ��߿����
	 * ������������
	 * */
}
