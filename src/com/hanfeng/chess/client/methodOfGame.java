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
	private static methodOfGame mf = null;
	private static int numOfmf = 0;
	private server s = null;

	private methodOfGame(InetAddress ip) {
		try {
			s = new server(ip);
		}catch(Exception e) {
			System.out.println("����������ʵ��ʧ�ܣ�");
			e.printStackTrace();
		}
	}
	
	public static methodOfGame creatMethodOfGameClass(InetAddress serverIP) throws Exception {
		if(numOfmf == 0) {
			if(serverIP != null) mf = new methodOfGame(serverIP);
			else mf = new methodOfGame(InetAddress.getLocalHost());
			numOfmf = 1;
			return mf;
		}else return mf;
	}
	
	public static methodOfGame getmog() {
		return mf;
		//ֱ��getһ�����Ƚϼ�
	}

	//ע�᷽������ע��һ��
	public boolean register(user u) throws gameException{
		//throw new gameException("�û�������");
		return true;
	}
	
	/*
	 * ��¼����
	 * ���ںͷ����������ж��û��������Ƿ���ȷ
	 * ���ҽ��û���״̬��Ϊ����
	 * */
	public void startLogin(user u) throws Exception{
		//throw new gameException("�û�������");
		//if(u.getPassword().equals(s.getServerUserPassword(u.name)));
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
