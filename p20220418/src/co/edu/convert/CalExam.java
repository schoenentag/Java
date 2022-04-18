package co.edu.convert;

public class CalExam {

	public static void main(String[] args) {
		
		int intValue = 10;
		double doubleValue = 5.5;
		
		double result = intValue + doubleValue; 
		System.out.println(result); 
		//int + double (두 변수가 데이터 타입은 다르지만, int를 double로 인식하여 double로 계산함)
		
		//자동타입변환 연산
		byte x = 10;
		byte y = 20;
		
		//byte result2 = x + y; //ERROR
		// x, y를 int로 인식해서 byte result2에 대입할 수 없다.
		int result2 = x + y;
		
		char c = 'A';
		char d = 1;
		
		int result3 = c + d;
		System.out.println("유니코드 : "+ result3);
		System.out.println("출력문자 : "+ (char)result3);
		
		// 실수 타입 변환
		int i = 1;
		double result4;
		
		result4 = i / 5; 
		System.out.println(result4); // 0.0 정수/정수 = 몫이 0이므로 0
		
		result4 = i / 5.0;
		System.out.println(result4); // 0.2 정수/실수 = 실수타입으로 계산 
		
		result4 = (double)i / 5;
		System.out.println(result4); // 0.2 실수로변환된정수/실수
		System.out.println("=================");
		
		//문자열 + 연산
		
		int value = 15;
		//숫자+숫자
		System.out.println(value + 3); //18
		//문자열+숫자
		System.out.println("문자열 + 숫자 : " + value + 2); //값 : 152앞에 문자열이 있으면 뒤의 숫자도 문자열이 됨 즉 문자열+문자열
		//숫자+문자
		System.out.println( value + 2 + " 문자열 + 숫자 "); // 우선순위에 의해서 정수끼리 먼저 계산후 string 출력
		
		// 문자열 -> 숫자로 타입 변환 (double),(int) = 숫자 연산에서만 사용
		String str = "1000";
		int value1 = Integer.parseInt(str);
		System.out.println(value1);
		
		String str1 = "0.3";
		double value2 = Double.parseDouble(str1);
		System.out.println(value2);
		
//		String str3 = "가나다";
//		double value3 = Double.parseDouble(str3);
//		System.out.println(value3);
		//ERROR 
		
		// 숫자 -> 문자열 변환
		String str4 = String.valueOf(value1);
	}

}
