package com.github.liaohuijun.desigin.ActionModel.Chain;
/**
 * 主管
 * 最多可以批准5000的报销金额
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Director extends Leader{

	@Override
	protected int limit() {
		
		return 5000;
	}

	@Override
	protected boolean handler(int money) {
		
		if (money > limit()) {
			return false;
		}
		
		System.out.println("主管批准了报销");
		
		return true;
	}
	
	

}

