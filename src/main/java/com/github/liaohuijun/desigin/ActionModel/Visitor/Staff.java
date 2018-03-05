package com.github.liaohuijun.desigin.ActionModel.Visitor;

import java.util.Random;

/**
 * 员工基类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public abstract class Staff {
	
	public String name;
	
	//员工KPI
	public int kpi;
	
	public Staff(String name) {
		this.name = name;
		kpi = new Random().nextInt();
	}
	
	// 接受visitor的访问
	public abstract void accept(Visitor visitor);

}

