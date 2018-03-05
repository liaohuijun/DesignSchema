package com.github.liaohuijun.desigin.ActionModel.Chain;
/**
 * 组长：
 * 最多只能报1000元以内的
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class GroupLeader  extends Leader{

	@Override
	protected int limit() {
		
		return 1000;
	}

	@Override
	protected boolean handler(int money) {
		
		if (money > limit()) {
			return false;
		}
		
		System.out.println("组长批准了报销");
		
		return true;
	}

	
	
}

