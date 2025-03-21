package com.company.java019;

import java.util.Scanner;

import javax.swing.JOptionPane;

//1.QuestionCount 클래스 - 10부터 1까지 카운트 역순
//2.사과알파벳을 입력
// -사과를 입력받으면 정답
// -틀리면 정답이 아닙니다.
class QuestionCount implements Runnable{
	@Override
	public void run() {
		for(int i=10; i>=1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//				e.printStackTrace();
				return;
			}
		}
	}
}

public class ThreadEx001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Thread count = new Thread(new QuestionCount());
		//실행1
		Thread count = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=10; i>=1; i--) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
//						Thread.currentThread().interrupt();
//						e.printStackTrace();
						break;
					}
				}
			}
		});
		count.start();
		boolean flag = true;
		while(flag) {
			//실행2
			String answer = JOptionPane.showInputDialog("사과알파벳을 입력하세요");
			if(answer.equals("apple")) {			
				System.out.println(answer);
				System.out.println("정답입니다.");
				flag = false;
			}else {
				System.out.println("정답이 아닙니다.");
			}
			count.interrupt();
		}
	}
}

//문제점 : 1) 정답말했는데 count 계속실행
//2) main이 끝났는데 다른 프로세스 실행 중
