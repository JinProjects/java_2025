package com.company.airplane.dto;

public class Member {
	String id;
	String pw;
	String name;
	String engName;
	String birth;
	int gender;
	String email;
	String hp;
	String passPortNum;
	String country;
	
	@Override
	public String toString() {
		return "[id="+id+"pw="+pw+"+"+"name="+name+"engName="+engName+"birth="+birth+
	 			"gender="+gender+"email="+email+"hp="+hp+"passPortNum="+passPortNum+"country="+country+"]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEngName() {
		return engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getPassPortNum() {
		return passPortNum;
	}

	public void setPassPortNum(String passPortNum) {
		this.passPortNum = passPortNum;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
