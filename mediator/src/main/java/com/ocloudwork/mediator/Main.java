package com.ocloudwork.mediator;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Robert");
		User user2 = new User("John");

		user1.sendMessage("Hi! John!");
		user2.sendMessage("Hello! Robert!");
	}

}
