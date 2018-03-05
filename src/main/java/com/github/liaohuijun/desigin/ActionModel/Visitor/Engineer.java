package com.github.liaohuijun.desigin.ActionModel.Visitor;

import java.util.Random;

/**
 * 工程师类型
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Engineer extends Staff{
	
	public Engineer(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	//工程师这一年写的代码数量
	public int getCodeLine() {
		return new Random().nextInt() * 10000;
	}
	
	

}

