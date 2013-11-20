package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.GameProcess;

public class NPCBlock extends GUIBlock implements ActionListener{

	public NPCBlock(GameProcess gameProcess, int playerNum, int index) {
		super(gameProcess, playerNum, index);
		this.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gameProcess.getGameWndGUI().setEnable(GameWindow.CENTER, false);
		gameProcess.moveBlock(index);
	}
}
