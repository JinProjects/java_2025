package com.company.java013;

class A11{
	int a; //인스턴스변수 - heap area - new() - this 각각
	A11(){}
	A11(int a){ this.a = a; } //인스턴스변수

	void show() { // 인스턴스메서드 - heap -
		this.a = 11;
		System.out.println( this.a ); 
	}
	static void classMethod() { //클래스메서드 
		//this.a = 12;
		//this.a = 12; //static 영역에서는 인스턴스변수를 선언하지 못 함
		//static이 jvm 로딩시 제일먼저 메모리상에 올라감
		// this는 new를 이용해 사용해야함.  순서가 맞지 않음
		// static은 instance 사용불가 
	}
	int show2() { //인스턴스메서드 - heap - new () - this 각각
		//int a; 초기화가 되어있지 않음
		int a=0;
		return a;
		//show2 메서드 안에 있는 int a는 지역변수
		//int show2() { int a; return a; }
		//int a는 stack - 임시공간 - 변수초기화가 안되서 오류.
	}
	
	int instanceValue = 10;
	static int classValue=20;
	
	void instaceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue);
	}
	static void staticMethod1() {
		
	}
}

public class RepeatQ123 {

	public static void main(String[] args) {
		A11 a1 = new A11(); //지역변수 - stack 영역
		System.out.println(a1.show2());
		//q1. new
		//q2. A11() 생성자
		//q3. a1
		//q4. [생성자 오버로딩, 상속] 변수 초기화를 하기 위해서
		//q5. c, d
		//q6. 1) static 변수에 인스턴스 값을 담지 못 함 
		//	  2) static 영역에 인스턴스 변수를 사용하지 못 함
		//	  3) 
		//	  4) static 영역에 인스턴스 메서드를 호출하지 못 함
		//	  5) 
		//q7. public - protected - default - private
		//q8. 1) getter / setter
		//    2) toString
		//q10. 클래스의 재사용, 부모클래스의 기본적으로 필요한 기능들을
		//  자식클래스에서 재정의하여 사용하는 것
		//q11.         Parent
		//                ↑ 
		//               Child
		//q14. 오버라이드
		//q15. 1)Object
		//     2)Object
		//     3)Parent
		//     4)Parent(int i, int j)
		
		
		
	}

}
