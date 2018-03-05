package com.github.liaohuijun.desigin.CreateModel.singleton;
/**
 * 单例
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class Singleton {
	
	private static volatile  Singleton instance;
	
	//防止类外直接new
	private Singleton() {}
	
	
	public static Singleton getInstance() {
		
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	
	//业务方法
	public void show() {
		
		System.out.println("我是业务方法");
		
	}







}

