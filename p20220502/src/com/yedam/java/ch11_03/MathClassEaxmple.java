package com.yedam.java.ch11_03;

public class MathClassEaxmple {

	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 : " + v1); // v1 : 5
		System.out.println("v2 : " + v2); // v2 : 3.14
		
		//올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 : " + v3); // v3 : 6.0
		System.out.println("v4 : " + v4); // v4 : -5.0
		
		//버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 : " + v5); // v5 : 5.0
		System.out.println("v6 : " + v6); // v6 : -6.0
		
		// Max, Min
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 : " + v7); // v7 : 9
		System.out.println("v8 : " + v8); // v8 : 5.3
		
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 : " + v9); // v9 : 5
		System.out.println("v10 : " + v10); // v10 : 2.5
		
		double v11 = Math.random();
		System.out.println(v11); // 0.0~1.0미만
		
		// rint : 가까운 정수의 실수값 (양수만 생각하면 반올림이랑 비슷한 개념) ★소수점 첫째자리에서 항상 반올림★
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 : " + v12); // v12 : 5.0
		System.out.println("v13 : " + v13); // v13 : 6.0
		
		// round : 반올림값 ★소수점 첫째자리에서 항상 반올림★
		//※ rint : double타입 , round : long타입
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 : " + v14); // v14 : 5
		System.out.println("v15 : " + v15); // v15 : 6
		
		//round를 이용하여 12.35로 반환하고 싶을때
		double value = 12.3456;
		double temp1 = value *100; // 1234.56
		long temp2 = Math.round(temp1); 
		double v16 = temp2 / 100.0; 
		System.out.println(v16); //12.35출력
		
		// rint() 와 round()의 공통점 : 소수점 첫째자리에서 항상 반올림 (양수)
		// rint() 와 round()의 차이점 : 음수에서 발생 !!
		// rint() ★ 소수점 이하 값이 정중앙의 값이 되었을때 (0.5, 1.5...) 우선순위가 짝수값임.
		// x.5 => 가장가까운 정수값 반환..(0도 짝수 취급)
		System.out.println("round(0.5) : "+Math.round(0.5)); // 1
		System.out.println("rint(0.5) : "+Math.rint(0.5)); // 0.0 
		
		System.out.println("round(1.5) : "+Math.round(1.5)); //2
		System.out.println("rint(1.5) : "+Math.rint(1.5));  //2.0
		
		System.out.println("round(-0.5) : "+Math.round(-0.5)); // 0
		System.out.println("rint(-0.5) : "+Math.rint(-0.5)); // -0.0 
		
		System.out.println("round(-1.5) : "+Math.round(-1.5)); //-1
		System.out.println("rint(-1.5) : "+Math.rint(-1.5));  //-2.0
		

	}

}
