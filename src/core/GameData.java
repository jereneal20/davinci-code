package core;

import java.io.Serializable;
import java.util.ArrayList;

public class GameData implements Serializable {
	private static final long serialVersionUID = -6842226762193142274L;

	// 객체가 생성되면 바닥에 깔린 block 들과 각 player 들이 가지고 있는 block 들의 정보를 저장한다.
	private ArrayList<Block> floor; // 바닥에 깔려있는 block 들.
	private ArrayList<ArrayList<Block>> blocks; // 각 선수들이 가지고 있는 block 들.

	public GameData(Game game) {
		System.out.println("[ GameData : Constructor ]");
		ArrayList<Block> tmp;
		ArrayList<Boolean> boolTmp;
		floor = new ArrayList<Block>();
		for (int i = 0; i < game.getFloorBlocks().size(); i++)
			floor.add(game.getFloorBlocks().get(i));

		blocks = new ArrayList<ArrayList<Block>>();

		for (int i = 0; i < game.getPlayers().size(); i++) {
			tmp = new ArrayList<Block>();
			boolTmp = new ArrayList<Boolean>();

			for (int j = 0, size = game.getPlayers().get(i).hand.size(); j < size; j++) {
				tmp.add(game.getPlayers().get(i).hand.get(j));
				boolTmp.add(game.getPlayers().get(i).hand.get(j).isOpen());
			}
			blocks.add(tmp); // player 0,1,2,3 들이 가진 block( hand ) 들을 p 에 저장한다.
			System.out.println("플레이어 " + i + "의 데이터 전송" + boolTmp);
		}
		System.out
				.println("**************************************************");
	}

	public ArrayList<Block> getFloor() {
		return floor;
	}

	public ArrayList<ArrayList<Block>> getPlayers() {
		return blocks;
	}

	public ArrayList<Block> getBlocksOfPlayer(int index) {
		return blocks.get(index);
	}
}
