package first;

import java.util.Arrays;
import java.util.Scanner;

public class HW0527 {
	public static void main(String[] args) {
		// �־��� �迭�� �̿��Ͽ� ���� ������ �����ϼ���.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// ����1. �־��� �迭 �߿��� ���� 60�� ���� �ε����� ����غ���.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println("60�� ���� �ִ� �ε����� arr1[" + i + "]�Դϴ�.");
			}
		}

		// ����2. �־��� �迭�� �ε����� 3�� ���� ������� ����, �������� ����غ���.
		/*
		 * ��� 10 20 30 3 -3 ����.. for (int i = 0; i < arr1.length; i++) { if (i >= 3) {
		 * arr1[i] = arr1[i++]; } System.out.print(arr1[i] + " "); }
		 */
		for (int i = 0; i < arr1.length; i++) {
			if (i != 3) {
				System.out.print(arr1[i] + " ");
			}
			if (i == 3) {
				// System.out.print("");
			}
		}
		System.out.println();

		// ����3. �־��� �迭 ���� �����ϰ� ���� ���� �ε��� ��ȣ�� �Է¹޾�, �� ���� 1000���� �����غ���.
		// �Է�) �ε���: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ� ���� ���� �ε��� ��ȣ�� �Է��ϼ���. >>>");
		int chg = Integer.parseInt(sc.nextLine());
		arr1[chg] = 1000;
		System.out.println(Arrays.toString(arr1));

		// ����4. �־��� �迭�� ��ҿ��� �ִ밪�� �ּҰ��� ���غ���.
		int max = 0;
		int min = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("arr1�� �ִ밪 : " + max);
		System.out.println("arr1�� �ּҰ� : " + min);

		// ����5. ������ �迭�� �����Ͽ� ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���.
		int[] arr2 = new int[10];
		for (int i = 0; i < 10; i++) {
			try {
				System.out.printf("�迭 %d��° �� ������� �Է��ϼ���. >>>", i);
				int arrNum = Integer.parseInt(sc.nextLine());
				if (arrNum > 0) {
					arr2[i] = arrNum;
				} else {
					System.out.println("����� ���� �Է��ϼ���.");
					--i;
				}
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
				--i;
			}
		}
		System.out.println("�Է¹��� arr2 �迭 : "+Arrays.toString(arr2));
		System.out.println("�迭�� ���� 3�� ��� :" );
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] %3 == 0)
				System.out.print(arr2[i]+ " ");
		}
		

	}

}
