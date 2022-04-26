package com.yedam.java.ch08_01;

public class MyClass {
	//Field
	RemoteControl rc = new SmartTelevison();
	
	
	//Constructor
	MyClass(){
		
	}
	MyClass(RemoteControl rc){
		this.rc = rc;
		this.rc.turnOn();
		this.rc.turnOff();
	}
	
	//Method
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
	}
	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
		
	}

}
