package com.company.java007_ex;

public class ArrayEx006 {

	public static void main(String[] args) {
		double[] arr = new double[5]; 
		
		double num = 1.1;
		for(int i=0; i<arr.length; i++) {
			arr[i] = num;
			num += 0.1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(String.format("%.1f", arr[i]));
		}
	}

}
