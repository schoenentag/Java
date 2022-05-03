package api;

import java.io.IOException;

public class ByteToStringExample {

	public static void main(String[] args) throws IOException {
//		byte[] bytes = {72, 101, 108 ,108, 111, 32, 74, 97, 118, 97};
//		
//		String str1 = new String(bytes);
//		System.out.println(str1);
//		
//		String str2 = new String(bytes, 6, 4); // 인덱스 6부터 4개
//		System.out.println(str2);
		
		byte[] bytes = new byte[100];
		
		System.out.println("입력 :");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); // -2를 하ㅡㄴ 이유: \r, \n부분은 제외시키기 위해...
		System.out.println(str);

	}

}
