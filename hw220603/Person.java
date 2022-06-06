package hw220603;

import java.time.LocalDate;

public class Person {
	

	public static void main(String[] args) {
		//�Ʒ��� ���� �����Ͱ� �־����� ��� ���� ���� �� 20�� ������ �ο��� ���ϼ���.(2002��� �� 20��)
		// �� ���� ���ϱ� 2022- �ش�⵵ (
		// ���ڸ� ���ڷ� �⵵ 
		LocalDate now = LocalDate.now(); // �ý��� �⵵ �ʱ�ȭ		 
		int year = now.getYear(); // year�� ������
		int year_2 = (int)year%100;
		//System.out.println("���� �⵵ :"+ year_2);

		String[] persons = { "010302-2", "991203-1", "969513-2", "881125-1", "050105-2" };
		int[] gender = new int[persons.length]; // ���� ���� �迭
		int[] age = new int[persons.length]; // ���� ���� �迭

		int count_w = 0; // �ֹι�ȣ 7��° �ڸ��� 2�� ����++
		int count_m = 0; // �ֺ��ȣ 7��° �ڸ��� 1�̸� ����++
		int count_age = 0; // �� 20�� ������ �ο� count

		for (int i = 0; i < persons.length; i++) {
			// System.out.println(persons[i].substring(7));
			gender[i] += Integer.parseInt(persons[i].substring(7)); // �迭�� �ִ� ������ 7��° ����
			// String �迭���� ������ ����(String) �״�� �޾� gender�� ��������� null���� �߻��ϹǷ� ��Ʈ�� ���� ��ȯ��Ŵ  
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
			if (age[i] >= 2 && age[i] <= year_2 ) { // 02��� �� 20�� ~ ����⵵���� 22���
				count_age++;
			} 

		} // for�� ��
		System.out.printf("�� %d, �� %d\n", count_m, count_w);
		System.out.printf("�� 20�� ���� %d\n",count_age);
	}

}
