package co.micol.rprj20220506.baseballGame;

import java.util.List;

public class Compare {
	// 컴퓨터와 플레이어의 수(3자리) 비교

	public int howMany(List<Integer> computer, List<Integer> player) {
		int result = 0;
		for (int i = 0; i < player.size(); i++) {
			if (computer.contains(player.get(i))) { // .contains()리스트 안에 어떤 객체 있는지 확인
				result += 1;
			}
		}
		return result;
	}

	public int countStrike(List<Integer> computer, List<Integer> player) {
		int strike = 0;
		for (int i = 0; i < player.size(); i++) {
			if (computer.get(i) == player.get(i)) {
				strike += 1;
			}
		}
		return strike;
	}
	
}
