package com.github.liaohuijun.desigin.ActionModel.observe;
/**
 * 测试观察者模式
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class ObserverTest {
	
	public static void main(String[] args) {
		
		test();
	}
	
	public static void test() {
		
		//创建两个观察者
		Observer car = new Car();
		Observer people = new People();
		
		//创建一个被观察者
		Observable observable = new Observable();
		
		//注册两个观察者
		observable.registerObserver(car);
		observable.registerObserver(people);
		
		//被观察者发出每一个事件
		observable.dataChanged();
		
	}

}

