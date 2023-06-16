package java06;
/*다운 캐스팅이 잘못되어서 캐스팅 연산 예외 오류가 나는 예
 * 1. 사전에 미리 업캐스팅을 안해서 다운 캐스팅을 명시적으로 하면 정상적으로 컴파일은 된다
 *    컴파일된 바이트코드 클래스 파일을 실행시 캐스팅 연산 예외 오류를 발생 시킨다 
 */
class Mother14{
	void m14() {
		System.out.println("부모 Mother14 class m14() 메서드");
	}
}
class Child14 extends Mother14{
	void c14() {
		System.out.println("자식 Child14 class c14() 메서드");
	}
}
public class Test04 {

	public static void main(String[] args) {
		Mother14 m14 = new Child14();
		Child14 c14 = (Child14)m14;
		c14.c14();
		c14.m14();
	
	}

}
