package co.edu.getset;

public class Car {
	
	// Field
	private String Company;
	private String model;
	private String color;
	private int speed;
	
	// Constructor
	// Method (getter,setter)

	public String getCompany() {
		return Company; // get은 데이터를 출력해줌
	}

	public void setCompany(String company) {
		Company = company; // set은 데이터를 넣어줌
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		// 속도 mile(미국 단위)  -> km
		return speed *2;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
			speed = 0;
		}
		this.speed = speed;
	}

}
