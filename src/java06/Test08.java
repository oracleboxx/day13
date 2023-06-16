package java06;

class Mother18{
	int a=100;
	public void Mother18() {
		System.out.println("부모 클래스 메서드 ()");
	}
}
class Child18 extends Mother18{
	int a=200;
	public void Mother18() {
		System.out.println("오버라이딩 메서드 ");
	}
	public void Child18() {
		System.out.println("자식 클래스 메서드() ");
	}
}
public class Test08 {
 public static void main(String[] args) {
	Mother18 m = new Child18();
	Child18 ch = (Child18)m;//명시적인 다운캐스팅
	ch.Child18(); // 실제 m이 가리키는 객체 타입에 의해서 호출되는 메서드가 결정 즉 업캐스팅 이후 오버라이딩
	//메서드를 호출 
	//메서드가 오버라이딩이 되면 동일 메서드 원형이 부모에도 있다. 그러므로 메서드 호출문제가 발생하는데 
	// 메서드가 오버라이딩을 한 경우에는 업캐스팅한 참조변수 m이 실제 가리키는 객체타입(child18)에 의해서
	// 호출되는 메서드가 결정된다.
	System.out.println(ch.a);
	/* 부모와 자손에 동일 멤버변수가 정의 된 경우에는 참조변수 m타입에 의해서 호출되는 멤버변수가 결정
	 * 여기서는 부모 타입인 mother18 타입이어서 부모에 정의된 동일 멤버변수 a를 호출한다.
	 * 
	 */
}
}
