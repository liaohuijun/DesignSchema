package com.github.liaohuijun.desigin.ActionModel.strategy;
/**
 * 商场
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Shop {

	ICalcPrice strategy;

	//设置不同的策略
	public void setStrategy(ICalcPrice strategy) {
		this.strategy = strategy;
	}
	
	//计算价格
	public double calcPrice(double price) {
		return strategy.calcPrice(price);
	}
	
	
	
}

