package java06;
/* 다운 캐스팅 특징)
 * 1. 사전에 상속관계를 만들어야 다운 캐스팅이 된다
 * 2. 부모 조상타입이 자손타입으로 형변환이 이루어 지는 것을 다운 캐스팅이라고 한다.
 * 3. 사전에 업캐스팅을 한 것에 한해서만 다운캐스팅을 허용한다.
 * 4. 형변환 연산자 즉 캐스팅 연산자를 사용해서 명시적인 다운 캐스팅을 해야 한다.
 */
class Mother12{
	public void m12() {
		System.out.println("부모 클래스 메서드");
	}
}
class Child12 extends Mother12{
	public void c12() {
		System.out.println("자식 클래스 메서드");
	}
}


public class Test02 {
	
	
	public static void main(String[] args) {
		Mother12  m  = new Mother12(); // 사전에 업캐스팅을 하지 않아서 다운 캐스팅 불가
		Mother12 ch  = new Child12();
		ch = (Child12) m ;
		// 캐스팅 연산자를 사용하지 않아서 다운 캐스팅 할 때 컴파일 에러가 난다.
		
	}

}
