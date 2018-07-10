package com.gupaoedu.vip.factory.abstr;

import com.gupaoedu.vip.factory.Car;

public abstract class AbstractFactory {

 	protected abstract Car getCar();
 	
 	//这段代码就是动态配置的功能，若拓展工厂类型，只需要增加相应的配置，具体工厂实现在相应工厂类中完成，代码清晰，便于维护。
 	//固定模式的委派
 	public Car getCar(String name){
		if("BMW".equalsIgnoreCase(name)){
			return new BmwFactory().getCar();
		}else if("Benz".equalsIgnoreCase(name)){
			return new BenzFactory().getCar();
		}else if("Audi".equalsIgnoreCase(name)){
			return new AudiFactory().getCar();
		}else{
			System.out.println("这个产品产不出来");
			return null;
		}
	}

}
