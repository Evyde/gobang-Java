package com.hanfeng.chess.server;
import java.io.*;
import java.net.*;

public class HandleClientRequest implements Runnable {

	private InputStream in = null;
	private OutputStream ot = null;
	public HandleClientRequest(Socket s) throws IOException {
		in = s.getInputStream();
		ot = s.getOutputStream();
	}
	
	public void run() {
		System.out.println("[INFO]有用户连接");
	}
	
	public String phraseClientRequest() {
		in.read(b)
		return "";
	}
	

}
