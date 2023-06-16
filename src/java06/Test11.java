package java06;
class Super{
	public int getNumber(int a) {
		return a+1;
	}
	
		}
class CastingEx03 extends Super{
	public int getNumber(int a) {
		return a+2;
	}
}
public class Test11 {

	public static void main(String[] args) {
		Super s =new CastingEx03();// 업캐스팅
		/* 메서드가 오버라이딩 된 경우에는 s가 실제 가리키는 클래스 객체 타입이 누군지에 의해서 호출되는 메서드가 결정
		 * 여기서 CastingEx03타입을 가리키고 있기 때문에 자손에서 오버라이딩 한 메서드를 호출
		 * 줄여서 표현서 업캐스팅 이후 오버라이딩 한 메서드 호출이라고 부른다.
		 * 
		 */
		System.out.println(s.getNumber(10));
	}

}
