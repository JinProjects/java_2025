package com.company.java015;


class A{
	int a; //인스턴스변수
	static String company;//클래스변수
	void method() { 
		//지역변수는 호출스택영역에 저장되는데
		//호출스택은 재사용이 빈번하다
		//빈번하다는 것은 짧은 시간동안 같은 메모리공간을 
		//사용한다는 뜻
		
		int a; //초기화가 되지 않음
		
	}
}

public class OopEx {

	public static void main(String[] args) {
		
	}

}
