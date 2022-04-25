package algorithm;

public class Rank {
	public static void main(String[] args) {
		// ���� �˰��� : ������ ���������� ����� ���ϴ� ����
		// -> ���� �迭�� 1������ �ʱ�ȭ ���� ���� ��
		// -> �ݺ��ϸ鼭 ������ ū ������ ������ �� ������ 1����(ī��Ʈ)
		int[] score = { 90, 87, 100, 95, 80 };
		int[] rank = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < score.length; i++) {
			rank[i] = 1; // 1������ �ʱ�ȭ
			for (int j = 0; j < score.length; j++) { // ���ص����Ϳ� ������ ������ ��
				if (score[i] < score[j]) {
					rank[i]++; //count
				}
			}

		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + "�� : " + rank[i] + "��");
		}

	}

}
