package co.edu.oop;

public class ShoppingMall {

	// Field
	int oderNum;
	String oderID;
	String name;
	int productNum;
	String address;

	// Constructor // 오른쪽 마우스 - Source - Generate Constructor using fields...(alt + shift + s /+o)
	public ShoppingMall() {
		
	}
	public ShoppingMall(int oderNum, String oderID, String name, int productNum, String address) {
		super();
		this.oderNum = oderNum;
		this.oderID = oderID;
		this.name = name;
		this.productNum = productNum;
		this.address = address;
	}

	

	// Method
	void oderInfo() {
		System.out.println("========== 주문자 정보 ==========");
		System.out.println("주문 번호 : " + oderNum);
		System.out.println("주문자 ID : " + oderID);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문상품 번호 : " + productNum);
		System.out.println("배송받을 주소 : " + address);
	}

}
