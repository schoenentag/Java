package array;

public class OopArray {
	public static void main(String[] args) {
		// ��ü �迭 : �迭 �ȿ� ��ü�� �ּҰ� ���� ��, �� ���� �������� �ϳ��� ���� �������� �迭
		
		Tv[] tvArr = new Tv[3]; // ���̰� 3�� TvŸ���� �������� �迭
		// ��ü �迭�� �����ϴ� ����, ���� ��ü�� �ٷ�� ���� ������������ ����� ���� ���� ��...
		// ���� ��ü�� ������� �ʾҴ�. �׷��Ƿ� ��ü�� �����ؼ� ��ü �迭�� �� ��ҿ� �����ؾ��Ѵ�.
		
		// ��ü�� �����ؼ� �迭�� �� ��ҿ� ����
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		
		// �迭�� �ʱ�ȭ ���� ����ϸ�, ���ٷ� ������ �� �� ����
		Tv[] tvArr2 = {new Tv(), new Tv(), new Tv()};
		
		//��ü�� �������� for�� �̿�...
		Tv[] tvArr3 = new Tv[100];
		for (int i = 0; i <tvArr.length; i++) {
			tvArr[i] = new Tv();
		}
		
	}

}
