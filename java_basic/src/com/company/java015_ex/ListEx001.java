package com.company.java015_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx001 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("red");
		list.add("green");
		list.add("blue");
		
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
