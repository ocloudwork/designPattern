package com.ocloudwork.decorator.v2;

public class SausageDecorator extends AbstractDecorator {

	public SausageDecorator(AbstractBattercake abstractBattercake) {
		super(abstractBattercake);
	}
	
	@Override
	public String getDesc() {
		return super.getDesc()+",加一个香肠";
	}
	@Override
	public int cost() {
		return super.cost() + 1;
	}

}
