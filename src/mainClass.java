import java.net.Socket;

import javax.swing.JFrame;

public class mainClass {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch(Exception e) {
			System.out.println("皮肤加载失败，将使用默认皮肤。");
			e.printStackTrace();
		}
		/*
		 * 这里补充说明一下
		 * 首先应当连接网络，即连接服务器
		 * 获得与服务器的连接之后
		 * 将此Socket保存
		 * 并且new一个methodOfGame
		 * 将此Socket传入
		 * */
		
		//创建登录界面
		UI ui = new UI();
		//创建一个Socket
		Socket serevrSocket = new Socket(127.0.0.1,80);
		JFrame jf = null;
		try {
			jf = ui.creatLoginFrame();
		} catch(Throwable t) {
			System.out.println("创建登录窗口失败，请重新启动程序！");
			t.printStackTrace();
		}
		
	}
		
		

}
