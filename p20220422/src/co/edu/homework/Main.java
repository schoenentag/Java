package co.edu.homework;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		int menu = 0;
		Student[] stu_arr = null;
		//Student[][] stu_arr = null;
	
		

		Student st = new Student();
		
		while(true) {
			System.out.println("====================================================");
			System.out.println(" 1.학생수 | 2.학생정보입력 | 3.학생정보출력 | 4.순위 |5.종료");
			System.out.println("====================================================");
			System.out.println("선택 >>>");
			
			if (menu == 1) {
				System.out.println("학생수를 입력하십시오. >>>");
				size = Integer.parseInt(sc.nextLine());
				stu_arr = new Student [size][5];
			} else if(menu == 2) {
				for (int i = 0; i < stu_arr.length; i++) {
					
						System.out.println(stu_arr[i][j]);
						//System.out.println("학번을 입력하세요>>>");
						//stu_arr[i][j] = Integer.parseInt(sc.nextLine());
						//stu_arr[i][j] = Integer.parseInt(sc.nextLine());
						//System.out.println("학번을 입력하세요>>>");
					
					}
		
					
				}
				
			} else if(menu == 3) {
				
			} else if (menu == 4) {
				
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 값입니다.");
			}
		}
		
		

	}

}
