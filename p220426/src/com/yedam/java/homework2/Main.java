package com.yedam.java.homework2;

public class Main {

	public static void main(String[] args) {
		
		PortableNotebook user = new PortableNotebook("한글2020","크롬","영화","안드로이드앱");
		user.writeDocumentaion();
		user.watchVideo();
		user.changeMode();
		user.useApp();
		user.searchInternet();
	}

}
