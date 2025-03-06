package com.company.java013;

class Papa extends Object{
	//money, sing()
	int money = 10000; 
	public Papa() {
		// TODO Auto-generated constructor stub
	}
	public void sing() {
		System.out.println("GOD-거짓말");
	}
}
class Son2 extends Papa{
	//money, sing()
	int money = 1500;
	public Son2() {
		super();
	}
	@Override
	public void sing() {
		System.out.println("빅뱅-거짓말");
	}
}
public class Polymorphism005 {

	public static void main(String[] args) {
		/*1.클래스 부품객체 (멤버변수 + 멤버함수)
		 * Object
		 * 	 ↑
		 * Parent  money = 10000/sing() GOD-거짓말
		 *   ↑
		 *  Child  money = 1500/sing() 빅뱅-거짓말
		 * 
		 * */
		//자식클래스의 부모클래스로 업캐스팅을 하면
		//부모의 변수, 메서드를 사용하지만
		//메모리에서 오버라이딩 된 자식의 클래스의 메서드를 호출
		//변수는 오버라이딩이 되지 않음..
		
		Papa mypapa = new Son2();
		//q3. 자식클래스를 담을 수 있다. 
		//q4. mypapa 주소1 
		//{money : 10000, sing : "GOD-거짓말"} - {money : 1500, sing : "빅뱅-거짓말"}
		//메모리에서 부모의 인스턴스변수를 찾음
		//sing()메서드를 호출하면 자식 클래스에 정의되어 있으면 
		//자식 클래스의 메서드를 호출함
		System.out.println(mypapa.money);
		mypapa.sing();
		System.out.println(((Son2)mypapa).money);
	}

}
