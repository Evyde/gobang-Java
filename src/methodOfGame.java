import java.net.Inet4Address;
import java.net.InetAddress;
import java.security.MessageDigest;

/**
 * �������һЩ������Ϸ�ķ���
 *
 */
public class methodOfGame {
	private InetAddress serverIPAddress;
	public String login() {
		setServerIPAddress(127.0.0.1);
	}
	public InetAddress getServerIPAddress() {
		return serverIPAddress;
	}
	public void setServerIPAddress(InetAddress serverIPAddress) {
		this.serverIPAddress = serverIPAddress;
	}
	/*
	 * ���ӷ���������
	 * �������ӷ�����
	 * */
	public void connectServer() throws Exception {
		
		
	}
	/*
	 * ��¼����
	 * ���ںͷ����������ж��û��������Ƿ���ȷ
	 * ���ҽ��û���״̬��Ϊ����
	 * */
	public void startLogin(String userName,String userPassword) throws Exception{
		String userInfo = new String(userName + "ThisIsAGameLogin_@" + userPassword);
		if(encryptMD5(userInfo.getBytes()).equals(getServerUserInfo("userName")));
	}
	
	private byte[] getServerUserInfo(String userName) {
		return userName.getBytes();
	}
	
	public static byte[] encryptMD5(byte[] data) throws Exception {
		//MD5���ܣ��ǳ��򵥡�
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(data);
		return md5.digest();

	}
}
