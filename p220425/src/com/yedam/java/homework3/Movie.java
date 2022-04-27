package com.yedam.java.homework3;

public class Movie extends Culture{
	//Field 
	String genre;
	
	//Constructor
		
	public Movie(String title, int dirNo, int actNo, String genre) {
		super(title, dirNo, actNo);
		this.genre = genre;
	}



	//Methode
	// 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
	@Override
	public void getInformation() {
		System.out.println(genre +" 제목 : " + title);
		System.out.println("감독 : " + actNo);
		System.out.println(genre + " 총점 : "+ totalscore);
		System.out.println(genre+" 평점 : " + getGrade());
		
	}
	

}
