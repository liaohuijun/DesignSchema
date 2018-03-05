package com.github.liaohuijun.desigin.ActionModel.Chain;
/**
 * 经理：
 * 最多可以报10000
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Manager extends Leader{

	@Override
	protected int limit() {
		
		return 10000;
	}

	@Override
	protected boolean handler(int money) {
		
		if (money > limit()) {
			return false;
		}
		
		System.out.println("经理批准类报销");
		
		return true;
	}

	
}

