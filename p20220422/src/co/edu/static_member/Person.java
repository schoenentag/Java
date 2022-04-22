package co.edu.static_member;

public class Person {
	
	//Field
	public final String nation = "korean";
	public final String ssn;
	public String name;
	
	//Constructor
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	//Method
	public void info() {
		System.out.println(nation +", "+ssn);
	}
	
	
	

}
