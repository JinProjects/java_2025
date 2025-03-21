package com.company.java017;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream002_Operator {

	public static void main(String[] args) {
		//데이터종류 상관없이 같은 방식으로 처리
		//스트림은 1회용
		Integer[] arr = {1,2,5,4,3,2,1,4,5,4,4,4};
		List<Integer> list = Arrays.asList(arr);
		
		//list.stream().distinct().sorted().forEach(System.out::println);
		
		//#1 stream
		Stream<Integer> stream_arr = Arrays.asList(arr).stream();
		Stream<Integer> stream_list = list.stream();
		//#2 중간연산
		Stream<Integer> stream_arr_disr = Arrays.asList(arr).stream().distinct();
		Stream<Integer> stream_list_disr =list.stream().distinct();
		//#3 최종연산
		//Arrays.asList(arr).stream().distinct().forEach(System.out::println);
		//list.stream().distinct().forEach(System.out::println);
		
		stream_arr.filter(t -> t%2!=0).distinct().sorted().skip(1)
		.forEach(System.out::print);
		System.out.println();
		System.out.println();
		stream_list.filter(t -> t%2!=0).distinct().sorted().skip(1)
		.forEach(System.out::print);
		System.out.println();
		//#3. Collect 
		
		System.out.println( Arrays.asList(arr).stream().collect(Collectors.toList()));
		System.out.println( Arrays.asList(arr).stream().collect(Collectors.toList()));
		
	}

}