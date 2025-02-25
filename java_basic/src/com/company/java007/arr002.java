package com.company.java007;

import java.util.Arrays;

public class arr002 {

	public static void main(String[] args) {
		//1. new 연산자 이용해서 처리
		int[] arr = {1,2,3}; //배열 생성 및 초기화
		//1번지 {1,2,3} ← arr:1번지 갯수3 / index 0~2
		
		int[] arr2 = new int[3]; //배열 생성 new(공간빌리기) int[3] 연달아서 3개
		//2번지{ , , } ← arr2 : 2번지
		
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2)); //[0,0,0]
		
	
		int num = 10;
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = num;
			num += 10;
		}
		
		System.out.println( Arrays.toString(arr2));
		
		
	}

}
