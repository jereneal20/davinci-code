package gui.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import core.GameProcess;

public class StartButtonListener implements ActionListener {
	private GameProcess gameProcess;

	public StartButtonListener(GameProcess gameProcess) {
		this.gameProcess = gameProcess;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		gameProcess.start();
	}

}
