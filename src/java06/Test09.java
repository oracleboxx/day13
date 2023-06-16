package java06;

/* 1.부모와 자손에서 동일 멤버 변수가 정의된 경우에는 부모로 부터 상속받은 멤버변수 x에 접근할려면 super.x로 접근하고
 *   자손에 정의된 멤버변수 x에 접근하려면 this.x로 호출
 * 
 * 2.메서드가 오버라이딩 한 경우에는 부모와 자손에 동일 메서드 원형이 존재한다. 그러므로 업캐스팅한 m19가실제 
 * 	  가리키는 객체 클래스 타입이 자손인 child19 타입이어서 호출되는 메서드가 결국 자손에서 오버라이딩한 메서드가 호출
 */
class Mother19{
	int x=100;
	void m19() {
		System.out.println("부모 클래스 m19() 메서드");
	}

		}
class Child19 extends Mother19{
	int x=200;
	void m19() {
		System.out.println("super():"+super.x);
		System.out.println("this.x:"+this.x);
		
	}
}
public class Test09 {

	public static void main(String[] args) {
		Mother19 m =new Child19();
		m.m19();
		
		
		
	}

}
