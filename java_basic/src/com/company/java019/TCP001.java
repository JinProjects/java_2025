package com.company.java019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP001 {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1",321);
			System.out.println("[CLIENT] 서버연결시도 - " + "127.0.0.1:321\n");
//			DataInputStream reader = new DataInputStream(socket.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("[Client] 서버로부터 받은 메시지 - \n" + reader.readLine());
			reader.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(!socket.isClosed()) {try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			
		}
		
		
	}

}
