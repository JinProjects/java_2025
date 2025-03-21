package com.company.java015;

import java.util.ArrayList;
import java.util.Scanner;

class Fruits{
	private int no;
	private String name;
	private int price;
	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruits(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fluits [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class ListEx004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Fruits> fruits = new ArrayList<>();
		
		fruits.add(new Fruits(1,"apple",2000));
		fruits.add(new Fruits(2,"banana",2500));
		fruits.add(new Fruits(3,"coconut",4500));
		
		for(int i=0; i<fruits.size(); i++) {
			System.out.println(fruits.get(i).getNo()+"/"+fruits.get(i).getName()+"/"+fruits.get(i).getPrice());
		}
		
		String[] fruitsInfo = {"사과는 빨갛다","바나나는 노랗다","코코넛은 코코하다"};
		System.out.print("1,2,3 과일정보를 입력하시오 > ");
		int num = sc.nextInt();
		int find = -1;
		for(int i=0; i<fruits.size(); i++) {
			if(fruits.get(i).getNo() == num) {
				find = i;
				break;
			}
		}
		System.out.println("번호 : "+fruits.get(find).getNo());
		System.out.println("이름 : "+fruits.get(find).getName());
		System.out.println("가격 : "+fruits.get(find).getPrice());
		System.out.println(fruitsInfo[find]);
		
		//System.out.println(fruits.get(num-1).getNo()+"/"+fruits.get(num-1).getName()+"/"+fruits.get(num-1).getPrice());
		
	}

}
