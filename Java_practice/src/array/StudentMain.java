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
			System.out.println(" 1.학생수 | 2.학생정보입력 | 3.학생정보출력 | 4.순위 |5.종료");
			System.out.println("====================================================");
			System.out.println("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {

				System.out.println("학생수를 입력하십시오. >>>");
				size = Integer.parseInt(sc.nextLine());
				stuArr = new Student[size];
				rank = new Student[size];

			} else if (menu == 2) {
				for (int i = 0; i < stuArr.length; i++) {

					System.out.println("학번을 입력하세요>>>");
					int no = Integer.parseInt(sc.nextLine());
					System.out.println("이름을 입력하세요>>>");
					String studentName = sc.nextLine();
					System.out.println("국어점수를 입력하세요>>>");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어점수를 입력하세요>>>");
					int eng = Integer.parseInt(sc.nextLine());
					System.out.println("수학점수를 입력하세요>>>");
					int math = Integer.parseInt(sc.nextLine());

					Student student = new Student(no, studentName, kor, eng, math);
					stuArr[i] = student;
					rank[i] = student;

					if (stuArr.length - 1 != 1) {
						System.out.println("===============");
					}

				}
			} else if (menu == 3) {

				System.out.println("학번입력 >>>");
				studentNo = Integer.parseInt(sc.nextLine());

				for (Student student : stuArr) {
					if (student.getStudentNo() == studentNo) {
						count = student.info();
					}
				}
				if (count == 0) {
					System.out.println("해당 하는 학번이 없습니다.");
				}
				count = 0;

			} else if (menu == 4) {
				System.out.println("순위 >>>");
				// 오름차순
				for (int i = 0; i < rank.length; i++) {
					for (int j = i + 1; j < rank.length; j++) {
						if (rank[i].getAvg() < rank[j].getAvg()) { // 배열의 인덱스 별로 자신보다 큰 인덱스의 개수를 카운트
							temp = rank[i];
							rank[i] = rank[j];
							rank[j] = temp;
						}
					}
				}
				for (int i = 0; i < rank.length; i++) {
					System.out.println((i + 1) + "등> " + rank[i].getStudentName() + ", 평균 > " + rank[i].getAvg());
				}

			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 값입니다.");
			}
		}

	}

}
