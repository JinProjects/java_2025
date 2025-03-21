package com.company.java015;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx001 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("red");
		set.add("green");
		set.add("blue");
		set.add("green");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("갯수:"+set.size());
	}

}
