package com.ocloudwork.facade;

public class Main {
	public static void main(String[] args) {

		GiftExchangeService service = new GiftExchangeService();
		PointsGift pointsGift = new PointsGift("华为手机");
		service.giftExchage(pointsGift);

	}
}
