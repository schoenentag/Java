package com.yedam.java.ch10_01;

//실행 예외 : 코드상에는 오류가 없지만 실행했을시 오류가 나는 예외처리

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
//		String data1 = args[0]; // ERROR
//		String data2 = args[1];
//		
//		System.out.println("args[0]" + data1); // 비정상적으로 종료
//		System.out.println("args[1]" + data2); // 실행되지 않음
		
		//배열의 인덱스 범위를 벗어나면 뜨는 에러
		// 실행시 오류 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		// at p20220428/com.yedam.java.ch10_01.ArrayIndexOutOfBoundsException.main(ArrayIndexOutOfBoundsException.java:8)
		// Index 0 out of bounds for length 0 : 인덱스 0을 참조하려고 하지만 범위를 벗어났다. (배열이 없다)
		// 첫 번째 오류코드가 오류났으므로 다음것은 실행되지 않는 비정상적인 종료 발생
		// 해당 클래스에 오른쪽 마우스 Run As -> Run Configurarations.. 설정하면 정상 처리 가능함 
		// 혹은 if문으로 해결 가능
		
		// 예외처리 됨.
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]" + data1); // 비정상적으로 종료
			System.out.println("args[1]" + data2); // 실행되지 않음
		} else {
			System.out.println("매개변수를 2개 입력해주세요.");
		}
		
		// 출력값 : 매개변수를 2개 입력해주세요. (정상종료) 
		
	}

}
