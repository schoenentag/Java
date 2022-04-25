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

		System.out.println(name + "님의 신장, " + height + ", 몸무게 " + weight + ", " + getObesity2() + "입니다.");

	}

	public String getObesity2() {
		if (getObesity() < 80) {
			return "저체중";
		} else if (getObesity() <= 90) {
			return "정상체중";
		} else if (getObesity() < 110) {
			return "정상";
		} else if (getObesity() < 120) {
			return "과체중";
		} else {
			return "비만";
		}
	

	}

	public double getObesity() {
		// Weight/표준체중 * 100
		return (double) weight / getStandardWeight() * 100;
	}

}
