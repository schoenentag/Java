package com.yedam.java.ch11_02;

public class StringBuilderExample {

	public static void main(String[] args) {
		//String은 수정, 삭제 할때마다 객체가 생성되므로 수정이 빈번하다면
		//Stringbuilder로 연산 작업 -> 마지막에 다시 String으로 반환
		
		StringBuffer sb = new StringBuffer();
		
		// 문자열을 끝에 추가
		sb.append("Java "); //append : 추가
		sb.append("Program Study");
		System.out.println(sb.toString()); // 출력할때 toString()이용
		
		// 해당 인덱스위치에 '앞'에 값을 삽입
		sb.insert(4,"2");
		System.out.println(sb.toString());
		
		// 해당 인덱스 위치에 값을 변경
		sb.setCharAt(4, '6'); // char:문자
		System.out.println(sb.toString());
		
		// 시작 인덱스부터 지정한 인덱스 전까지 지정해서 대체
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		// 시작 인덱스부터 지정한 인덱스 전까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총 문자 수 : " + length);
		
		// 최종적으로 연산이 끝나면 String으로 변환 후 저장
		String result = sb.toString();
		sb.delete(0, 4);
		System.out.println(result); // 출력값 : Java Book Study (String으로 변환 후 수정이 하면 반영되지 않음)
		System.out.println(sb.toString()); // 출력값 :  Book Study

	}

}
