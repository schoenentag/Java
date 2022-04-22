package co.edu.oop;

public class Student {
	// 학생 관리 프로그램 만들기
	// Field
	int stuNum;
	String name;
	int kor;
	int math;
	int eng;

	// Constructor : 기본 생성자

	public Student() {

	}

	// Method

	void info() {
		System.out.printf("학번 : %d, 이름 : %s, 국어점수 : %d, 수학점수 : %d, 영어점수 : %d\n", stuNum, name, kor, math, eng);
	}

	double avg() {
		return (double)(kor + math + eng) / 3;
	}

}
