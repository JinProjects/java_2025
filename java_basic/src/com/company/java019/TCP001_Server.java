package com.company.java019;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP001_Server {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(321);
			System.out.println("1.서버준비완료!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("2-1. 연결요정 ing");
		try {
			socket = serverSocket.accept();
			System.out.println("2-2. 연결요청이 들어와서 상담사 연결");
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			writer.write("[SERVER] 안녕하세요! 고객님");
			System.out.println("데이터 전송완료");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(!socket.isClosed()) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(!serverSocket.isClosed()) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
