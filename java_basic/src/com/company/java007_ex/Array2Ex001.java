package com.company.java007_ex;

public class Array2Ex001 {

	public static void main(String[] args) {
		int[][] arr2 = {
							{100,200,300},
							{400,500,600}
						};
		System.out.println("층의 갯수: " +arr2.length ); //2층
		System.out.println("칸의 갯수: "+arr2[0].length);//3칸
		
		for(int i=0; i<arr2.length; i++) { //1. 몇층? 
			for(int j=0; j<arr2[i].length; j++) {//2.몇층의 몇칸?
				System.out.println(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
