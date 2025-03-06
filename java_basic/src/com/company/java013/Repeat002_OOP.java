package com.company.java013;
//1. 클래스는 부품객체( 상태와 행위 )
//		클래스변수 , 인스턴스변수, 지역변수 / 클래스메서드, 인스턴스메서드
//변수초기화단계
//				기본값	명시적초기화	초기화블록		생성자
//classValue	1)0		2) 20 		3) 20		4) X
//instanceValue 5)0     6)10		7)10		8) 10
public class Repeat002_OOP {
	int instanceValue = 10;  //인스턴스변수, 힙영역, new(), this
	static int classValue = 20; //클래스변수, 메서드영역 
	
	int instanceValue2 = classValue; //인스턴스변수 = 클래스변수
	
	//atic int classValue2 = instanceValue; 
	// static jvm메모리 로딩시 메모리 할당받음(바로사용),
	// instance는 new를 사용해 메모리할당받고 객체생성 후 사용
	
	static void staticMethod1() {
		System.out.println(classValue);
	//	System.out.println(instanceValue);
		// static jvm메모리 로딩시 메모리 할당받음(바로사용),
		// instance는 new를 사용해 메모리할당받고 객체생성 후 사용
	}
	void instanceMethod1() { //#5 인스턴스메서드 - heap area - new () - this
		System.out.println(classValue);
		System.out.println(instanceValue);
		//new 연산자로 메모리를 할당받아서 사용하기 때문에
		//static 변수도 사용가능하다
	}
	static void staticMethod2() {
		System.out.println(classValue);
		//System.out.println(instanceValue);
		// static jvm메모리 로딩시 메모리 할당받음(바로사용),
		// instance는 new를 사용해 메모리할당받고 객체생성 후 사용
	}
	
	public static void main(String[] args) {
		
	}

}