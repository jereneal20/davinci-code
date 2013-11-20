package gui.listeners;

import gui.GameWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import network.Network;

public class StartButtonListener implements ActionListener {
	private Network network;
	private GameWindow gameWndGUI;

	public StartButtonListener(Network network, GameWindow gameWndGUI) {
		this.network = network;
		this.gameWndGUI = gameWndGUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		network.SendChatMsg("게임을 새로 시작합니다.");
		// TODO 클라이언트들의 현재 상태를 종료한 후 새로 시작해야 한다.
		gameWndGUI.start();
	}

}
