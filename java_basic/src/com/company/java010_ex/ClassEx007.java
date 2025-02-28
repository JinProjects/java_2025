package com.company.java010_ex;

import java.util.Scanner;
//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class Calc{
	//멤버변수 
	static String name= "**계산기**";
	int num1;
	int num2;
	char op;
	double result;
	
	public Calc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calc(int num1, int num2, char op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	//멤버함수
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1>");
		this.num1 = sc.nextInt();
		System.out.print("숫자2>");
		this.num2 = sc.nextInt();
		System.out.print("연산자>");
		this.op = sc.next().charAt(0);
	}
	void opcalc() {
		//더하기계산
		if(this.op == '+') {
			this.result = this.num1 + this.num2;
		}else if(this.op == '-') {
			//빼기계산
			this.result = this.num1 - this.num2;
		}else if(this.op == '*') {
			//곱하기 계산
			this.result = this.num1 * this.num2;
		}else if(this.op == '/') {
			//나누기계산
			this.result = (double)this.num1 / this.num2;
		}
	}
	void show() {
		opcalc();
		System.out.println(this.num1 + String.format("%s", this.op) + this.num2 + "=" +
								((this.op=='/')?String.format("%.2f",this.result):
											(int)this.result));
	}
}
public class ClassEx007 {

	public static void main(String[] args) {
		//클래스명.static변수 - new를 이용해서 사용x
		
		System.out.println(Calc.name); 
		Calc c1 = new Calc(10,3,'+');
		c1.show();
		Calc c2 = new Calc();
		c2.input();
		c2.show();
		
	}

}
/* 소스파일												-- 컴파일(번역) -- 바이트코드
 * ClassEx007.java [class Calc{} / public ClassEx007{}]                    Calc.class / ClassEx007.class
 * ## Class Loader : runtirm date area에 java파일 올림
 *
 * 
 * ---------------------------------runtime data area : JVM이 실행하는 영역
 * [method : 정보, static, final] 1. Calc.class / ClassEx007.class / Calc.name[**계산기**]
 *--------------------------------------------
 *[heap:동적]										| [stack:지역]
 *61번 												println( Calc.name); //**계산기**
 *62번 1번지 {num1 : 10,num2 : 3,op : + ,result : 13}		← c1 : 1번지
 *63번 													c1.show();
 *64번 2번지 {num1 : 0,num2 : 0,op : 0 ,result : 0}		← c1 : 2번지
 *													| #2 main
 */