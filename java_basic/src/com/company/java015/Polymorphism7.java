package com.company.java015;

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
		
		
		
	}

}
