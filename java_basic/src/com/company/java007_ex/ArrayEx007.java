package com.company.java007_ex;

public class ArrayEx007 {

	public static void main(String[] args) {
		char[] arr = new char[5]; 
			//{1.1,1.2,1.3,1.4,1.5};

		char str = 'A';
		for(int i=0; i<arr.length; i++) {
			arr[i] = str;
			str += 1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
