package com.hanfeng.chess.client;

import java.net.*;

/*
 * �����������
 * Ϊʲô���������ӣ�
 * ��ΪΨһʵ���������ֻ��methodOfGame��
 * �������Ѿ�����Ϊֻ��ʵ����һ��
 * ���Ը��಻����
 * ��������������
 * */

public class server {
	public server(InetAddress ip) {

	}
	/*
	 * ���ӷ���������
	 * �������ӷ�����
	 * */
	public void connectServer() throws Exception {
		
		
	}
	
	//��ȡ�û�����
	public byte[] getServerUserPassword(String uname) {
		return uname.getBytes();
	}
	
	//�ж��û��Ƿ���ڵķ��������ڷ���true
	private boolean isUserExist(String userName) {
		
		return false;
	}
	
	public InetAddress getServerIPAddress() {
		return null;
	}
}
