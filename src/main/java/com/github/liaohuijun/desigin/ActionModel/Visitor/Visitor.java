package com.github.liaohuijun.desigin.ActionModel.Visitor;
/**
 * 访问者
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public interface Visitor {

	//访问工程师类型
	void visit(Engineer engineer);
	
	//访问经理类型
	void visit(Manager manager);
	
}

