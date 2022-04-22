package co.edu.oop;

public class StudentMain {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.stuNum = 10101984;
		st1.name = "심청";
		st1.kor = 100;
		st1.math = 90;
		st1.eng = 95;
		
		st1.info();
		st1.avg();
		System.out.println("평균 : "+ st1.avg());

	}

}
