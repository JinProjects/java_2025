package com.company.java017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

class Milk{
	private int no;
	private String name;
	private int price;
	
	public Milk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Milk(int no, String name, int price) {
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
	public int hashCode() {
		return Objects.hash(name, no, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && no == other.no && price == other.price;
	}
}	
public class Repeat002 {
	public static void main(String[] args) {
		ArrayList<Milk> arr = new ArrayList<>();
		arr.add(new Milk(1, "white",1000));
		arr.add(new Milk(2, "choco",1200));
		arr.add(new Milk(3, "banana",1300));
		
		Iterator<Milk> iter = arr.iterator();
		System.out.println("=====================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("=====================");
//		while(iter.hasNext()) {
//			Milk milk = iter.next();
//			System.out.println(milk.getNo()+"\t"+milk.getName()+"\t"+milk.getPrice());
//		}
		Set<Milk> set = new HashSet<>();
		set.add(new Milk(1, "white",1000));
		set.add(new Milk(2, "choco",1200));
		set.add(new Milk(3, "banana",1300));
		set.add(new Milk(3, "banana",1300)); 
		//중복저장은 안되지만 주소값은 저장이 된다.
		//그래서 equal, hashcode로 같은 값이라고 체크하여 
		//출력해야 중복값이 없어진다.
		
//		Iterator<Milk> iter2 = set.iterator();
//		while(iter2.hasNext()) {
//			Milk milk = iter2.next();
//			System.out.println(milk.getNo()+"\t"+milk.getName()+"\t"+milk.getPrice());
//		}
		Map<Integer, Milk> map = new HashMap<>();
		map.put(1, new Milk(1, "white",1000));
		//key : Integer i = 1; - Wrapper - boxing
		//value : Milk milk = new Milk(1, "white",1000); - wrapper - boxing
		map.put(2, new Milk(2, "choco",1200)); //add(주소값)
		map.put(3, new Milk(3, "banana",1300));
		
		Iterator<Entry<Integer, Milk>> iter3 = map.entrySet().iterator();
		//[1=Milk [no=1, name=white, price=1000], 2=Milk [no=2, name=choco, price=1200], 3=Milk [no=3, name=banana, price=1300] 
		while(iter3.hasNext()) {
			Entry<Integer, Milk> key_value = iter3.next();
//			System.out.println(key_value.getKey());
//			System.out.println(key_value.getValue());
			Milk temp = key_value.getValue();
//			Milk temp = map.get(key_value.getKey()); map에서 key를 넣으면 값이 나옴.
			System.out.println(temp.getNo() +"\t" + temp.getName() + "\t"+ temp.getPrice());
		}
	}
}
