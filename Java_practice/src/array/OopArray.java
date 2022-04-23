package array;

public class OopArray {
	public static void main(String[] args) {
		// 객체 배열 : 배열 안에 객체의 주소가 저장 됨, 즉 참조 변수들을 하나로 묶은 참조변수 배열
		
		Tv[] tvArr = new Tv[3]; // 길이가 3인 Tv타입의 참조변수 배열
		// 객체 배열을 생성하는 것은, 그저 객체를 다루기 위한 참조변수들을 만들어 놓은 것일 뿐...
		// 아직 객체가 저장되지 않았다. 그러므로 객체를 생성해서 객체 배열의 각 요소에 저장해야한다.
		
		// 객체를 생성해서 배열의 각 요소에 저장
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		// 배열의 초기화 블럭을 사용하면, 한줄로 간단히 할 수 있음
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};
		
		//객체가 많을때는 for문 이용...
		Tv[] tvArr3 = new Tv[100];
		for (int i = 0; i <tvArr.length; i++) {
			tvArr[i] = new Tv();
		}
		
	}

}
