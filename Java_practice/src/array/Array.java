package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// 배열의 초기화
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = i * 10 + 50;
			System.out.print(score[i] + " ");
		}
		System.out.println(score); // 배열을 가리키는 참조변수 score값이 출력된다(주소출력)

		// 배열의 활용(1) 총합과 평균
		int sum = 0;
		float average = 0f;

		int[] score2 = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score2[i]; // 반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더함
		}
		average = sum / (float) score.length;

		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);

		// 배열의 활용(2) 최대값과 최소값
		int[] score3 = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째값으로 초기화
		int min = score[0]; // 배열의 첫 번째값으로 초기화

		for (int i = 1; i < score3.length; i++) {// 배열의 두 번째 요소부터 읽이 위해 i값을 1로 초기화
			if (score3[i] > max) {
				max = score3[i]; // 만약 score[i]값이 max보다 크면 max에 대입
			} else if (score3[i] < min) {
				min = score3[i]; // 만약 score[i]값이 min보다 작으면 min에 대입
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		// 배열의 활용(3) 섞기
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			System.out.println(Arrays.toString(numArr));
		}

		// 배열의 활용(4) 로또 번호 만들기
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) // 배열의 각 요소에 1~45까지의 값을 저장
			ball[i] = i + 1; // ball[0]에 1이 저장

		int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수

		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		// 0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // 0~44범위의 임의의 값
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		// 배열 ball의 앞에서부터 6개의 요소를 출력한다
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}

}
