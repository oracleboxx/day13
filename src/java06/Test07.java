package java06;
/* instanceof 업캐스팅/ 다운캐스팅 형변환 유무 판단 연산자 
 * 
 */

class Car {
	
}
class FireCar extends Car{
	
}

public class Test07 {

	public static void main(String[] args) {
		FireCar fc =new FireCar();
		if(fc instanceof Car) {
			System.out.println("업캐스팅 가능함");
			Car c =fc;
		}
		else {
			System.out.println("업캐스팅 불가능");
		}
		
	} 

}
