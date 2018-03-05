package com.github.liaohuijun.desigin.ActionModel.observe;
/**
 * 观察者：行人
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class People extends Observer{

	@Override
	protected void onChange() {
		
		System.out.println("红灯亮了，我要等一等");
		
	}
	
	

}

