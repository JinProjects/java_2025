package com.company.java010_ex;

class Sawon3{
	
	int pay = 10000;//인스턴스변수
	static int su = 10;//클래스변수
	
	//클래스변수는 인스턴스 변수를 담을 수 없다.
	static int basicpay = pay;
	static int basicpay2;//클래스변수
	//클래스메서드
	public static void showSu() {
		System.out.println(su);
	}
	//클래스메서드
	public static void showPay() {
		//static영역에 인스턴스변수를 사용할 수 없다.
		System.out.println(this.pay);
	}
	//인스턴스메서드
	public void showAll001() {
		System.out.println(su);
		System.out.println(this.pay);
	}
	//인스턴스메서드
	public void showAll002() {
		showAll001();
		System.out.println(this.pay);
	}
}
public class StaticEx003 {
	
	public static void main(String[] args) {
		//지역변수
		Sawon3 sola = new Sawon3();
		sola.showAll001();
	}

}
