package com.company.java011_ex;

public class Modifier2 {

	public static void main(String[] args) {
		Score iron = new Score();
		Score hulk = new Score("hulk", 20, 50, 30);
		iron.setName("iron");
		iron.setKor(100);
		iron.setEng(100);
		iron.setMath(100);

		Score.info();
		iron.show();
		hulk.show();
	}

}
