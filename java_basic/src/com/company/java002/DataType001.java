package com.company.java002;

public class DataType001 {

	public static void main(String[] args) {
		//1. 자바의 자료형 분류 ( 기본형 / 참조형)
		//2. 기본형 : 값 저장
		//   논리, 정수, 실수
		boolean b1 = true; //true / false
		System.out.println("1. 논리 : " + b1);
		
		//정수 ( 1, 2, 4, 8 : byte, short, int, long)
		
		//1. bit(0,1) = 8bit = 1byte
		//2. 1bit(0,1)       2bit(0,1)(0,1)  ~  (00,01,10,11)
		//3. 2^0 2^1 2^2 2^3 2^4 2^5 2^6 2^7, 2^8
		//    1, 2, 4, 8, 16, 32, 64, 128, 256
		//4. ~128 ~ 0 ~ 127
		byte by = 1; short sh = 2; int in = 4; long l = 8;
		System.out.println("2 정수 byte-short-int-long: "+by);
		
		// 1. 연산 시 +   2. int ( 기본자료형보다 작은 자료형 : byte, short) 연산시 주의바람!
		//정수 계산 할 때 기본으로 int형으로 계산하게 되어
		//short형으로 타입변환 해주어야 한다
		//short result = by + sh; //1 + 2
		
		
		float f1 = 3.14f; double d = 3.14;
		System.out.println("3. 실수 float - double : "+f1 + "\t" +d);
		
		System.out.println("4. 실수 > 정수");
		
		f1 = 1;
		
		System.out.println(f1);
		System.out.println("5. 정밀도");
		float fper1 = 1.10000001f;  //0 6개 1.12345678
		float fper2 = 1.100000001f;  //0 7개 1.123456789
		//1.123456789 
		double dper1 = 1.000000000000003; //1~9 0이 6개  14자리
		double dper2 = 1.0000000000000003; //1~9 0이 6개  15자리
		System.out.println(fper1 + "\t" + fper2);
		System.out.println(dper1 + "\t" + dper2);
		
		int a = 2>>32;
		int b = 2>>33;
		System.out.println(a + "\t" + b);
		
		System.out.println("6. 문자 저장시 숫자로 - 출력시 문자로");
		char ch = 'A'; //문자 ' '
		System.out.println(		ch); //출력
		System.out.println((int)ch); // (int) 정수표현시 65
		
	}

}
