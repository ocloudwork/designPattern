package com.ocloudwork.decorator.v2;

public class Main {

	public static void main(String[] args) {
		AbstractBattercake battercake=new Battercake();
		battercake=new EggDecorator(battercake);
		battercake=new EggDecorator(battercake);
		battercake=new SausageDecorator(battercake);
		System.out.println(battercake.getDesc()+"价格："+battercake.cost());
	}

}
