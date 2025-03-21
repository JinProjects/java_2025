package com.company._0311;

interface Vehicle1b {public void run();}

class MotorCycle1b implements Vehicle1b{
	@Override
	public void run() {
		System.out.println("오토바이가 달립니다.");
	}
	public void helmet() {System.out.println("헬멧을 착용합니다.");}
}
class Car1b implements Vehicle1b{
	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
}
class Driver1b{
	void drive(Vehicle1b vihecle) {
		vihecle.run();
	}
}
public class Interface01b_instanceof {

	public static void main(String[] args) {
		//abstract와 interface의 공통점과 차이점
		//공통점 : 추상클래스 인터페이스 모두 공통메서드를 정의 하여
		//		자식 클래스에서 구현하게 함
		//		구현부가 없어 객체 생성을 하지 못 함
		//		다형성
		//차이점 : 인터페이스는 다중상속이 가능함, 
		//		 추상클래스는 일반메서드 구현가능 함
		Driver1b driver1b = new Driver1b();
		
		MotorCycle1b motorCycle1b = new MotorCycle1b();
		Car1b car1b = new Car1b();
		
		driver1b.drive(car1b);
		
		System.out.println("\n\n>> 자동차가 고장나서 교통수단을 바꿉니다!");
		motorCycle1b.helmet();
		driver1b.drive(motorCycle1b);
		
	}

}
