package co.yedam.var;

public class VariableExample2 {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte a = 10;
		int b = a; // byte가 int보다 데이터타입이 작기때문에 에러없이 int에 들어감(자동데이터변환타입)
		long c = b;
		
		byte d = 10;
		//char f = d; // Error :byte Type은 음수,양수를 취급하고 char는 양수만 취급하므로 데이터 변환이 안된다.
		
		// 강제 타입 변환
		int intValue = 44032;
		char charValue = (char) intValue;
		
		int intValue1 = 228;
		byte byteValue = (byte) intValue1;
		System.out.println(byteValue);

	}

}
