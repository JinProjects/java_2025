package com.company.java017;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Stream0001 {

	public static void main(String[] args) {
		//데이터종류에 상관없이( Stream ) 같은 방식으로 처리 ( lambda )
		Integer[] arr = {1,2,3,4,5}; //배열
		List<Integer> list = Arrays.asList(arr); //리스트
		
//		Consumer <? super Integer> action
//			1. Integer 포함 부모클래스(Number, Object)도 포함
//		Consumer<Object> action;
//		Consumer<Number> action2;
//		Arrays.stream(arr).forEach(t -> System.out.println(t));
//		Arrays.stream(arr).forEach(System.out::println);
		list.stream().forEach(System.out::println);
		
		//풀이2. void java.util.function.Consumer.accept (T t)
		//	파라미터 O / 리턴값 X
		
		
	}

}
