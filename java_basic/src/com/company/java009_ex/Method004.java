package com.company.java009_ex;

import java.util.Arrays;

public class Method004 {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		// [heap]1번지 {1,2,3} ← [stack]a 라는 변수에 1번지 주소 값 부여
		show(a);
		show(a[0]); // 10출력
		show(a[0], a[1], a[2]); // 100출력 200출력 300출력
		
		System.out.println("main1.배열값 : "+ Arrays.toString(a));
		System.out.println("main2.배열의 주소 값 : "+System.identityHashCode(a));
		//q1. 위에 메서드 작성
		//q2. 메서드 이름이 같고 파라미터가 다르면 ? 오버로딩
		
		//call by value : 기본 값을 넘김 
		//call by reference : 참조값을 넘김
	}
	
	public static void show(int[] a) {
		System.out.println("show3.배열의 주소 값 : "+System.identityHashCode(a));
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]*10);			
		}
	}
	public static void show(int a) {
			System.out.println(a*10);			
	}
	public static void show(int a1,int a2,int a3) {
		System.out.println(a1*100);
		System.out.println(a2*100);
		System.out.println(a3*100);
	}
}
