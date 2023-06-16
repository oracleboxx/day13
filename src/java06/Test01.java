package java06;


class Parent{
	public void parentPrn() {
		System.out.println("슈퍼 클래스 :ParentPrn 메서드");
	}
}
class Child extends Parent{
	public void childPrn() {
		System.out.println("자식 클래스 :ChildPrn 메서드");
	}
}
public class Test01 {

	public static void main(String[] args) {
		 Child ch =new Child();
		 ch.childPrn(); // 상속 받아서 호출
		 ch.parentPrn(); // 자손에서 정의된 메서드 호출
		 Parent p = new Child(); //슈퍼 클래스형 레퍼런스 변수 선언
		 //암시적으로 업 캐스팅이 일어남
		 p.parentPrn();//업 캐스팅 후에는 부모로부터 상속받은 메서드만 호출할 수 있다
		 
	}

}
