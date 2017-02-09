package com.hanfeng.chess.client;

import java.io.*;

import javax.swing.*;

public class configFileRW {
	private String configFilePath = "./config.ini";
	private File fe = null;
	private static int classs = 0;
	private static configFileRW cfg;
	private String[][] nowSettings = {
	{"AI"},
	{"on"}
	};
	
	private configFileRW() {
		
	}
	
	public static configFileRW getConfigFileRWClass() {
		if(classs == 0) {
			cfg = new configFileRW();
			return cfg;
		}else return cfg;
	}
	
	public void setFile(File f) {
		fe = f;
	}
	
	public String getConfigFilePath() {
		return this.configFilePath;
	}
	
	public String getSetting(String sn) {
		int i = 0;
		switch(sn) {
		case "AI" : i = 0;

		default : i = 0;
		}
		//读取数组
		return this.nowSettings[i][i];
	}
	
	public void setSetting(String sn,String sv) {
		int i = 0;
		switch(sn) {
		case "AI" : i = 0;

		default : i = 0;
		}
		//写入数组
		this.nowSettings[i][i] = sv;
	}
	
	public void readNowSetting() {
		//读取文件
	}
	
	public void writeNowSetting() {
		//写入文件
	}
	
	public void exitSavingFiles() {
		System.out.println("Saving files....");
		writeNowSetting();
		System.exit(0);
	}
	

}
