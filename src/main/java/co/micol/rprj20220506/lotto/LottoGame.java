package co.micol.rprj20220506.lotto;

import java.util.*;

public class LottoGame {
	// Lotto Game 만들기
	private int count; // 게임 횟수 입력
	private int random; // 랜덤값 1~45 / 중복값 제거 / 오름차순
	private int price = 1000; // 한 장 당 로또 금액
	private int totalPrice; // 로또 합계
	private int[][] lottoArr;

	public LottoGame() {
	}

	public void LottoGameStart() {
		System.out.println("Lotto Game을 시작합니다.");
		System.out.println("원하시는 횟수를 입력하세요. >>>");
		// Scanner sc = new Scanner(System.in);
		// count = Integer.parseInt(sc.nextLine());
	}

	public void randomAdd(int count) {
		lottoArr = new int[count][6];
		// 입력한 횟수만큼 반복
		// 중복값 제거
		for (int i = 0; i < count; i++) { // 전체 게임 수
			for (int j = 0; j < 6; j++) { // 한 게임 생성
				random = (int) (Math.random() * 45) + 1;
//				System.out.print(random + " ");
//				System.out.println();
				lottoArr[i][j] = random;
				if (j != 0) { // 자기 자신과 비교하지 않기 위해 코드를 넣었음
					for (int k = 0; k < j; k++) { // 중복확인
						if (lottoArr[i][k] == lottoArr[i][j]) {
							j--;
						}
					}
				}
			}
			Arrays.sort(lottoArr[i]); // 한게임 오름차순
			// 전체게임 종료
		}
		info(lottoArr);
	}

	public void info(int[][] array) {
		// 만약에 count가 5개 초과한다면, ========== 출력
		int line = 1;
		System.out.println("=====================");
		for (int[] lottoArrays : lottoArr) { // 한행을 읽어서 lottoArrays에 대입
			for(int n : lottoArrays) { // 배열을 정수로 읽어 저장
				System.out.print(n+ " ");
			}
			if (line %5 == 0) { // 출력된 라인수가 5인지 비교
				System.out.println();
				System.out.println("=====================");
				line = 1;
			}else {
				line++;
				System.out.println();
			}
		}
		//System.out.println("=====================");
	}


	public void price(int count) {
		totalPrice = price * count;
		System.out.println("금액은 " + totalPrice + "원 입니다.");

	}

}
