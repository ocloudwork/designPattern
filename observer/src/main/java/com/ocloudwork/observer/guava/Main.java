package com.ocloudwork.observer.guava;

import com.google.common.eventbus.EventBus;

public class Main {

	public static void main(String[] args) {

		GuavaEvent guavaEvent = new GuavaEvent();
		// 注册观察者
		EventBus eventBus = new EventBus();
		eventBus.register(guavaEvent);
		eventBus.post("abc");

	}

}
