package win.r6up.gobang.client.view;

import javax.swing.UIManager;

public abstract class UI {
	public UI() {
		// ����Ƥ���Դ���ť
		UIManager.put("RootPane.setupButtonVisible", false);
	}
}
