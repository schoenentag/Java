package com.yedam.java.homework2;

public class PortableNotebook implements Notebook, Tablet {
	
	public int MODE;
	public String docProgm;
	public String internet;
	public String video;
	public String app;
	
	/*
	public PortableNotebook() {
		this.MODE = TABLET_MODE;
		if(MODE == 1) {
			System.out.println("NOTEBOOK_MODE");
		} else if ( MODE == 2) {
			System.out.println("TABLET_MODE");
		} else {
			System.out.println("존재하지 않는 모드입니다.");
		}
		
	}
	*/

	public PortableNotebook( String docProgm, String internet, String video, String app) {
		this.MODE = NOTEBOOK_MODE;
		System.out.println("NOTEBOOK_MODE");
		this.docProgm = docProgm;
		this.internet = internet;
		this.video = video;
		this.app = app;
	}


	@Override
	public void watchVideo() {
		System.out.println(video+"를 시청.");

	}

	@Override
	public void useApp() {
		
		if (MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println(app+"(을)를 실행.");
		} else if (MODE == TABLET_MODE) {
			System.out.println(app+"(을)를 실행.");
		} else {
			System.out.println("유효하지 않는 값입니다.");
		}

	}
	
	public void changeMode()
	{
		if (MODE == NOTEBOOK_MODE) {
			MODE = TABLET_MODE;
			System.out.println("NOTEBOOK_MODE -> TABLET_MODE 변경");
		} else if (MODE == TABLET_MODE) {
			MODE = NOTEBOOK_MODE;
			System.out.println("TABLET_MODE -> NOTEBOOK_MODE 변경");
		} else {
			System.out.println("유효하지 않는 값입니다.");
		}
		
	}

	@Override
	public void writeDocumentaion() {
		System.out.println(docProgm+"을 통해 문서를 작성.");
	}

	@Override
	public void searchInternet() {
		System.out.println(internet+"를 통해 인터넷을 검색.");
	}

}
