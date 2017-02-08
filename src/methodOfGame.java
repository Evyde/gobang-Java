import java.net.Inet4Address;
import java.net.InetAddress;
import java.security.MessageDigest;

/**
 * 这里放着一些关于游戏的方法
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
	 * 连接服务器方法
	 * 用于连接服务器
	 * */
	public void connectServer() throws Exception {
		
		
	}
	/*
	 * 登录方法
	 * 用于和服务器交互判断用户名密码是否正确
	 * 并且将用户的状态置为在线
	 * */
	public void startLogin(String userName,String userPassword) throws Exception{
		String userInfo = new String(userName + "ThisIsAGameLogin_@" + userPassword);
		if(encryptMD5(userInfo.getBytes()).equals(getServerUserInfo("userName")));
	}
	
	private byte[] getServerUserInfo(String userName) {
		return userName.getBytes();
	}
	
	public static byte[] encryptMD5(byte[] data) throws Exception {
		//MD5加密，非常简单。
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(data);
		return md5.digest();

	}
}
