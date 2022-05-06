package co.micol.rprj20220506.baseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNum {
	// 1~9까지 서로 다른 임의의수 3개 생성하기
	public int randomMake() {
		Random random = new Random();
		return random.nextInt(9)+1; // 1~9까지 난수 
	}
	
	
	public List<Integer> create(){ // 컴퓨터가 랜덤값 3개 받아 ArrayList에 저장 // 중복X
		List<Integer> computerNumber = new ArrayList<>();
		while(computerNumber.size() < 3) {
			int randomNumber = randomMake();
			if(computerNumber.contains(randomNumber)) {
				continue;
			}else {
				computerNumber.add(randomNumber);
			}
		}return computerNumber;
	}
	
	

}
