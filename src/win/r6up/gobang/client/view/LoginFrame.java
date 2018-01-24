/**
 * 
 */
package win.r6up.gobang.client.view;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author HanFeng
 *
 */
public class LoginFrame extends JFrame {

	/**
	 * @throws HeadlessException
	 */
	public LoginFrame() throws HeadlessException {
		// TODO �Զ����ɵĹ��캯�����
		super("��¼");
	}

	/**
	 * @param gc
	 */
	public LoginFrame(GraphicsConfiguration gc) {
		super(gc);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public LoginFrame(String title) throws HeadlessException {
		super(title);
		// TODO �Զ����ɵĹ��캯�����
	}

	/**
	 * @param title
	 * @param gc
	 */
	public LoginFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public void init() {
		// ��������
		JButton loginB = new JButton("��¼");
		JButton exitB = new JButton("�˳�");
		JButton registerB = new JButton("ע��");
		JTextField text1 = new JTextField("�û���", 1);
		JPasswordField text2 = new JPasswordField("����", 1);
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createVerticalBox();
		Box box3 = Box.createVerticalBox();
		JMenuBar loginBar = new JMenuBar();
		JMenu setting = new JMenu("ѡ��");
		JMenuItem set = new JMenuItem("����");
		JMenuItem about = new JMenuItem("����");
		JMenuItem exit = new JMenuItem("�˳�");

		// throw new loginException();

		// ����˵�
		setting.add(set);
		setting.add(about);
		setting.add(exit);
		loginBar.add(setting);
		this.setJMenuBar(loginBar);

		// ����
		box1.add(loginB);
		box1.add(Box.createHorizontalGlue());
		box1.add(registerB);
		box1.add(Box.createHorizontalGlue());
		box1.add(exitB);
		box2.add(text1);
		box2.add(text2);
		box3.add(box2);
		box3.add(box1);
		text1.setHorizontalAlignment(JTextField.CENTER); // �������־���
		text2.setHorizontalAlignment(JPasswordField.CENTER);
		this.setSize(500, 200); // ��С
		this.setLocationRelativeTo(null); // ����
		this.add(box3); // ������Ӳ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���á�X����������Ϊ�ر�
		this.setResizable(false); // ���ý�ֹ����
	}

}
