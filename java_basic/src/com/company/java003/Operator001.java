package com.company.java003;

import java.util.Scanner;

public class Operator001 {

	public static void main(String[] args) {
		// 값(+,-,*,/,%,++,--) 비교(>,<,>=,<=) 조건 (&&, ||, ?:) 대입(=)
		//1. 값(+,-,*,/,%,++,--)
		int a=10, b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //몫 3
		System.out.println(a%b); //나머지 1
		
		//Q1. 나머지연산자 - 짝수 홀수
		//Q2. 3의 배수?
		//짝수 : 0 1
		
		//A1. 나머지연산자 - 짝수 홀수
		//  0%2 = 0  0이면 짝수
		//  1%2 = 1  1이면 홀수
		//  2%2 = 0  2이면 짝수
		
		System.out.println(0%2);
		
		//A2. 3의배수
		// 0%3 = 0 
		// 1%3 = 1
		// 2%3 = 2
		// 3%3 = 0 
		
		System.out.println(0%3);
		
		//2. 비교(>,<,>=,<=)
		//Q1 나머지연산자 - 짝수니? 홀수니?
		//Q2 3의배수?
		System.out.println(10>3); //true
		System.out.println(10<3); //false
		// a=10   a가 짝수니? == 2로 나머지연산시 0 == a%2 == 0
		System.out.println(  a%2 == 0 ); //짝수표현
		System.out.println(  a%2 == 1 ); //홀수표현
		// b=3    b가 3의 배수니? == 3으로 나머지연산시 0
		
		//3. 조건(& && | ||)
		System.out.println(true & true);  // true
		System.out.println(true && false); // true 모든조건만족시
		System.out.println(false & true); // &   처음도 false 뒤에 조건까지 읽음
		System.out.println(false && false);//Dead code
		
		System.out.println(true | true);  // true
		System.out.println(true || false); // true 모든조건만족시
		System.out.println(false | true); // &   처음도 false 뒤에 조건까지 읽음
		System.out.println(false || false);//Dead code
		
		//4. (조건)?
		System.out.println((a>b)? "a>b" : "a<b");
		System.out.println((3%2==0)? "짝수":"홀수");
		
		//q1) 2의 배수이면서 5의 배수라면 true / false
		int num1 = 10; 
		int num2 =10;
		System.out.println((num1%2==0 && num2%5==0)?true:false);
		//q2) 2의 배수이면서 3의 배수라면 true / false
		System.out.println((num1%2==0 && num2%3==0)?true:false);
		//q3) 숫자를 입력받아 0보다 크면 양수 , 0보다 작으면 음수, 아니라면 0
		Scanner sc = new Scanner(System.in);
		int num = 5;//sc.nextInt();
		System.out.print("좋아하는 숫자입력 양수, 음수, 0 >");
		System.out.println(num > 0 ? "양수": num < 0 ? "음수":0);
		
		//5. 대입
		a = 10; 
		System.out.println( a+=b);
		System.out.println( a-=b);
		System.out.println( a*=b);
		System.out.println( a/=b);
		System.out.println( a%=b);
		
		//6. ++, --
		int a1=1, b1=1, c1=1, d1=1;
		System.out.println("-------------------");
		System.out.println(++a1);//2   1)증가 2)출력
		System.out.println(a1);//2
		
		System.out.println(b1++);//1   1)출력 2)증가
		System.out.println(b1);//2
		
		System.out.println(--c1);//0   1)감소 2)출력 
		System.out.println(c1);//0

		System.out.println(d1--);//1   1)출력 2)감소
		System.out.println(d1);//0
		
		
	}

}
