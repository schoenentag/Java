package com.yedam.java.ch11_02;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		String subject1 = "JAVA PROGRAMING";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // 출력값 : 3, 인덱스로 몇 번 째에 있는지 알려줌(기본기능)
		
		//어디에 위치하는지 중요하지 않고, 있는지 없는지 확인하고 싶을때(개발자들이 많이 씀)
		if(subject.indexOf("자바") != -1) {  // if 인덱스 밖에 벗어나 있지 않다면...
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}

		if(subject.indexOf("java") != -1) {  // 영어의 경우 대소문자 구분하기때문에 다르다고 판단
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련이 없는 책이군요.");
		}
	}

}
