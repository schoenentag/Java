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
			System.out.println(" 1.학생수 | 2.학생정보입력 | 3.학생정보출력 | 4.순위 |5.종료");
			System.out.println("====================================================");
			System.out.println("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				
				System.out.println("학생수를 입력하십시오. >>>");
				size = Integer.parseInt(sc.nextLine());
				stuArr = new Student[size];
				
			} else if (menu == 2) {
				for (int i = 0; i < stuArr.length; i++) {

					System.out.println("학번을 입력하세요>>>");
					int studentNo = Integer.parseInt(sc.nextLine());
					System.out.println("이름을 입력하세요>>>");
					String studentName = sc.nextLine();
					System.out.println("국어점수를 입력하세요>>>");
					int kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어점수를 입력하세요>>>");
					int eng = Integer.parseInt(sc.nextLine());
					System.out.println("수학점수를 입력하세요>>>");
					int math = Integer.parseInt(sc.nextLine());

					stuArr[i] = new Student(studentNo, studentName, kor, eng, math);
				} 
			} else if (menu == 3) {
				
				for (int i = 0; i < stuArr.length; i++) {
				stuArr[i].info();
				System.out.println("평균 : "+ stuArr[i].avg());
				System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*");
				}

			} else if (menu == 4) {
				
				int[] avgArr = null;
				int rank = 1;
				
				for (int i = 0; i < stuArr.length; i++) {
					avgArr[i] += stuArr[i].avg(); // 평균값이 avgArr에 들어가게 하기...
				} 
				for (int i = 0; i <avgArr.length; i++) {
					for (int j = 0; j < avgArr.length; j++) {
						if(avgArr[i] <avgArr[j]) { // 배열의 인덱스 별로 자신보다 큰 인덱스의 개수를 카운트
							rank++;
						}
						System.out.println(avgArr[i]+"점 : " +rank+"등");
						rank=1;
					}
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
