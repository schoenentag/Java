package com.yedam.java.ch11_02;

import java.io.UnsupportedEncodingException;

public class ByteToStringExample {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		//Byte타입 String으로 변환
		String str1 = new String(bytes, "UTF-8");
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		

	}

}
