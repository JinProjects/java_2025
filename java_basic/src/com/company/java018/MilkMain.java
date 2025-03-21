package com.company.java018;

class Milk{
	private String name;
	private int price;
	
	public Milk() {
		this.name = "white";
		this.price = 1300;
	}

	public Milk(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name  +"/"+ price ;
	}
	
}
class MilkPrint{
	void show(Milk[] milks) {
		for(Milk milk : milks) {
			System.out.println("*"+milk);
		}
	}
}
public class MilkMain {

	public static void main(String[] args) {
		Milk m1 = new Milk("choco",1200);
//		System.out.println(m1);
		Milk m2 = new Milk();
//		System.out.println(m2);
		
		Milk[] milks = new Milk[3];
		milks[0] = new Milk("white",1000);
		milks[1] = new Milk("choco",1200);
		milks[2] = new Milk("banana",1500);
		
		MilkPrint print = new MilkPrint();
		print.show(milks);
	}

}
