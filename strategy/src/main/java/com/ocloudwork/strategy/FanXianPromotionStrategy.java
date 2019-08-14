package com.ocloudwork.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("满1000返现100");
	}

}
