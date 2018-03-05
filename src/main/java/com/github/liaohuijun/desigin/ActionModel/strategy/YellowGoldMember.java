package com.github.liaohuijun.desigin.ActionModel.strategy;
/**
 * 黄金会员打8折
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class YellowGoldMember implements ICalcPrice{

	@Override
	public double calcPrice(double price) {
		
		return 0.8 * price;
	}

	
	
}

