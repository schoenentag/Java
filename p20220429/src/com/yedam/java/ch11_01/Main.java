package com.yedam.java.ch11_01;

public class Main {
	public static void main(String[] args) {
//		String str1 = new String("홍길동");
//		String str2 = new String("홍길동");
		// new 연산자로 인해 새로운 객체가 생성되므로 "홍길동"의 값은 다르다. (해시코드가 다름)
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i == 5) {
				// return; (main에서 사용할때만 System.exit()와 같은 역할을 함
				System.exit(0); // 어느 위치에 있든 강제로 종료 (0)<< 의미있진 않음
				//break; // for문만 종료시키므로 마무리코드 출력됨
			}
		}
		System.out.println("마무리 코드"); // break에서만 출력됨
	}
}

// return, System.exit, break 차이 알기!