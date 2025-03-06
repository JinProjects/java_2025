package com.company.java013;


class Car4{
	String color;
	public Car4() {
		this.color = "";
	}
	@Override
	public String toString() {
		return "Car4 [color=" + color + "]";
	}
	
}
public class A011_Car4 {

	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.color = "red";
		System.out.println(c1);
	}

}
