package com.gupaoedu.vip.factory.func;

public class FactoryTest {

	// 工厂方法模式
	// 1、生产者耦合低，利于各自维护拓展；
	// 2、但是消费者需要关心工厂的类型，无法简单调用。
	public static void main(String[] args) {
		
		//各个产品的生产商，都拥有各自的工厂
		//生产工艺，生成的高科技程度都是不一样的
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		//需要用户关心，这个产品的生产商
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		//增加了代码的使用复杂度
		
		
		//抽象工厂模式
		
	}
	
}
