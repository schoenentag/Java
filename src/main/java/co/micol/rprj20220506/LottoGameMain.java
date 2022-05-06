package co.micol.rprj20220506;

import java.util.Scanner;

import co.micol.rprj20220506.lotto.*;

public class LottoGameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LottoGame lotto = new LottoGame();
		lotto.LottoGameStart();
		int count = Integer.parseInt(sc.nextLine());
		lotto.randomAdd(count);
		lotto.price(count);
		

	}

}
