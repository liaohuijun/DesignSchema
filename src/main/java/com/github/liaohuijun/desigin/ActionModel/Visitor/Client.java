package com.github.liaohuijun.desigin.ActionModel.Visitor;
/**
 * 客户端
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Client {
	
	public static void main(String[] args) {
		
		//构建报表
		BusinessReport businessReport = new BusinessReport();
		System.out.println("============= 给CEO看的报表 ============");
		businessReport.showReport(new CEOVisitor());
		System.out.println("============= 给CTO看的报表 ============");
		businessReport.showReport(new CTOVisitor());
		
	}

}

