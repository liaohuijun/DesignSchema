package com.github.liaohuijun.desigin.ActionModel.Chain;
/**
 * 老板不限制报销金额
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Boss extends Leader{

	@Override
	protected int limit() {
		
		return Integer.MAX_VALUE;
	}

	@Override
	protected boolean handler(int money) {
		
		if (money > limit()) {
			return false;
		}
		
		System.out.println("老板批准了报销");
		
		return true;
	}
	
	

}

