package api;

public class StringIndexOfExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); //인덱스값 3출력
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련있군요.");
		}else {
			System.out.println("자바와 관련없군요.");
		}
 
		if(subject.contains("자바") ) { //true, false 
			System.out.println("자바와 관련있군요.");
		}else {
			System.out.println("자바와 관련없군요.");
		}
		
	}

}
