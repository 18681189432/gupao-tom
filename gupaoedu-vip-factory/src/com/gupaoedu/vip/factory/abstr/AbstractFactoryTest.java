package com.gupaoedu.vip.factory.abstr;

/**
 * 特点：
 * 1、隐藏复杂的逻辑处理过程，只关心执行结果
 * 分类：
 * 简单工厂模式、工厂方法模式、抽象工厂模式
 * @author Administrator
 *
 */
public class AbstractFactoryTest {
	
	// 抽象工厂模式
	// 1、消费者调用简单；
	// 2、生产者各自解耦，便于各自维护拓展。
	public static void main(String[] args) {
		
		// @自优化：声明时使用抽象类AbstractFactory
		AbstractFactory factory = new DefaultFactory();
//		DefaultFactory factory = new DefaultFactory();
		// 无参时，调用默认工厂类的无参方法
		System.out.println(factory.getCar());
		// 有参时，调用抽象类中的有参方法
		System.out.println(factory.getCar("Benz"));
		
		//设计模式的经典之处，就在于，解决了编写代码的人和调用代码的人双方的痛处
		//解放我们的双手
		
	}
}
