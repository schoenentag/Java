package co.edu.oper;

public class OperatorExam {

	public static void main(String[] args) {
		
		// +, -, *, /, %
		// / : 몫
		// % : 나머지
//		  10000초 -> 10000/(60*60) => 시간
//			     -> 10000/60 => 분
//			     -> 10000%60 => 초
		
		int hour = 10000/(60*60);
		int min = 10000/60;
		int sec = 10000%60;
		System.out.println(hour +"시간");
		System.out.println(min+"분");
		System.out.println(sec+"초");
		
		
//		int i = 0;
//		i = i + 1;
//		i += 1; //대입 연산자, i = i + 1 같은 의미
//		i++; //증감 연산자
//		++i;
		int i = 0;
		i++;
		System.out.println(i); //1
		++i;
		System.out.println(i); //2
		
		System.out.println(++i); //3
		System.out.println(i++); //3
		System.out.println(i); //4
	}

}
