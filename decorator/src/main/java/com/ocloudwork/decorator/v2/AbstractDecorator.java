package com.ocloudwork.decorator.v2;

//装饰器父类：可以是抽象类，也可以具体实现
public abstract class AbstractDecorator extends AbstractBattercake {
	private AbstractBattercake abstractBattercake;

	public AbstractDecorator(AbstractBattercake abstractBattercake) {
		this.abstractBattercake = abstractBattercake;
	}

	@Override
	public String getDesc() {
		return abstractBattercake.getDesc();
	}

	@Override
	public int cost() {
		return abstractBattercake.cost();
	}
}
