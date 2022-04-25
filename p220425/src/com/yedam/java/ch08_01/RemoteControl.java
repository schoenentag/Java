package com.yedam.java.ch08_01;

public interface RemoteControl {
	// 상수 필드
	public static final int MAX_VOLUME = 10; // 생성과 동시에 초기화, 상수는 대문자로...
	int MIN_VOLUME = 0; // public static final을 쓰지 않아도 디폴트값이므로 자바에서 알아서 생성함.
	
	// 추상 메서드
	public abstract void turnOn();
	void turnOff(); // public abstract쓰지 않아도 디폴트값이므로 자바에서 알아서 생성함.
	public void setVolume(int volume);

}
