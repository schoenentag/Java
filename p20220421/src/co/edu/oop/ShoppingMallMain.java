package co.edu.oop;

import java.util.Scanner;

public class ShoppingMallMain {

	public static void main(String[] args) {
		ShoppingMall shop = new ShoppingMall();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문번호를 입력하십시오.>>>");
		shop.oderNum = Integer.parseInt(sc.nextLine());
		System.out.println("주문아이디를 입력하십시오.>>>");
		shop.oderID = sc.nextLine();
		System.out.println("주문이름를 입력하십시오.>>>");
		shop.name = sc.nextLine();
		System.out.println("주문상품번호를 입력하십시오.>>>");
		shop.productNum = Integer.parseInt(sc.nextLine());
		System.out.println("배송받을 주소를 입력하십시오.>>>");
		shop.address = sc.nextLine();
		
		
		
	

		shop.oderInfo();

	}

}
