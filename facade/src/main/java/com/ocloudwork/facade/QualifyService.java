package com.ocloudwork.facade;

/**
 * 校验子系统
 * @author minghui
 *
 */
public class QualifyService {
	
	public boolean isAvailable(PointsGift pointsGift) {
		System.out.println("校验礼物" + pointsGift.getName()+"是否满足积分条件");
		return true;
	}
}
