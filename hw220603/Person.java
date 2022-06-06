package hw220603;

import java.time.LocalDate;

public class Person {
	

	public static void main(String[] args) {
		//아래와 같이 데이터가 주어졌을 경우 남녀 수와 만 20세 이하인 인원을 구하세요.(2002년생 만 20세)
		// 만 나이 구하기 2022- 해당년도 (
		// 앞자리 두자로 년도 
		LocalDate now = LocalDate.now(); // 시스템 년도 초기화		 
		int year = now.getYear(); // year만 따오기
		int year_2 = (int)year%100;
		//System.out.println("현재 년도 :"+ year_2);

		String[] persons = { "010302-2", "991203-1", "969513-2", "881125-1", "050105-2" };
		int[] gender = new int[persons.length]; // 성별 담을 배열
		int[] age = new int[persons.length]; // 나이 담을 배열

		int count_w = 0; // 주민번호 7번째 자리가 2면 여성++
		int count_m = 0; // 주빈번호 7번째 자리가 1이면 남성++
		int count_age = 0; // 만 20세 이하인 인원 count

		for (int i = 0; i < persons.length; i++) {
			// System.out.println(persons[i].substring(7));
			gender[i] += Integer.parseInt(persons[i].substring(7)); // 배열에 있는 문자중 7번째 추출
			// String 배열에서 추출한 숫자(String) 그대로 받아 gender에 집어넣으면 null값이 발생하므로 인트로 강제 변환시킴  
			if (gender[i] == 1) {
				count_m++;
				//System.out.println(gender[i]);
			} else {
				count_w++;
				//System.out.println(gender[i]);
			}
			age[i] += Integer.parseInt(persons[i].substring(0,2));
			// 2-
			System.out.println(age[i]);
			if (age[i] >= 2 && age[i] <= year_2 ) { // 02년생 만 20살 ~ 현재년도까지 22년생
				count_age++;
			} 

		} // for문 끝
		System.out.printf("남 %d, 여 %d\n", count_m, count_w);
		System.out.printf("만 20세 이하 %d\n",count_age);
	}

}
