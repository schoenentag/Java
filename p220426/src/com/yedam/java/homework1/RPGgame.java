package com.yedam.java.homework1;

public class RPGgame implements Keypad {
	public int mode;

	public RPGgame() {
		this.mode = NORMAL_MODE;
		System.out.println("RPGgame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		}
		if (mode == HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프한다.");
		}
	}

	@Override
	public void rightDownButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격.");
		}
		if (mode == HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격.");
		}
	}

	@Override
	public void changeMode() {
		if (mode == NORMAL_MODE) {
			mode = HARD_MODE;
			System.out.println("NORMAL_MODE -> HARD_MODE 변경");
		} else if (mode == HARD_MODE) {
			mode = NORMAL_MODE;
			System.out.println("HARD_MODE -> NORMAL_MODE 변경");
		} else {
			System.out.println("유효하지 않는 값입니다.");
		}
	}

	public void modeInfo() {
		if (mode == 0) {
			System.out.println("현재 모드 : NORMAL_MODE");
		} else if (mode == 1) {
			System.out.println("현재 모드 : HARD_MODE");
		} else {
			System.out.println("모드가 정상 실행되지 않았습니다.");
		}

	}
}
