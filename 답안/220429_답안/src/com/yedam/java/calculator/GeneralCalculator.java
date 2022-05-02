package com.yedam.java.calculator;

public class GeneralCalculator extends Calculator {

	@Override
	public void init() {			//생성자 초기화 init
		numList = new double[2];	//숫자를 최대 2개 받겠다는 뜻
		numCount = -1;				//실제로 입력받은 수를 셈
	}

	@Override
	public void setInputNum(double num) {
		try {
			numList[++numCount] = num;		//넘카운트가 2가 되고나서 할당연산자가 시작될때 오류가 남
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자는 최대 2개까지 입력가능합니다.");
			numCount--;						//넘카운트가 2가되면 --로 하나 줄여준다(원상복구)
		}
	}

	@Override
	public void print() {
		System.out.print("현재까지 입력된 숫자 : ");
		for(int i=0; i <= numCount; i++) {	//최댓값은 numCount를 사용한다.
			System.out.print(numList[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void plus() {
		if(check()) {
			System.out.printf("+ : %.1f\n", numList[0] + numList[1]);		//입력된 숫자가 2개가 맞는지 확인해야함. 맨 밑으로
		}
	}

	@Override
	public void subtract() {
		if(check()) {
			System.out.printf("- : %.1f\n", numList[0] - numList[1]);
		}
	}

	@Override
	public void multiply() {
		if(check()) {
			System.out.printf("* : %.1f\n", numList[0] * numList[1]);
		}
	}

	@Override
	public void division() {
		if(check()) {
			System.out.printf("/ : %.1f\n", numList[0] / numList[1]);
		}
	}

	@Override
	public void remain() {
		if(check()) {
			System.out.printf("%% : %.1f\n", numList[0] % numList[1]);
		}
	}

	@Override
	public void delete() {
		try {
			numList[numCount--] = 0;		//0을 강제로 집어 넣는것. numCount가 최대로 가지는 값은 1, --가 앞에가면 numCount가 주는 값은 0.
		} catch (ArrayIndexOutOfBoundsException e) {	//0~1의 내가 원래 가지고 있던걸 numList에게 준다. 0으로 바꾸고 값을 하나 바꿈?
			System.out.println("더이상 삭제할 숫자가 없습니다."); //->처음 상태로 되돌린다는 끗
			init(); //-> 그래서 init을 사용. or numCount를 ++해서 사용도 가능.
		}
	}
	
	private boolean check() {
		boolean result = false;
		if((numCount+1) == numList.length) {		//numCount와 numList를 확인, 길이가 같으면 true로 실행되도록
			result = true;
		}else {
			System.out.println("숫자를 더 입력해주세요.");
		}
		return result;
	}

}
