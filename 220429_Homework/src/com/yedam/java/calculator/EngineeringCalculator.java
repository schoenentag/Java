package com.yedam.java.calculator;

public class EngineeringCalculator extends Calculator {
	
	//System.out.println(" I | P | D | + | - | * | / | % | 0 | Q ");
	// +) "현재 연산식 : "까지 출력 // P를 누르기전까지 연산식을 이룸 << 
	
		// 공학용 계산기 구현
		// I : 숫자 입력
		// P : 현재 입력된 정보 출력
		// D : 후입데이터삭제
		// + - * / % 연산자
		// 0 : 값 초기화
		// Q : 프로그램 파일 종료

	double num;
	private double[] numList = new double[5];
	private int numcount = 0;
	private String[] operatorList= new String[4]; // 입력받은 연산자 저장하는 배열 // 연산자 최대 4
	private int operatorCount =0; // 입력받은 연산자 갯수 // numcount
	
//	boolean run;
	
	public EngineeringCalculator()
	{
		
	}
	public EngineeringCalculator(String[] operatorList, int operatorCount) {
		super();
		this.operatorList = operatorList;
		this.operatorCount = operatorCount;
	}

	@Override
	public void printMenu() {
		super.printMenu();
		System.out.println("현재 연산식 : ");
	}
	
	
	@Override
	public void init() {
		// 초기화 
		operatorList = new String[4];
		numList = new double[5];
	}


	@Override
	public void setInputNum(double num) {
//		switch (numcount) {
//		case 0:
//			this.num = num;
//			this.numList[0] = (double)num;
//			this.numcount++;
//			//System.out.printf("첫번째 값 %s 저장 ",numList[0]); OK! 
//			break;
//		case 1:
//			this.num = num;
//			this.numList[1] = (double)num;
//			this.numcount++;
//			break;
//		case 2:
//			this.num = num;
//			this.numList[2] = (double)num;
//			this.numcount++;
//			break;
//		case 3:
//			this.num = num;
//			this.numList[3] = (double)num;
//			this.numcount++;
//		case 4:
//			this.num = num;
//			this.numList[4] = (double)num;
//			this.numcount++;
//		case 5:
//			System.out.print("숫자는 최대 5개까지 입력가능합니다.");
//			break;
//	
//		}
		
	}


	@Override
	public void print() {
	System.out.print("현재까지 입력된 숫자 : ");
		
		for(int i = 0; i < this.numList.length; i++) {
			System.out.print((double)this.numList[i]+ " ");
		}
		System.out.println();
	}
		

	@Override
	public void plus() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void division() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remain() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	
	
}
