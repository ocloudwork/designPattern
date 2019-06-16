package com.ocloudwork.facade;

/**
 * 物流子系统
 * @author minghui
 *
 */
public class ShippingService {
	public String shipping(PointsGift pointsGift) {
		System.out.println("物流系统");
		return pointsGift.getName();
	}
}
