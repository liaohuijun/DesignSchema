package com.github.liaohuijun.desigin.ActionModel.Iterator;
/**
 * 小辉部门
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class CompanyHui implements Company{

	private Employee[] employees = new Employee[3];
	
	public CompanyHui() {
		employees[0] = new Employee("tom", 23);
		employees[1] = new Employee("jim", 24);
		employees[2] = new Employee("tim", 25);
	}
	
	public Employee[] getEmployees() {
		return employees;
	}
	
	
	@Override
	public Iterator iterator() {
		
		return new HuiIterator(employees);
	}

	
	
}

