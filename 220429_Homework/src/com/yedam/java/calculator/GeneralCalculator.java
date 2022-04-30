package com.yedam.java.calculator;

public class GeneralCalculator extends Calculator {

	//System.out.println(" I | P | D | + | - | * | / | % | 0 | Q ");
	
	// 일반 계산기 구현
	// I : 숫자 입력
	// P : 현재 입력된 정보 출력
	// D : 후입데이터삭제
	// + - * / % 연산자
	// 0 : 값 초기화
	// Q : 프로그램 파일 종료
	
	protected double[] numList = new double[2];
	double num;
	boolean run;
	int numcount = 0;
	
	public GeneralCalculator() {
		super();
	}
	
	@Override
	public void init() {
		//초기화
		//뉴 생성자로 값 초기화 가능...?
		numList = new double[2];
	
	}

	@Override
	public void setInputNum(double num) {
		// 값 입력받았을때(메인에서 처리) numList에 값이 담기도록 구현
		// Scanner를 통해서 입력받은 값은 double num에 들어가고 num의 값이 setInput Num에 들어감
		//근데 최종적으로 배열에 들어가아햠
//	case "i":										
//		System.out.println("입력 값>>");
//		double num = sc.nextDouble();
//		cal.setInputNum(num);
		
		switch (numcount) {
		case 0:
			this.num = num;
			this.numList[0] = (double)num;
			this.numcount++;
			//System.out.printf("첫번째 값 %s 저장 ",numList[0]); OK! 
			break;
		case 1:
			this.num = num;
			this.numList[1] = (double)num;
			this.numcount++;
			//System.out.printf("첫번째 값 %s, 두번째 값 %s",numList[0],numList[1]);  OK!
			break;
			
		case 2:
			System.out.print("숫자는 최대 2개까지 입력가능합니다.");
			break;
		
		default:
			System.out.println("유효하지 않는 값입니다.");
			break;
		}
	}
	// 문제발생 : numcount 3이면 "숫자는 최대 2개까지 입력가능합니다." 나와야함 //OK! 

	@Override
	public void print() {
	//	this.numList = {num};
		// 입력되어 있는 값 출력하기
		System.out.print("현재까지 입력된 숫자 : ");
		
		for(int i = 0; i < this.numList.length; i++) {
			System.out.print((double)this.numList[i]+ " ");
			//System.out.println();
			// System.out.println("배열의 길이 : "+this.numList.length);  OK!
		}
		System.out.println();
	}

	@Override
	public void plus() {
		// 배열에 입력되어 있는 값 더하기 // 출력값 " + " : 
		// 만약에 numList[1]값이 null이라면...
		// 배열에 입력값이 하나라면 숫자를 더 입력해주세요라고 출력하기 X
		
		// numcount = 0; : 입력이 안됨 -> "숫자를 더 입력해주세요."
		// numcount = 1; : 입력 1개 됨 -> "숫자를 더 입력해주세요."
		// unmcount = 2; : 입력 2개 됨 -> 정상실행 => switch문으로... ㄱㄱ
		// 
		switch (numcount) {
		case 0:
		case 1:
			System.out.println("숫자를 더 입력해주세요.");
			break;
			case 2:
				double sum =0;
				
				for(int i = 0; i < this.numList.length; i++) {
					 sum += numList[i];
				}
				
				System.out.print("+ : " + sum);
				System.out.println();
		    break;

		default:
			break;
		}
		
	}

	@Override
	public void subtract() {
		//뺄셈 구현
		switch (numcount) {
		case 0:
		case 1:
			System.out.println("숫자를 더 입력해주세요.");
			break;
			case 2:
				double subtract =0;
					subtract = numList[0] - numList[1];
				
				System.out.print("- : " + subtract);
				System.out.println();
		    break;
	}
	}

	@Override
	public void multiply() {
		// 곱셈 구현
		switch (numcount) {
		case 0:
		case 1:
			System.out.println("숫자를 더 입력해주세요.");
			break;
			case 2:
				double multy =0;
				
				
					multy = numList[0] * numList[1];
				
				System.out.print("x : " + multy);
				System.out.println();
		    break;

	}
		
	}

	@Override
	public void division() {
		
		switch (numcount) {
		case 0:
		case 1:
			System.out.println("숫자를 더 입력해주세요.");
			break;
			case 2:
				double div =0;
				
//				for(int i = 0; i < this.numList.length; i++) {
//					div /= numList[i];
//				}
				div = numList[0] / numList[1];
				
				System.out.print("÷ : " + div);
				System.out.println();
		    break;
		
	}
	}

	@Override
	public void remain() {
		// 나눗셈의 나머지...
		switch (numcount) {
		case 0:
		case 1:
			System.out.println("숫자를 더 입력해주세요.");
			break;
			case 2:
				double remain =0;
				
//				for(int i = 0; i < this.numList.length; i++) {
//					remain %= numList[i];
//				}
				remain = numList[0] % numList[1];
				
				System.out.print("% : " + remain);
				System.out.println();
		    break;
		
	}
		
	}

	@Override
	public void delete() {
		//마지막 숫자부터 지우기
		switch (numcount) {
		case 2:
			this.numList[1] = 0;
			this.numcount--;
			break;
		case 1:
			this.numList[0] = 0;
			this.numcount--;
			break;
			
		case 0:
			System.out.println();
			break;
			
		}
	}
		
	
	


}
