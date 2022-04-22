package co.edu.oop;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount bank = new BankAccount("258-7845-9963", "홍길동", 100000); 
		
		int menu = 0;
		int money = 0;
		
		boolean run = true;
		
		while(run) {
			System.out.println("===================================");
			System.out.println(" 1.예금 | 2.출금 | 3.잔액확인 | 4.종료");
			System.out.println("===================================");
			System.out.println(">>>> 선택 >>>>");
			int ch_num = Integer.parseInt(sc.nextLine());
			
			if (ch_num == 1){
				System.out.println("예금액 >>> ");
				money = Integer.parseInt(sc.nextLine());
				bank.deposit(money);

			} else if(ch_num == 2) {
				System.out.println("출금액 >>> ");
				money = Integer.parseInt(sc.nextLine());
				bank.withDraw(money);
				
			} else if(ch_num == 3) {
				System.out.println("잔액 >>>");
				System.out.println("현재잔액은 "+bank.nowMoney()+"원입니다.");
				
			} else if (ch_num == 4) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
		

	}

}
