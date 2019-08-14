package com.ocloudwork.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("满500减50");
	}

}
