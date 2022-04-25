package com.yedam.java.homework1;

public class EmpDept extends Employee {
	//Field
	String dep;
	
	//Constructor
	public EmpDept() {
		
	}

	public EmpDept(String name, int salary, String dep) {
		super(name, salary);
		this.dep = dep;
	}

	public String getDep() {
		return dep;
	}

	//Method
	@Override
	public void getInformation() {
		System.out.println("이름 : "+ name + " 연봉 : " + salary+" 부서 : " + dep);
		
	}
	
	@Override
	public void print() {
		System.out.print("수퍼클래스\n서브클래스");
	}

}
