package com.company.java006;

public class Arr001 {

	public static void main(String[] args) {
		int[] arr = null; //int자료형 [] 연달아서 입력받을게요
							   //null 공간은 있지만 값을 넣지 않았어요
		
		int[] arr2 = {1,2,3};
		/*	head(동적메모리) stack(임시공간)
		 * 1번지{1,2,3} ← arr2:1번지
		 * */
		System.out.println(arr);
		System.out.println(arr2);
		
		System.out.println("1꺼내기 : "+arr2[0]); //arr2주소의 [0]번째
		System.out.println("2꺼내기 : "+arr2[1]);
		System.out.println("3꺼내기 : "+arr2[2]);
		
		
		int[] arr3 = {1,2,3,4,5};
		System.out.println(arr3[0]); //arr3주소의 [0]
		
		int[] arr4 = {100,200,300}; //0~2 배열명 : arr4 
		System.out.println(arr4[2]);//arr4주소의 [2]번째
		
		double[] arr5 = {1.1, 1.2, 1.3}; //0~2 arr5 : 1.1, 1.2, 1.3
		System.out.println(arr5[1]);//arr5주소의 [1]번째
		
		//arr6: 'a','b','c'
		
		char[] arr6 = {'a','b','c'};
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		
		for(int i=0; i<arr6.length; i++) {
			System.out.print(arr6[i] + " ");
		}
		
		
	}

}
