package com.company.java013;
/* ~는 ~이다(Is A 관계)
 * 고양이는 동물이다.
 * 개는 동물이다.
 * 
 *  Animal
 *  ↑    ↑
 * Cat  Dog
 * 
 * */
// 일반클래스 + 설계
abstract class Animal{
	String name; 
	int age;
	
	//추상메서드가 있으면 반드시 추상클래스로 만들어줘야함
	//추상메서드는 구현부{}가 없음 -공통의 속성, 구체적인 내용이 없음
	//추상화, 일반화, 설계 : 공통적인 속성, 행동
	abstract void eat();
	abstract void sleep();
	abstract void poo();
}
class Cat extends Animal{
	@Override
	void eat() {
		System.out.println(super.name + " 고양이 냠냠!");
	}

	@Override
	void sleep() {
		System.out.println(super.name + " 고양이 코!");
	}

	@Override
	void poo() {
		System.out.println(super.name + " 고양이 시원!");
	}
	
}
class Dog extends Animal{

	@Override
	void eat() {
		System.out.println(super.name + " 강아지 냠냠!");
	}

	@Override
	void sleep() {
		System.out.println(super.name + " 강아지 코!");
	}

	@Override
	void poo() {
		System.out.println(super.name + " 강아지 시원!");
	}
	
	
}
// 고양이는 동물이다.
public class Abstract001 {

	public static void main(String[] args) {
		//1. abstract class : 일반클래스 + 설계
//		Animal ani = new Animal(); 구현부가 없어서 객체 생성을 못 하게 함
		Animal ani = null;
		ani = new Cat();
		ani.name = "sally";
		ani.eat();
		
		ani = new Dog();
		ani.name = "alpha";
		ani.eat();
		
		//2. 사용목적
		Animal[] arr = { new Cat(), new Cat(), new Dog(), new Dog() };
		int cnt = 0;
		for(Animal a : arr) {
			a.name = "ani" + ++cnt;
			a.eat();
		}
	}

}





