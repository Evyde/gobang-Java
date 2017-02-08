import javax.swing.*;

/*
 * ���������������UI�ķ���
 * 
 * */


public class UI {
	{
		//����Ƥ���Դ���ť
		UIManager.put("RootPane.setupButtonVisible", false);
	}
	/*
	 * ��¼����
	 * */
	public JFrame creatLoginFrame() throws Throwable {
		//��������
		JFrame jf = new JFrame("��¼����");
		JButton loginB = new JButton("��¼");
		JButton exitB = new JButton("�˳�");
		JTextField text1 = new JTextField("�û���",1);
		JPasswordField text2 = new JPasswordField("����",1);
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createVerticalBox();
		Box box3 = Box.createVerticalBox();
		JMenuBar loginBar = new JMenuBar();
		JMenu setting = new JMenu("ѡ��");
		JMenuItem about = new JMenuItem("����");
		JMenuItem exit = new JMenuItem("�˳�");
		
		//����˵�
		setting.add(about);
		setting.add(exit);
		loginBar.add(setting);
		jf.setJMenuBar(loginBar);

		//����
		box1.add(loginB);
		box1.add(Box.createHorizontalGlue());
		box1.add(exitB);
		box2.add(text1);
		box2.add(text2);
		box3.add(box2);
		box3.add(box1);
		
		//�¼�����
		loginB.addActionListener((e) -> {
			;
		});
		exitB.addActionListener((e) -> {
			System.exit(0);
		});
		
		//��������
		jf.setSize(500,200);	//��С
		jf.setLocationRelativeTo(null);	//����
		jf.add(box3);	//������Ӳ���
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���á�X����������Ϊ�ر�
		jf.setResizable(false);	//���ý�ֹ����
		jf.setVisible(true);	//���ô��ڿɼ�
		return jf;
	}
}
