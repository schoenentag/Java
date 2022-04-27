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
		System.out.print("이름 : " + this.name + " 키 : " +this.height +" 몸무게 : " + this.weight);
	}
	

}
