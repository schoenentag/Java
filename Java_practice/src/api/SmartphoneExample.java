package api;

public class SmartphoneExample {

	public static void main(String[] args) {
		Smartphone myPhone = new Smartphone("구글", "안드로이드");
		
		String strObj = myPhone.toString(); //재정의된 toString호출
		System.out.println(strObj);
		
		System.out.println(myPhone); // 재정의된 toString 호출하고 리턴값을 받아 출력
		

	}

}
