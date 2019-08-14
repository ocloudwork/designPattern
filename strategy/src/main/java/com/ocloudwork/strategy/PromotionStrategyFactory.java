package com.ocloudwork.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

	private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();

	private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

	static {
		PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
	}
	
	//不创建工厂类实例
	private PromotionStrategyFactory() {
	}

	public static PromotionStrategy getPromotionStrategy(String promotionKey) {
		PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
		return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
	}

	private interface PromotionKey {
		String LIJIAN = "LIJIAN";
		String MANJIAN = "MANJIAN";
		String FANXIAN = "FANXIAN";
	}
}
