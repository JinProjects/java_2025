package com.company.test;

class Account {
	String id;
	String pw;
	int age;
	int money;
	
 //기본생성자 ##
 public Account(){}

 // toString 상태확인 ##
	public Account(String id, String pw, int age, int money) {
		this.id	= id;
		this.pw = pw;
		this.age = age;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pw=" + pw + ", age=" + age + ", money=" + money + "]";
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
