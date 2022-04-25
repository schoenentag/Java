package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// �迭�� �ʱ�ȭ
		int[] score = new int[5];
		for (int i = 0; i < score.length; i++) {
			score[i] = i * 10 + 50;
			System.out.print(score[i] + " ");
		}
		System.out.println(score); // �迭�� ����Ű�� �������� score���� ��µȴ�(�ּ����)

		// �迭�� Ȱ��(1) ���հ� ���
		int sum = 0;
		float average = 0f;

		int[] score2 = { 100, 88, 100, 100, 90 };

		for (int i = 0; i < score.length; i++) {
			sum += score2[i]; // �ݺ����� �̿��ؼ� �迭�� ����Ǿ� �ִ� ������ ��� ����
		}
		average = sum / (float) score.length;

		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);

		// �迭�� Ȱ��(2) �ִ밪�� �ּҰ�
		int[] score3 = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // �迭�� ù ��°������ �ʱ�ȭ
		int min = score[0]; // �迭�� ù ��°������ �ʱ�ȭ

		for (int i = 1; i < score3.length; i++) {// �迭�� �� ��° ��Һ��� ���� ���� i���� 1�� �ʱ�ȭ
			if (score3[i] > max) {
				max = score3[i]; // ���� score[i]���� max���� ũ�� max�� ����
			} else if (score3[i] < min) {
				min = score3[i]; // ���� score[i]���� min���� ������ min�� ����
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

		// �迭�� Ȱ��(3) ����
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			System.out.println(Arrays.toString(numArr));
		}

		// �迭�� Ȱ��(4) �ζ� ��ȣ �����
		int[] ball = new int[45];
		for (int i = 0; i < ball.length; i++) // �迭�� �� ��ҿ� 1~45������ ���� ����
			ball[i] = i + 1; // ball[0]�� 1�� ����

		int tmp = 0; // �� ���� �ٲٴµ� ����� �ӽú���
		int j = 0; // ������ ���� �� ������ ����

		// �迭�� i��° ��ҿ� ������ ��ҿ� ����� ���� ���� �ٲ㼭 ���� ���´�.
		// 0��°���� 5��° ��ұ��� ��� 6���� �ٲ۴�.
		for (int i = 0; i < 6; i++) {
			j = (int) (Math.random() * 45); // 0~44������ ������ ��
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		// �迭 ball�� �տ������� 6���� ��Ҹ� ����Ѵ�
		for (int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
	}

}
