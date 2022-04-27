package com.yedam.java.homework3;

public class Performance extends Culture {

	// Field
	String genre;
	// Constructor;


	public Performance(String title, int dirNo, int actNo, String genre) {
		super(title, dirNo, actNo);
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println(genre+" 제목 : " + title);
		System.out.println("감독 : " + actNo);
		System.out.println(genre + " 총점 : "+totalscore);
		System.out.println(genre +" 평점 : "+ getGrade());

	}

}
