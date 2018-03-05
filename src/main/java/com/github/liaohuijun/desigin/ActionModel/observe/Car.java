package com.github.liaohuijun.desigin.ActionModel.observe;
/**
 * 观察者：车
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Car extends Observer{

	@Override
	protected void onChange() {
		
		System.out.println("绿灯亮了，我可以走了");
		
	}

	
	
}

