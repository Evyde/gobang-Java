package com.hanfeng.chess.client;
import java.security.MessageDigest;

/*
 * name��ʹ�÷�װ
 * passwordʹ��
 * ��ʱû��UID��AGE��SEX��Щ��Ϣ��������û���ΪΨһʶ�𷽷�
 * */
public class user {
	//�����㷨
	//���Ǹо��ڴ��δ�����©�������ܻᵼ���û�����й¶
	private static byte[] encryptUserPassword(String userPassword) throws Exception {
		//MD5���ܣ��ǳ��򵥡�
		String userInfo = new String("ThisIsAGameByHanFeng_@" + userPassword);
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(userInfo.getBytes());
		return md5.digest();

	} 
	public String name = "";
	
	private String password = "";
	
	public user(String userName) {
		this.name = userName;
	}
	
	//get�������Ѿ�����
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String userPassword) {
		try {
			this.password = encryptUserPassword(userPassword).toString();
		}catch(Exception e) {
			System.out.println("�ٵģ����ܶ�����");
			e.printStackTrace();
		}
	}
}
