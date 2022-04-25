package array;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] stuArr = null;
		Student[] rank = null;
		int size;
		int studentNo;
		int count = 0;
		int menu;
		int putData = 0;
		Student temp = null;

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
				rank = new Student[size];

			} else if (menu == 2) {
				for (int i = 0; i < stuArr.length; i++) {

					System.out.println("�й��� �Է��ϼ���>>>");
					int no = Integer.parseInt(sc.nextLine());
					System.out.println("�̸��� �Է��ϼ���>>>");
					String studentName = sc.nextLine();
					System.out.println("���������� �Է��ϼ���>>>");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.println("���������� �Է��ϼ���>>>");
					int eng = Integer.parseInt(sc.nextLine());
					System.out.println("���������� �Է��ϼ���>>>");
					int math = Integer.parseInt(sc.nextLine());

					Student student = new Student(no, studentName, kor, eng, math);
					stuArr[i] = student;
					rank[i] = student;

					if (stuArr.length - 1 != 1) {
						System.out.println("===============");
					}

				}
			} else if (menu == 3) {

				System.out.println("�й��Է� >>>");
				studentNo = Integer.parseInt(sc.nextLine());

				for (Student student : stuArr) {
					if (student.getStudentNo() == studentNo) {
						count = student.info();
					}
				}
				if (count == 0) {
					System.out.println("�ش� �ϴ� �й��� �����ϴ�.");
				}
				count = 0;

			} else if (menu == 4) {
				System.out.println("���� >>>");
				// ��������
				for (int i = 0; i < rank.length; i++) {
					for (int j = i + 1; j < rank.length; j++) {
						if (rank[i].getAvg() < rank[j].getAvg()) { // �迭�� �ε��� ���� �ڽź��� ū �ε����� ������ ī��Ʈ
							temp = rank[i];
							rank[i] = rank[j];
							rank[j] = temp;
						}
					}
				}
				for (int i = 0; i < rank.length; i++) {
					System.out.println((i + 1) + "��> " + rank[i].getStudentName() + ", ��� > " + rank[i].getAvg());
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
