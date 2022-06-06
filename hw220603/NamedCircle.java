package hw220603;

class Circle { // ����� Ŭ����
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("������ = " + this.radius);
	}
} // �θ�Ŭ���� ��

public class NamedCircle extends Circle { // Circle ��� ����
	
	private String name; // �ʵ忡 �ڽ� �ν��Ͻ� ���� ����; 

	public NamedCircle(int radius, String name) { // ���ڰ� �ΰ��� �޴� ������ ����
		super(radius); //radius���� �θ𿡰Լ� ��������
		this.name = name;	
	}
	
	@Override
	public void show() { // �������̵�
		System.out.print(name+", ");
		super.show();
	}


	public static void main(String[] args) {
		
		Circle w = new NamedCircle(5, "Waffle"); // �ν��Ͻ� ����
		w.show(); // ���
		
	}//main end
}
