package com.ocloudwork.strategy;

public class PromotionActiviti {

	private PromotionStrategy promotionStrategy;

	public PromotionActiviti(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}

	public void executePromotionStrategy() {
		promotionStrategy.doPromotion();
	}
}
