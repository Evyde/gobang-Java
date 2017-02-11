package com.hanfeng.chess.server;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

	private static int maxUsers = 3;
	private static int defaultPort = 23232;
	public static boolean connectAble = true;
	
	public static void main(String[] args) {
		int port = (args.length>0)?Integer.parseInt(args[0]):defaultPort;
		try {
			ServerSocket ss = new ServerSocket(port);
			System.out.println("[INFO]服务启动，在["+port+"]端口。");
			System.out.println("[INFO]当前最大用户数："+maxUsers);
			/*
			 * 创建一个线程池，这样会省去很多麻烦
			 * 不需要判断当前运行线程数和最大用户数的关系
			 * 线程池如果加入的线程超过规定的话其余线程会等待
			 */
			ExecutorService threadPool = Executors.newFixedThreadPool(maxUsers);
			while(true) {
				Socket clients = ss.accept();
				//maxUsers用户同时在线					
				threadPool.submit(new HandleClientRequest(clients));
				System.out.println("[INFO]当前已连接用户数："+Thread.currentThread().getThreadGroup().activeCount());
			}
		}catch(Exception e) {
			System.out.println("[ERR ]尝试重启程序。");
			e.printStackTrace();
		}

	}

}
