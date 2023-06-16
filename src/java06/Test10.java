package java06;
// 상속관계에서 래퍼런스간의 형변환인 업캐스팅 /다운캐스팅, instanceof 연산자
class  SubClass{
	int i =3;
}
public class Test10 {

	public static void main(String[] args) {
		Object obj = new SubClass();
		if(obj instanceof SubClass) {
			
			SubClass foo = (SubClass)obj;
			System.out.println("i="+foo.i);
		}
		else {
			System.out.println("불가능");
		}
		
	}

}
