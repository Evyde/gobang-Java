/**
 * 
 * 
 * */
package com.hanfeng.chess.client.module;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.hanfeng.chess.client.module.exception.EncryptException;

/*
 * name不使用封装
 * password使用
 * 暂时没有UID，AGE，SEX这些信息，用户名为唯一识别方法
 * */
public class User {
	public String name = "";	
	private String password = "";
	//加密算法
	//但是感觉在传参处存在漏洞，可能会导致用户密码泄露
	private static byte[] encryptUserPassword(String userPassword) throws EncryptException {
		//MD5加密，非常简单。
		String userInfo = new String("ThisIsAGameByHanFeng_@" + userPassword);
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
			md5.update(userInfo.getBytes());
		} catch (NoSuchAlgorithmException e) {
			// TODO 自动生成的 catch 块
			md5 = null;
			e.printStackTrace();
			throw new EncryptException("用户密码加密错误！");			
		}
		md5.update(userInfo.getBytes());
		return md5.digest();
		

	} 
	
	
	public User(String userName) {
		this.name = userName;
	}
	
	//get的密码已经加密
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String userPassword) {
		try {
			this.password = encryptUserPassword(userPassword).toString();
		}catch(EncryptException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
