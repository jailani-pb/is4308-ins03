package week06.slot02;

import java.util.*;

public class LearningQueue {

	public static void main(String[] args) {
		Queue<String> sendEmail = new LinkedList<String>();
		sendEmail.offer("abc@123.com");
		sendEmail.offer("def@456.com");
		sendEmail.offer("ghi@789.com");
		
		System.out.println(sendEmail);
		
		System.out.println(sendEmail.peek());
		System.out.println(sendEmail.peek());
		System.out.println(sendEmail.peek());
		
		System.out.println(sendEmail);
		
		while(!sendEmail.isEmpty()) {
			System.out.println("Sending email to: " + sendEmail.poll());
			System.out.println(sendEmail);
		}
	}
	
}
