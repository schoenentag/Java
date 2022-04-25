package com.yedam.java.ch03_01;

public class Smartphon extends Phone {

	public Smartphon(String owner) {
		super(owner); //부모클래스의 생성자 호출 // 메모리상에서 super가 먼저 호출이 되어야 하므로 제일 우선순위로 설정해둬야한다.
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
