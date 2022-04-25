package com.yedam.java.homework2;

public class StandardWeightInfo extends Human {
	//Field
	//Constructor
	public StandardWeightInfo() {
		super();
	}
	public StandardWeightInfo(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	//Method
	@Override
	public void getInformation() {
		System.out.printf("%s님의 신장 %d, 몸무게 %d, 표준체중 %.1f 입니다.", name, height, weight,getStandardWeight());
	}
	public double getStandardWeight() {
		return (height-100)*0.9;
	}

}
