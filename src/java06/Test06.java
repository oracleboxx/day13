package java06;
/* 업캐스팅 이후 메서드가 오버라이딩을 한 경우에는 업캐스팅 된 참조변수가 실제 가리키는 
 * 객체 타입에 의해서 호출되는 메서드가 결정된다
 * 
 */
class Mother16{
	public void m16() {
		System.out.println("부모 클래스 m16 메서드 호출");
	}
}
class Child16 extends Mother16{
	public void m16() {
		System.out.println("오버라이딩 한 m16 호출");
	}
	public void c16() {
		System.out.println("자식 클래스 c16 메서드 호출");
	}
	
}
public class Test06 {

	public static void main(String[] args) {
		Mother16 m16= new Mother16();
		m16.m16();
		Mother16 m17 = new Child16();
		
		Child16 ch16 = (Child16)m17;
		ch16.m16();
		ch16.c16();
		if(m17 instanceof Mother16) {
			System.out.println("업 캐스팅 가능하다");
		}
		else {
			System.out.println("업 캐스팅 불가능");
		}
	}

}
