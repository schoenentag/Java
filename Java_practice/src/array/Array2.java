package array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		// 2���� �迭�� �ʱ�ȭ
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int korTotal = 0, engTotal = 0, mathTotal = 0;

		System.out.printf(" ��ȣ  ����  ����  ����  ����  ���\n");
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
		System.out.printf("���� : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
		
		// 2���� �迭�� �ʱ�ȭ
		String[][] words = {
				{"chair", "����"},
				{"Computer","��ǻ��"},
				{"integer","����"}
		};
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <words.length; i++) {
			System.out.printf("Q%d. %s�� ����?", i+1, words[i][0]);
			String tmp = sc.nextLine();
			
			if(tmp.equals((words[i][1]))){
				System.out.println("�����Դϴ�.");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.\n\n", words[i][1]);
			}
		}

	}

}
