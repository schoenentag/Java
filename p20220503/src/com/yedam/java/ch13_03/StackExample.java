package com.yedam.java.ch13_03;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while (! coinBox.isEmpty()) { // coin Box가 빌때까지 //isEmpty() : 문자열의 길이가 0인 경우에, true를 리턴
 			Coin coin = coinBox.pop();
 			System.out.println("꺼내온 동전 : "+coin.getValue()+"원");
		}
		//후입선출
//		꺼내온 동전 : 10원
//		꺼내온 동전 : 500원
//		꺼내온 동전 : 50원
//		꺼내온 동전 : 100원
	}

}
