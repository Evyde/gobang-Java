import java.net.Socket;

import javax.swing.JFrame;

public class mainClass {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch(Exception e) {
			System.out.println("Ƥ������ʧ�ܣ���ʹ��Ĭ��Ƥ����");
			e.printStackTrace();
		}
		/*
		 * ���ﲹ��˵��һ��
		 * ����Ӧ���������磬�����ӷ�����
		 * ����������������֮��
		 * ����Socket����
		 * ����newһ��methodOfGame
		 * ����Socket����
		 * */
		
		//������¼����
		UI ui = new UI();
		//����һ��Socket
		Socket serevrSocket = new Socket(127.0.0.1,80);
		JFrame jf = null;
		try {
			jf = ui.creatLoginFrame();
		} catch(Throwable t) {
			System.out.println("������¼����ʧ�ܣ���������������");
			t.printStackTrace();
		}
		
	}
		
		

}
