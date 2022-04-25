package com.yedam.java.homework2;

public class Main {

	public static void main(String[] args) {
		Human p1 = new StandardWeightInfo("홍길동",168,45);
		p1.getInformation();
		
		
		Human p2 = new ObesityInfo("박둘이",168,90);
		p2.getInformation();
	

	}

}
