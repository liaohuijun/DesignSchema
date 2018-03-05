package com.github.liaohuijun.desigin.ActionModel.Visitor;
/**
 * 员工业务报表
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */

import java.util.ArrayList;
import java.util.List;

public class BusinessReport {
	
	List<Staff> mStaffs = new ArrayList<>();
	
	public BusinessReport() {
		
		mStaffs.add(new Manager("王经理"));
		mStaffs.add(new Engineer("工程师-小A"));
		mStaffs.add(new Engineer("工程师-小B"));
		mStaffs.add(new Engineer("工程师-小C"));
	}
	
	/**
	 * 为访问者展示报表，公司高层，入CEO，CTO
	  * (用一句话描述方法的主要功能)
	  * @param visitor
	 */
	public void showReport(Visitor visitor) {
		for (Staff staff : mStaffs) {
			staff.accept(visitor);
		}
	}

}

