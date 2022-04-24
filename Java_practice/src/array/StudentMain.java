package array;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size;
		int menu = 0;
		Student[] stuArr = null;

		while (true) {
			System.out.println("====================================================");
			System.out.println(" 1.�л��� | 2.�л������Է� | 3.�л�������� | 4.���� |5.����");
			System.out.println("====================================================");
			System.out.println("���� >>>");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				
				System.out.println("�л����� �Է��Ͻʽÿ�. >>>");
				size = Integer.parseInt(sc.nextLine());
				stuArr = new Student[size];
				
			} else if (menu == 2) {
				for (int i = 0; i < stuArr.length; i++) {

					System.out.println("�й��� �Է��ϼ���>>>");
					int studentNo = Integer.parseInt(sc.nextLine());
					System.out.println("�̸��� �Է��ϼ���>>>");
					String studentName = sc.nextLine();
					System.out.println("���������� �Է��ϼ���>>>");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.println("���������� �Է��ϼ���>>>");
					int eng = Integer.parseInt(sc.nextLine());
					System.out.println("���������� �Է��ϼ���>>>");
					int math = Integer.parseInt(sc.nextLine());

					stuArr[i] = new Student(studentNo, studentName, kor, eng, math);
				} 
			} else if (menu == 3) {
				
				for (int i = 0; i < stuArr.length; i++) {
				stuArr[i].info();
				System.out.println("��� : "+ stuArr[i].avg());
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*");
				}

			} else if (menu == 4) {
				
				int[] avgArr = null;
				int rank = 1;
				
				for (int i = 0; i < stuArr.length; i++) {
					avgArr[i] += stuArr[i].avg(); // ��հ��� avgArr�� ���� �ϱ�...
				} 
				for (int i = 0; i <avgArr.length; i++) {
					for (int j = 0; j < avgArr.length; j++) {
						if(avgArr[i] <avgArr[j]) { // �迭�� �ε��� ���� �ڽź��� ū �ε����� ������ ī��Ʈ
							rank++;
						}
						System.out.println(avgArr[i]+"�� : " +rank+"��");
						rank=1;
					}
				}

			} else if (menu == 5) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� ���Դϴ�.");
			}
		}

	}

}
