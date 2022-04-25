package com.yedam.java.homework3;

public abstract class Culture {
	
	//Field
	String title; // 제목
	int dirNo; // 참여감독수
	int actNo; // 참여배우 수
	int audiNo; // 관객 수
	int score; // 총점
	
	//Constructor
	public Culture() {
		
	}
	public Culture(String title, int dirNo, int actNo) {
		super();
		this.title = title;
		this.dirNo = dirNo;
		this.actNo = actNo;
	}
	
	//Method
	// 관객수와 총점을 누적시키는 기능 구현...
	public void setTotalScore(int sore) {
		int count = 0;
		int audiNoTotal = 0;
		int scoreTotal = 0;
	}
	
	// 평점을 구하는 기능
	public String getGrade() {
		
		//총점/관객수.. if문 이용해서 ..?
		
		return "☆";
	}
	// 정보를 출력하는 추상메소드
	public abstract void getInformation();
	

}
