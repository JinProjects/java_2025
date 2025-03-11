package com.company._0311;

class Papa extends Object{
	int money = 10000;
	public Papa() {
		super();
	}
	public void sing() {System.out.println("GOD-거짓말");}
}
class Son extends Papa{
	int money = 1500;
	public Son() {
	}
	@Override
	public void sing() {
		super.sing();
		System.out.println("빅뱅-거짓말");
	}
}
public class Polymorphism7 {

	public static void main(String[] args) {
		Papa mypapa = new Son();
		System.out.println(mypapa.money);//10000
		mypapa.sing();//빅뱅-거짓말
		//업캐스팅하여 자식객체가 힙영역에 등록됨
		//(Son)으로 다운캐스팅을 하여 멤버변수 호출 
		System.err.println(((Son)mypapa).money);
		
	}

}
