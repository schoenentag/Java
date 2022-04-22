package co.edu.extend;

// 자식클래스
public class DmbCellPhone extends Cellphone{
	//Field
	public int channel;
	
	//Constructor
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color); // 부모클래스에 있는 생성자를 가지고 옴
		this.channel = channel;
	}
	
	//Method
	void turnOnDmb() {
		System.out.println("채널 : "+channel +"Dmb 시작");
		super.powerOn(); // 부모클래스의 메소드를 쓸 수 있다.
	}
	void turnOffDmb() {
		System.out.println("Dmb 종료");
	}
	@Override
	void powerOn() {
		System.out.println("자식 클래스에서 전원을 켭니다.");
	}
	

}
