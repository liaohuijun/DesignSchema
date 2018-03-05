package com.github.liaohuijun.desigin.ActionModel.strategy;
/**
 * 普通会员不打折
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class NormalMember implements ICalcPrice{

	@Override
	public double calcPrice(double price) {
		
		return price;
	}

	
	
}

