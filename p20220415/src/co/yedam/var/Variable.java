package co.yedam.var;


public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int speed, tire;
		speed = 10;
		tire = 20;
		System.out.println(speed);
		System.out.println(tire);
		
		int a;
		a = 415;
		int b = 500;
		int c, d, f;
		c = 10;
		d = 10;
		f = 10;
		int e = 1, g = 10, z = 10;
		
		int v1 = 0;
		if(true) {
			int v2 = 0;
			if (true) {
				int v3 = 0;
				v1 = 1;
				v2 = 1;
				v3 = 1;
				v1 = v2 + v3;
			}
		}
		System.out.println(v1);

	}

}
