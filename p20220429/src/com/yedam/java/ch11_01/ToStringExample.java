package com.yedam.java.ch11_01;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		System.out.println(obj1);
		
		Date obj2 = new Date(); // Date 클래스는 toString이 재정의됨
		System.out.println(obj2.toString());
		System.out.println(obj2);
	}

}
