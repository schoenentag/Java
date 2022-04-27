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
		super.getInformation();
		System.out.printf(", 표준체중 %.1f입니다.\n",getStandardWeight());
	}
	public double getStandardWeight() {
		return (double)((height-100)*0.9);
	}

}
