package com.company.java012_ex;

/*
 * 			Object
 * 		  	  ↑
 * 		 	Calc (execute)
 *  ↑	↑		↑		↑
 * Plus Minus Multi	  Divide
 * 
 * */

class Calc extends Object{
	void exec(double d1, double d2) {
		System.out.println();
	}
}
class Plus extends Calc{
	@Override
	void exec(double d1, double d2) {
		System.out.println(d1+d2);
	}
}
class Minus extends Calc{
	@Override
	void exec(double d1, double d2) {
		System.out.println(d1-d2);
	} 
}
class Multi extends Calc{
	@Override
	void exec(double d1, double d2) {
		System.out.println(d1*d2);
	}
}
class Divide extends Calc{
	@Override
	void exec(double d1, double d2) {
		System.out.println(d1/d2);
	}
}
public class Poly005_arr {

	public static void main(String[] args) {
		//  부모   =  자식   / 업캐스팅 / 타입캐스팅 필요 X 
		Calc[] my = {new Plus(), new Minus(), new Multi(), new Divide()};
		my[0].exec(10,3); //더하기
		my[1].exec(10,3); //빼기
		my[2].exec(10,3); //곱하기
		my[3].exec(10,3); //나누기
		
	}

}
