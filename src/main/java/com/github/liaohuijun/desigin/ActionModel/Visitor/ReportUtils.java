package com.github.liaohuijun.desigin.ActionModel.Visitor;
/**
 * 不适用访问者模式的写法
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class ReportUtils {

	public void visit(Staff staff) {
		if (staff instanceof Engineer) {
			Engineer engineer  = (Engineer) staff;
			System.out.println("工程师：" + engineer.name + "，KPI = " + engineer.kpi);
		}else if (staff instanceof Manager) {
			Manager manager = (Manager) staff;
			System.out.println("经理：" + manager.name + "，KPI：" + manager.kpi + "，新产品数量：" + manager.getProducts());
		}
	}
	
}

