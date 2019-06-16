package com.ocloudwork.decorator.v1;

public class BattercakeEggSausage extends BattercakeEgg {

	@Override
	public String getDesc() {
		return super.getDesc()+",加一个香肠";
	}
	@Override
	public int getPrice() {
		return super.getPrice() + 1;
	}

}
