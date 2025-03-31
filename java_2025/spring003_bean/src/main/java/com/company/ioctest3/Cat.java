package com.company.ioctest3;

import org.springframework.stereotype.Component;

@Component("cat") //상속받는 클래스는 component에 변수명을 지어줘야 한다 
public class Cat implements Animal{
	@Override public String eat() { return "Cat-eat"; }
	@Override public String sleep() { return "Cat-sleep"; }
	@Override public String poo() { return "Cat-poo"; }
}
