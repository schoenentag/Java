package co.edu.array;

public class ArrayExam {

	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / 3;
		System.out.printf("평균 : %.2f\n", avg);

		// 최대, 최소값 구하기
		int[] ary2 = {5, 3, 2, 8, 1};
		int max = 0;
		int min = ary2[0]; // 0보다 작은게 없기때문에 초기값으로 ary2[0]번째값을 넣음
		for (int i = 0; i <ary2.length; i++) {
		// 최대값
			if(max < ary2[i]) {
				max = ary2[i];
			}
	    // 최소값
			if(min > ary2[i]) {
				min = ary2[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
