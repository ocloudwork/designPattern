package com.ocloudwork.facade;

/**
 * 支付子系统
 * @author minghui
 *
 */
public class PointsPaymentsService {
	public boolean pay(PointsGift pointsGift) {
		System.out.println("支付成功，扣减积分");
		return true;
	}
}
