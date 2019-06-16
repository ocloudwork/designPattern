package com.ocloudwork.facade;

/**
 * 外观主类,可以再加抽象父类
 * 
 * @author minghui
 *
 */
public class GiftExchangeService {

	// 或使用spring注入
	private QualifyService qualifyService = new QualifyService();
	private PointsPaymentsService pointsPaymentsService = new PointsPaymentsService();
	private ShippingService shippingService = new ShippingService();

	public void giftExchage(PointsGift pointsGift) {
		if (qualifyService.isAvailable(pointsGift)) {
			if (pointsPaymentsService.pay(pointsGift)) {
				String name = shippingService.shipping(pointsGift);
				System.out.println(name);
			}
		}

	}

}
