package com.company.java010;

//1. 클래스는 부품객체
//2. 클래스는 속성(멤버변수)과 행위(멤버함수)

class Car31{} //생성자 Car31() - 컴파일러가 기본생성자를 자동생성
class Car32{
	String color;
	//alt + s 
	
	//오버로딩시 - 수동으로 생성자를 만들면 컴파일러가 기본생성자를 자동생성취소
	public Car32(String color) {
		super();
		this.color = color;
	}
	public Car32() {
		this.color = "black";
	}
	//기본생성자는 오버로딩, 상속
}
class Car33 extends Car32{
	public Car33(String color) {}//super(color);}
}
public class Class003_Constructor {
	public static void main(String[] args) {
		//3-1 new(heap영역) :메모리 빌리고 객체생성함
		//3-2 Car31() 초기화 
		//3-3 car1변수에 주소값 담김
		Car31 car1 = new Car31();  
		System.out.println(car1);
		
		Car32 car2 = new Car32();
		System.out.println(car2 + "\t" + car2.color);
		Car32 car3 = new Car32("red");
		System.out.println(car3 + "\t" + car3.color);
		Car33 car4 = new Car33("red");
		System.out.println(car4 + "\t" + car4.color);
	}

}
/*---------------------------------runtime data area : JVM이 실행하는 영역
 *[method : 정보, static, final] ctlr + f11을 누르면 
 *  Car31.class / Car32.class / Car33.class 생성 ##구동순서 1
 *  
 *  
 *--------------------------------------------
 *[heap:동적]				| [stack:지역]
 *15번째: 1번지 {		}	 ← car1 : 1번지
 *							| main ##2 11번째
 *-------------------------------------------- 
 */