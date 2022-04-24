package staticJava;

import java.text.SimpleDateFormat;
import java.util.Date;

//Ŭ���� ����
class House {
	static String lastname = "Kim";
	// static(����) : lastname ������ static Ű���带 ���̸� �ڹٴ� �޸� �Ҵ��� �� �ѹ��� �ϰ� �Ǿ� �޸� ��뿡
	// �����ϴ�.
	// ���� static���� �����ϸ� ���� ���� �޸� �ּҸ��� �ٶ󺸱� ������ static ������ ���� �����Ѵ�.
}

class Counter {
	static int count = 0;

	Counter() {
		count++;
		System.out.println(count);
	}

	public static int getCount() {
		return count;
	}
}

class Util {
	public static String getScrrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
}

class Singleton {
	private static Singleton one;

	private Singleton() {

	}

	public static Singleton getInstace() {
		if (one == null) {
			one = new Singleton();
		}
		return one;

	}
}

public class Sample {

	public static void main(String[] args) {

		House name1 = new House(); // static ������ ���� ���� �ּҰ��� �����ϴ� ��ü��
		House name2 = new House();

		Counter c1 = new Counter(); // ��°� : 1
		Counter c2 = new Counter(); // ��°� : 2 // ���� �ּҸ� �����ϹǷ� count���� ����

		System.out.println(Counter.getCount()); // static method�� Ŭ������ �̿��Ͽ� ȣ��
		// Counter.getCount()�� ���� ��ü ���� Ŭ������ ���� �޼��带 ���� ȣ�� �� �� �ִ�.

		System.out.println(Util.getScrrentDate("yyyMMdd")); // ���� ��¥ ���

		Singleton singleton1 = Singleton.getInstace();
		Singleton singleton2 = Singleton.getInstace();
		System.out.println(singleton1 == singleton2); // true ���
		

	}

}
