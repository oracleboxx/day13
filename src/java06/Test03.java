package java06;
/* 상속관계의 레퍼런스 간의 형변환에서 업캐스팅, 다운캐스팅과 관련된 예제
 * 
 * 
 */

class Mother13{
	public void m13(){
		System.out.println("부모 클래스 메서드 m13");
	}
}
class Child13 extends Mother13{
	public void c13() {
		System.out.println("자식 클래스 메서드 c13");
	}
}
public class Test03 {

	public static void main(String[] args) {
		Child13 ch = new Child13();
		Mother13 m1 = ch;
		m1.m13();
		
		 Mother13 m = new Child13();
		 Child13 c = (Child13)m;
		 c.m13();
		 c.c13();
		
	
		 
	}

}
