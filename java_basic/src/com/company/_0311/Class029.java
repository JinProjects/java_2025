package com.company._0311;


class Sawon005{
	int pay = 10000;
	
	static int su = 10;
	//pay 인스턴스 변수는 객체가 생성이 되어야 변수가 힙 메모리에 올라가는데
	//basicpay변수는 클래스변수로 객체 생성 전에 메서드영역에 생성이 되어
	//에러가 발생한다.
//	static int basicpay = pay; 
	static int basicpay2;
	static {
		basicpay2 = 20000;
	}
	//메서드 영역에 존재하여 에러가 발생하지 않음
	public static void showSu() { System.out.println(su); }
	//먼저 showPay()가 메서드 영역으로 등록되어
	//객체 생성을 해야 힙 영역에 등록되는 this.pay 변수는 에러 발생
	public static void showPay() {System.out.println(this.pay);}
	
	public void showAll001() {
		//su 클래스변수는 객체 생성 전에 메서드 영역에 등록이 되므로 오류 발생하지 않음
		System.out.println(su);
		//객체 생성 후 힙 메모리에 등록이 되어 오류 발생하지 않는다.
		System.out.println(this.pay);
	}
	public void showAll002() {
		showAll001();// 10, 10000
		System.out.println(this.pay); //10000
	}
}
public class Class029 {

	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();
		
	}

}
