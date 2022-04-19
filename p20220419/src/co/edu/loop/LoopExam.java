package co.edu.loop;

public class LoopExam {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i; // sum = sum + i
		}
		System.out.println("1~5의 합 : " + sum);
		// 초기값 sum = 0
		// 1) i = 1, 0 = 0 + 1; => sum = 1
		// 2) i = 2, 1 = 1 + 2; => sum = 3
		// 3) i = 3, 3 = 3 + 3; => sum = 6
		// 4) i = 4, 6 = 6 + 4; => sum = 10
		// 5) i = 5, 10 = 10 + 5; => sum = 15 ※ 출력값 : 15
		
		// 구구단
		for (int i = 2; i <= 9; i++) {
			System.out.printf("==== %d단 ====\n",i);
			for (int j = 1; j <=9; j++ ) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
		
		// 홀수 짝수 만들기
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i + " : 홀수");
			} else if (i % 2 == 0) {
				System.out.println(i + " : 짝수");
			}
		}
		
		System.out.println("1) ===== 별(*) 찍기 =====");
		for(int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2) ===== 역으로 별(*) 찍기 =====");
		for (int i = 1; i <= 5; i++ ) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3) ===== 공백처리로 별(*) 찍기=====");
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
				    System.out.print("*");
				}
			} 
			System.out.println();
		}
		System.out.println("3-2) ===== 공백처리로 별(*) 찍기=====");
			//	  *
			//   **
			//  ***
			// ****
			//*****


		System.out.println("\n...End of Prog...");
	}

}

