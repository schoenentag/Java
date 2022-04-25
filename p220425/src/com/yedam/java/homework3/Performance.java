package com.yedam.java.homework3;

public class Performance extends Culture {

	// Field
	String genre;
	// Constructor;

	public Performance() {
	};

	public Performance(String genre) {
		super();
		this.genre = genre;
	}

	@Override
	public void getInformation() {
		System.out.println("공연제목 : " + title);
		System.out.println("감독 : " + actNo);
		System.out.println("공연총점 : score");
		System.out.println("공연평점");

	}

}
