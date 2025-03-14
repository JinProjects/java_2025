package com.company.java019;

import java.util.Scanner;

class Count implements Runnable{
	@Override
	public void run() {
		for(int i=10; i>=1; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 종료");
//				Thread.currentThread().interrupt();
//				e.printStackTrace();
				break;
			}
		}
	}
}

public class Thread004_interreupt {

	public static void main(String[] args) {
		Thread count = new Thread(new Count());
		count.start();
		Scanner sc = new Scanner(System.in);
		System.out.println("count stop? y/n");
		if(sc.next().equals("y")) {
			System.out.println("count를 멈춥니다.");
			count.interrupt();
		}
		
		System.out.println("> main end....");
	}

}

