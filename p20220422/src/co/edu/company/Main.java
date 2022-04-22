package co.edu.company;

import java.util.Scanner;
import co.edu.static_member.Person;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Person p1 = new Person("123456-741258", "홍길동");
		p1.info();
		
		//Manager, Programmer -> Employee를 상속받고, getSalary를 오버라이드
		//Manager -> baseSalary + 1000000
		//Programmer -> baseSalary + 2000000

		Manager manager = new Manager();
		System.out.println("관리자의 월급 : " + manager.getSalary());
		
		Programmer prog = new Programmer();
		System.out.println("프로그래머의 월급 : "+ prog.getSalary());
		
		// bird-> animal 상속 받고, walk 메소드 재정의
		// bird.walk -> 헤엄칠 수 있다.
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
	

	}

}
