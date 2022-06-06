package hw220603;

/*�� �ʵ� salary�� �� �޿��׸� �����ϸ�, int������ �ʱ� ������ 1000,000 ����
�� �޼ҵ� getAnnualGross()�� ������ ��ȯ�ϴ� �޼ҵ�� 12����ġ ���޿� �Ѵ�ġ �޿��� * ���ʽ� 500%�� ���� 
�� �⺻ �����ڿ��� �ʵ� salary�� �ʱ� ���� ����ϸ�, ������ ������ �����ڿ��� ���ڰ� �� �޿������� ����
�� ������ ���� ��ü�� �����Ͽ� �޼ҵ� getAnnualGrass()�� ȣ���Ͽ� ���*/

public class SalaryMan {
	// �ʵ�
	private int salary = 1000000; // �� �޿���

	// ������
	private SalaryMan() {
	}

	private SalaryMan(int salary) {
		this.salary = salary;
	}

	// �޼ҵ�
	public int getAnnualGross() {
		return (salary * 12) + (salary * 5);
	}

	 public static void main(String[] args) {
		 System.out.println(new SalaryMan().getAnnualGross());
		 System.out.println(new SalaryMan(2000000).getAnnualGross());
		 
	 }//main end
	 
}
