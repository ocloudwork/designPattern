package com.ocloudwork.decorator.v1;

public class BattercakeEgg extends Battercake {

	@Override
	public String getDesc() {
		return super.getDesc()+",加一个鸡蛋";
	}
	@Override
	public int getPrice() {
		return super.getPrice() + 2;
	}

}
