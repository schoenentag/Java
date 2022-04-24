package algorithm;

public class Rank {
	public static void main(String[] args) {
		// 순위 알고리즘 : 지정한 범위내에서 등수를 구하는 로직
		// -> 순위 배열을 1등으로 초기화 시켜 놓은 후
		// -> 반복하면서 나보다 큰 점수가 나오면 내 순위를 1증가(카운트)
		int[] score = { 90, 87, 100, 95, 80 };
		int[] rank = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < score.length; i++) {
			rank[i] = 1; // 1등으로 초기화
			for (int j = 0; j < score.length; j++) { // 기준데이터와 나머지 데이터 비교
				if (score[i] < score[j]) {
					rank[i]++; //count
				}
			}

		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + "점 : " + rank[i] + "등");
		}

	}

}
