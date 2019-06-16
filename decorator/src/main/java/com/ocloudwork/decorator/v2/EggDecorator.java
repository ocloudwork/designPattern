package com.ocloudwork.decorator.v2;

public class EggDecorator extends AbstractDecorator {

	public EggDecorator(AbstractBattercake abstractBattercake) {
		super(abstractBattercake);
	}
	@Override
	public String getDesc() {
		return super.getDesc()+",加一个鸡蛋";
	}
	@Override
	public int cost() {
		return super.cost() + 2;
	}

}
