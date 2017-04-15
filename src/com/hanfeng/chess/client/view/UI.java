package com.hanfeng.chess.client.view;

import javax.swing.UIManager;

public abstract class UI {
	public UI() {
		// 禁用皮肤自带按钮
		UIManager.put("RootPane.setupButtonVisible", false);
	}
}
