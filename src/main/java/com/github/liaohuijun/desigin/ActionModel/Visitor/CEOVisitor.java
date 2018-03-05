package com.github.liaohuijun.desigin.ActionModel.Visitor;
/**
 * CEO访问类型。值关注业绩
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class CEOVisitor implements Visitor{

	@Override
	public void visit(Engineer engineer) {
		System.out.println("工程师：" + engineer.name + " KPI：" + engineer.kpi);
		
	}

	@Override
	public void visit(Manager manager) {
		System.out.println("经理：" + manager.name + "KPI：" + manager.kpi + "，新产品数量：" + manager.getProducts());
		
	}

	
	
}

