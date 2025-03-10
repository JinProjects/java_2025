package com.company.java015;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SelfEx003_dap {

	public static void main(String[] args) {
		//1.HashSet
		Set<Integer> numbers = new HashSet<>();
		System.out.println("1 랜덤: " + (int)(Math.random()*45+1)); 
		
		while(numbers.size()<6) {
			numbers.add((int)(Math.random()*45+1));
		}
		System.out.println(numbers);
	}

}
