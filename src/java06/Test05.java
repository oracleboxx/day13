package java06;
/* 업캐스팅 , 다운 캐스팅을 할 수 있는지 판단하는 연산자가 instanceof 이다 . 
 * 주로 if조건문과 함계 사용한다.
 * 
 * 사용 형식)
 * if(참조변수 instanceof 타입){
 *  참조변수가 주어진 타입으로 업캐스팅/다운 캐스팅이 가능한가 
 *  유무에서 참이면 업캐스팅, 다운캐스팅을 한다.
 *  결국 instanceof는 업캐스팅 / 다운캐스팅 유무 판단 연산자이다. 즉 형변환 유무 판단 연산자
 * 
 */
class HandPhone{
	String model;
	String number;
	public HandPhone() {
		
	}
public HandPhone(String model , String number) {
		this.model =model;
		this.number =number;
	}
}
class DicaPhone extends HandPhone{
	String pixel ;
	public DicaPhone() {
		
	}
	public DicaPhone(String model , String number ,String pixel) {
		super(model,number);
		this.pixel = pixel;
	}
	public void pr() {
		System.out.println("폰모델명 :"+model);
		System.out.println("폰 번호 : "+number);
		System.out.println("화소수 : "+pixel);
		
	}
}

public class Test05 {

	public static void main(String[] args) {
		DicaPhone d = new DicaPhone("갤럭시","010-1111-2222","1024");
		d.pr();
		if(d instanceof HandPhone) {
			System.out.println("업캐스팅이 가능함");
			HandPhone hp = d;
		}
		else {
			System.out.println("업캐스팅이 불가함");
		}
		HandPhone hp = new HandPhone(); // 사전에 업캐스팅을 안함 -> instanceof 연산자를 사용하는 목적
		if(hp instanceof DicaPhone) {
			System.out.println("사전에 업캐스팅을 하지않아서 다운캐스팅 불가");
			DicaPhone  d2 = (DicaPhone) hp;
		}
		else {
			System.out.println("다운 캐스팅이 불가");
		}//if else => instanceof 연산자를 잘 사용하면 캐스팅 연산 예외 오류 방지하다
	}

}
