package com.yedam.java.ch13_03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail","홍길동"));
		messageQueue.offer(new Message("sendSMS","신용권"));
		messageQueue.offer(new Message("sendKakaotalk","홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
				break;
			}
		}
		// 선입선출
//		홍길동님에게 메일을 보냅니다.
//		신용권님에게 SMS을 보냅니다.
//		홍두께님에게 카카오톡을 보냅니다.
		
		
		

	}

}
