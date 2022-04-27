package com.yedam.java.homework3;

public abstract class Culture {
	
	//Field
	String title; // 제목
	int dirNo; // 참여감독수
	int actNo; // 참여배우 수
	int audiNo; // 관객 수
	int totalscore; // 총점
	
	//Constructor
		
	public Culture(String title, int dirNo, int actNo) {
		super();
		this.title = title;
		this.dirNo = dirNo;
		this.actNo = actNo;
	}
	
	//Method
	// 관객수와 총점을 누적시키는 기능 구현...
	public void setTotalScore(int score) {
		this.audiNo++;
		this.totalscore += score;
	}
	
	// 평점을 구하는 기능 총점 / 관객수
	public String getGrade() {
		int avg = this.totalscore/this.actNo;
		String grade = null;
		switch(avg) {
		case 1 :
			grade = "☆";
			break;
		case 2 :
			grade = "☆☆";
			break;
		case 3 :
			grade = "☆☆☆☆";
			break;
		case 4 :
			grade = "☆☆☆☆☆";
			break;
		case 5 :
			grade = "☆☆☆☆☆☆";
			break;
		}
		return grade;
	}
	// 정보를 출력하는 추상메소드
	public abstract void getInformation();

}
