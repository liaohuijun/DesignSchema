package com.github.liaohuijun.desigin.ActionModel.Visitor;
/**
 * 经理类型
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Manager extends Staff{
	
	public Manager(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
	//经理一年内做的产品的数量
	public int getProducts() {
		return 10;
	}

	
	
}

