package com.company.java015;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SelfEx003 {

	public static void main(String[] args) {
		//1.HashSet
		Set<Integer> numbers = new HashSet<>();
		int temp = 0;
		int random = 0;
		boolean flag = true;
		
		while(flag) {
			random = (int)(Math.random()*45)+1;
			//not연산자 없으면
			//처음에는 아무런 수가 없으므로 
			//값을 비교 할 수 없다 그래서 무한루프 빠짐
			if(!numbers.contains(random)) {
				numbers.add(random);
			}
			if(numbers.size()==6) {
				flag = false;
			}
		}
		
		Iterator<Integer> iter = numbers.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() +" ");
		}
	}

}
