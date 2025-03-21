package com.company.java010;

//1. 클래스는 부품객체
//2. 특성 - 상태와 행위로 
class Farm{
	//상태 - 멤버변수
	String name; // 인스턴스 변수 - heap area - new - this.name
	int		age; // 인스턴스 변수 - heap area - new - this.age
	static String FarmName = "(주)동물농장"; // 클래스변수 - method area - new 와 관련없음
	static int	  num 	   = 10;// 클래스변수 - method area - new 와 관련 없음
	
	//행위 - 멤버함수
	static void num_plus() {
		num++;
	}
	void show() {
		System.out.println("\n\n:::::::::::::::::::::::::::");
		System.out.println("::회사명 : " + FarmName);
		System.out.println("::식구수 : " + num);
		System.out.println("::이	  름: " + this.name);
		System.out.println("::나  이: " + this.age);
	}
}

public class Class005_static {

	public static void main(String[] args) {
		System.out.println("Step1. 클래스변수 - static");
		System.out.println("회사명 > "+Farm.FarmName);
		Farm.num_plus();
		System.out.println("식구수 > "+Farm.num);
		
		System.out.println("\n\nStep2. 인스턴스변수-this-각각");
		Farm cat = new Farm();
		cat.name = "고양이";
		cat.age = 5;
		cat.show();
		//객체로 접근은 가능하지만 수정해서는 안된다.
		//static은 static에 맞는 방식으로 접근해야한다.
		cat.FarmName="";
		Farm dog = new Farm();
		dog.name = "강아지";
		dog.age = 3;
		dog.show();
	}

}
/*
---------------------------------runtime data area : JVM이 실행하는 영역
* [method : 정보, static, final] 
* #1. Farm.class / Class005.class / FarmName[(주)동물농장], Farm.num[10], Farm.num_plus()
*--------------------------------------------
*[heap:동적]										| [stack:지역]
*34번 : 1번지 {name="고양이", age=5} 				← cat : 1번지
*41번 : 2번지 {name="강아지", age=3} 				← dog : 2번지
*													println() 
*												| #2 main
*/