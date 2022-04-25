package array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		// 2차원 배열의 초기화
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int korTotal = 0, engTotal = 0, mathTotal = 0;

		System.out.printf(" 번호  국어  영어  수학  총점  평균\n");
		System.out.println("===============================");

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;

			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i + 1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("===============================");
		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
		
		// 2차원 배열의 초기화
		String[][] words = {
				{"chair", "의자"},
				{"Computer","컴퓨터"},
				{"integer","정수"}
		};
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			String tmp = sc.nextLine();
			
			if(tmp.equals((words[i][1]))){
				System.out.println("정답입니다.");
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", words[i][1]);
			}
		}

	}

}
