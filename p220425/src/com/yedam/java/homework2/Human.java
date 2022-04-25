package com.yedam.java.homework2;

public class Human {
	//Field
	String name;
	int height;
	int weight;
	
	//Constructor
	public Human() {
		
	}

	public Human(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//Method
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d 입니다.", name, height, weight);
	}
	

}
