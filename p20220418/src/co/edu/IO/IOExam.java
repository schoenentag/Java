package co.edu.IO;

import java.io.IOException;
import java.util.Scanner;

public class IOExam {

	public static void main(String[] args) {
		
		//데이터 입력을 받기 위해 scanner 선언
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("스캐너 값을 입력하세요.");
			String str = s.nextLine(); // 문자값
			//int value = s.nextInt(); // 숫자값
			System.out.println("입력값 : " + str);
			if(str.equals("q")) { //equals 문자열 비교
				break;
			}
		}
		
		// 출력
		//System.out.print(false); 
		// 출력 후 엔터(ln)
		//System.out.println();
		// 괄호 안의 내용 커스텀해서 출력
		//System.out.printf(null, args); 
		
		//printf 정수
//		int value = 123;
//		System.out.printf("%d\n", value); 
//		System.out.printf("%5d\n", value); // 5자리생성 후 데이터를 넣고 자리가 남으면 앞에 공백처리
//		System.out.printf("%-5d\n", value); // 5자리생성 후 데이터를 넣고 자리가 남으면 뒤에 공백처리
//		System.out.printf("%05d\n", value); // 5자리생성 후 데이터를 넣고 자리가 남으면 앞에 0처리
		
		//printf 실수
//		double value2 = 12.123;
//		System.out.printf("%.2f\n", value2); // 소수점 두자리까지 표시
//		System.out.printf("%9.4f\n", value2); // 9자리생성 후 소수점자리 4개까지만 출력, 자리 남으면 앞에 공백처리
//		System.out.printf("%-9.0f\n", value2); // 9자리생성 후 소수점자리는 0, 자리 남으면 뒤에 공백처리
		
		// 예외처리
//		try {
//			System.out.println("값을 입력하세요.");
//			int keyCode = System.in.read();
//			System.out.println("입력값 : " + keyCode);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
