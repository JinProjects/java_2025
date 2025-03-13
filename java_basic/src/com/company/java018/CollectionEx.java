package com.company.java018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Person{
	private int no;
	private String name;
	private int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	
}

class Operator{
	
	public int total(ArrayList<Person> person) {
		int total = 0;
		Iterator<Person> iter = person.iterator();
		
		while(iter.hasNext()) {
			Person p = iter.next();
			total += p.getAge();
		}
		
		return total;
	}
	
	public double avg(ArrayList<Person> person) {
		double num = 0;
		int total = total(person);
		
		return (double)total/person.size();
	}
	public int total(Set<Person> person) {
		int total = 0;
		Iterator<Person> iter = person.iterator();
		
		while(iter.hasNext()) {
			Person p = iter.next();
			total += p.getAge();
		}
		
		return total;
	}
	
	public double avg(Set<Person> person) {
		double num = 0;
		int total = total(person);
		
		return (double)total/person.size();
	}
	public int total(Map<Integer,Person> person) {
		int total = 0;
		Iterator<Entry<Integer, Person>> iter = person.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<Integer, Person> p = iter.next();
			total += person.get(p.getKey()).getAge();
		}
		
		return total;
	}
	
	public double avg(Map<Integer,Person> person) {
		double num = 0;
		int total = total(person);
		
		return (double)total/person.size();
	}
}

public class CollectionEx {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(1,"iron",45));
		list.add(new Person(2,"hulk",38));
		list.add(new Person(3,"captain",120));
		
		int total = 0;
		double avg = 0;
		Operator oper = new Operator();
		total = oper.total(list);
		avg = oper.avg(list);
		System.out.println("나이총합 : "+total);
		System.out.println("나이평균 : "+String.format("%.2f", avg));
		
		Set<Person> set = new HashSet<>();
		set.add(new Person(1,"iron",45));
		set.add(new Person(2,"hulk",38));
		set.add(new Person(3,"captain",120));
		total = oper.total(set);
		avg = oper.avg(set);
		System.out.println("나이총합 : "+total);
		System.out.println("나이평균 : "+String.format("%.2f", avg));
		
		Map<Integer,Person> map = new HashMap<>();
		map.put(1, new Person(1,"iron",45));
		map.put(2, new Person(2,"hulk",38));
		map.put(3, new Person(3,"captain",120));
		total = oper.total(map);
		avg = oper.avg(map);
		System.out.println("나이총합 : "+total);
		System.out.println("나이평균 : "+String.format("%.2f", avg));
		
		
	}

}
