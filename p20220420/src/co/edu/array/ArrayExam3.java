package co.edu.array;

public class ArrayExam3 {

	public static void main(String[] args) {
		// 1. 1~100까지 데이터를 넣은 배열에서 3의 배수만 출력

		int[] num = new int[100];
		// 배열에 값을 입력
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1; //
		}
		
//		for (int i = 1; i <= num.length; i++) {
//			num[i-1] = i;
//		} int 초기값을 1로 할 경우, 이렇게도 가능하다.
		
		System.out.println("1~100의 3의 배수 :");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				System.out.printf("%d ", num[i]);
			}
		}
			// 2. 3의 배수 중 짝수만 출력
			System.out.println("\n3의 배수 중 짝수 :");
			for (int j = 0; j < num.length; j++) {
				if (num[j] % 3 == 0 && num[j] % 2 == 0) {
					System.out.printf("%d ", num[j]);
				}
			}
			// 3. 1~100의 2의 배수
			System.out.println("\n1~100의 2의 배수 :");
			for (int j = 0; j < num.length; j++) {
				if (num[j] % 2 == 0) {
					System.out.printf("%d ", num[j]);
				}
			}
			
	}
}
