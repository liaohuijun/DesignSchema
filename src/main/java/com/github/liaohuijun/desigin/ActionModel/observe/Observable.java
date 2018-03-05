package com.github.liaohuijun.desigin.ActionModel.observe;
/**
 * 被观察者：灯
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */

import java.util.ArrayList;

public class Observable {
	
	//观察者集合
	private ArrayList<Observer> observers = new ArrayList<>();
	
	//注册一个观察者
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	//反注册一个观察者
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void dataChanged() {
		
		for(Observer observer : observers) {
			
			observer.onChange();
		}
	}
	

}

