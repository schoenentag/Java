package co.edu.oop;

public class BankAccount {
	
	//Field : 계좌번호, 예금주, 잔액
	
	String accNum;
	String name;
	int balance;
	
	//Constructor : 3개의 매개변수를 가진 생성자 생성
	public BankAccount(String accNum, String name, int balance) {
		this.accNum = accNum;
		this.name = name;
		this.balance = balance;
	}
	
	//Method 1) 예금을 할 수 있는 메소드 2) 출금을 할 수 있는 메소드 3) 현재 잔액을 확인 할 수 있는 메소드

	
	
	//Main Class : 인스턴스 1개만 생성하고 인자 3개를 가지도록 생성
	//Scanner 이용해서 예금, 출금, 잔액 확인 , 반복문을 이용해서 1.예금 2.출금 3. 잔액확인 4.종료
	
	//입금하는 메소드
	void deposit(int money) {
		this.balance += money;
		System.out.println("계좌번호 >>> "+this.accNum);
		System.out.println("예금주 >>> "+ this.name);
		System.out.println("예금 후 잔액 >>>" +this.balance);
	}
	
	//출금하는 메소드
	void withDraw(int money) {
		this.balance -= money;
	}
	int nowMoney() {
		return balance;
	}

}
