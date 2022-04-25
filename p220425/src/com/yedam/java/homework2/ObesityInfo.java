package com.yedam.java.homework2;

public class ObesityInfo extends StandardWeightInfo {
	// Field
	// Constructor
	public ObesityInfo() {
		
	}
	public ObesityInfo(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// Method
	@Override
	public void getInformation() {
		
		System.out.printf("%s님의 신장 %d, 몸무게 %d %s입니다.", name, height, weight,getInformation2());
		

	}
	
	public String getInformation2() {
		if (getStandardWeight() < 90) {
			return "저체중";
		} else if(getStandardWeight()  >= 90 && getStandardWeight() <110) {
			return "정상체중";
		} else if(getStandardWeight()  >= 110 && getStandardWeight() <120) {
			return "과체중";
		} else if(getStandardWeight()  >= 120) {
			return "비만";
		}
		return name;
	
	}
	
	@Override
	public double  getStandardWeight() {
		// Weight/표준체중 * 100
		return (double) weight / getStandardWeight() * 100;
	}

}


