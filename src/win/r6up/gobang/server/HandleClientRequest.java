package win.r6up.gobang.server;
import java.io.*;
import java.net.*;

public class HandleClientRequest implements Runnable {

	private InputStream in = null;
	private OutputStream ot = null;
	public final int LOGIN = 1;
	public final int IS_USER_EXIST = 2;
	public final int REGISTER = 3;
	public final int GAME = 4;
	
	public HandleClientRequest(Socket s) throws IOException {
		in = s.getInputStream();
		ot = s.getOutputStream();
	}
	
	public void run() {
		System.out.println("[INFO]有用户连接");
		try {
			phraseClientRequest();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String phraseClientRequest() throws Exception {
		byte[] h = new byte[1024];
		in.read(h);
		System.out.println(h.toString());
		return "";
	}
	

}
