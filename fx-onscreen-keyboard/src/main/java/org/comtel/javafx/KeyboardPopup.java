package org.comtel.javafx;

import org.comtel.javafx.robot.IRobot;

import javafx.stage.PopupWindow;

public class KeyboardPopup extends PopupWindow {

	private final KeyBoardPanel keyboard;

	public final KeyBoardPanel getKeyboard() {
		return keyboard;
	}

	public KeyboardPopup(String layerpath, IRobot robot) {
		this(new KeyBoardPanel(layerpath, robot));
	}

	public KeyboardPopup(KeyBoardPanel panel) {
		keyboard = panel;
		setAutoFix(true);
		getScene().setRoot(keyboard);
	}
}
