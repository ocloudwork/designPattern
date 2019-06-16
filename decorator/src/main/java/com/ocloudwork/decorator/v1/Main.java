package com.ocloudwork.decorator.v1;

/**
 * 继承方式，不能满足更高的需要，比如加2个鸡蛋
 * @author minghui
 *
 */
public class Main {

	public static void main(String[] args) {
		Battercake battercake=new Battercake();
		System.out.println(battercake.getDesc()+"价格："+battercake.getPrice());
		
		BattercakeEgg battercakeAgg=new BattercakeEgg();
		System.out.println(battercakeAgg.getDesc()+"价格："+battercakeAgg.getPrice());
		
		BattercakeEggSausage battercakeAggSausage=new BattercakeEggSausage();
		System.out.println(battercakeAggSausage.getDesc()+"价格："+battercakeAggSausage.getPrice());
	}

}
