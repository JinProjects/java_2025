package com.company.java019;

import java.io.IOException;
import java.net.Socket;

public class Network002_client {

	public static void main(String[] args) {
		//2. 고객이 통신사에 연락 - 127.0.0.1 192.168.40.93 / 7703 
		Socket socket = null;
		try {
			//회사정보
			socket = new Socket("127.0.0.1",7703);//ip, 포트번호
			System.out.println("[Client]2. as center에 고객문의!");
			
			//4. 데이터 주고 받기
			Thread sender = new Sender(socket);
			sender.start();
			Thread receiver = new Receiver(socket);
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
