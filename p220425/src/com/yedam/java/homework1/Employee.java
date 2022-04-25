package com.yedam.java.homework1;

public class Employee {
	//Field
	String name;
	int salary;
	
	//Constructor
	public Employee() {
	}

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	//Method

	public void getInformation() {
		System.out.println("이름 : "+ name + " 연봉 : " + salary);
		
	}
	
	public void print() {
		System.out.println("수퍼클래스");
		
	}

}
