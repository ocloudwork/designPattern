package com.ocloudwork.strategy;

public class Main {

	public static void main(String[] args) {
		
		PromotionActiviti promotionActiviti618=new PromotionActiviti(new LiJianPromotionStrategy());
		PromotionActiviti promotionActiviti1111=new PromotionActiviti(new ManJianPromotionStrategy());
		promotionActiviti618.executePromotionStrategy();
		promotionActiviti1111.executePromotionStrategy();
		
		//策略工厂
		String promotionKey="FANXIAN";
		PromotionActiviti promotionActiviti=new PromotionActiviti(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
		promotionActiviti.executePromotionStrategy();

	}

}
