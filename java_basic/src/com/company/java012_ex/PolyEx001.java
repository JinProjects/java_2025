package com.company.java012_ex;
//q1.
//q2. 각클래스에서 사용할 수 있는 멤버변수/멤버메서드

/*
 * 			Object
 * 			  ↑
 * 			Papa {money = 10000 / sing() GOD-거짓말}
 * 			  ↑
 * 			Son {money = 1500 / sing() 빅뱅-거짓말}
 * */
class Papa extends Object{
	int money = 10000;
	public Papa() {super();}
	public void sing() {System.out.println("GOD-거짓말");}
}
class Son extends Papa{
	int money = 1500;
	public Son() {super();}
	@Override
	public void sing() {
		System.out.println("빅뱅-거짓말");
	}
}
public class PolyEx001 {
 
	public static void main(String[] args) {
		Papa mypapa = new Son();
		//q3. Papa mypapa 의미?
		//부모클래스는 자식클래스를 담을 수 있다.
		
		//q4. 인스턴스화한 실제 메모리 빌려온그림
		//1번지 {money=1500 / sing() 빅뱅-거짓말} - {money=10000/--------}
		
		//							[여기서부터 			여기까지 보장   ]
		//mypapa = 1번지 {money=1500 / sing() 빅뱅-거짓말} - {money=10000/--------}
		System.out.println(mypapa.money); //q5. 출력
		mypapa.sing();//q6. 출력
		//q7. mypapa.money를 이용해서 1500 출력되게 해주세요.
		System.out.println(((Son)mypapa).money);
	}

}
