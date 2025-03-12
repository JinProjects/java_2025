package com.company.java017;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {

	public static void main(String[] args) {
		//#1 Consumer<T> 받는용도 - accept
//		void java.util.function.Consumer.accept (T t)
		//() -> {} 파라미터O / 리턴값X
//		Consumer<String> consumer = (t)-> System.out.println("Hello"+t);
		Consumer<String> consumer = System.out::println;
		consumer.accept("555");
		consumer.accept("sally");
		consumer.accept("alpha");
		
		//#2
		//java.util.function.Supplier.get ()
		// ()->{return} 파라미터 X / 리턴값 O
		Supplier<String> supplier = () -> "Hello"; 
		System.out.println(supplier.get());
		
		//#3 Predicate - 판단용도 - test
		//1. 메서드찾기
		//2. (t) -> { return } 파라미터 O / 리턴값 O 
		Predicate<Integer> predicate = t -> t<0;
		System.out.println(predicate.test(-1));
		System.out.println(predicate.test(1));
		
		//4) funcion - 처리 용도  - apply
		//1. 메서드찾기
		//2. () -> {} 파라미터 / 리턴값 유무
//		Function<String, Integer> function =  t -> Integer.parseInt(t);
		Function<String, Integer> function =  Integer::parseInt;
		System.out.println(function.apply("10")+3);// 13 문자열을 숫자 Integer.parseInt();
		
		//5) Operator - 연산 용도  - apply
		IntBinaryOperator operator = (a, b) -> a >= b?a:b;
		System.out.println(operator.applyAsInt(10, 3));
		
		
		
		
	}

}
/*
 * 2. 자바 api의 함수형 인터페이스
	1) Consumer - 받는 용도  - accept
	2) Supplier  - 제공 용도  - get
	3) Predicate - 판단 용도  - test
	4) funcion - 처리 용도  - apply
	5) Operator - 연산 용도  - apply
 * 
 * 
 */