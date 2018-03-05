package com.github.liaohuijun.desigin.ActionModel.Iterator;
/**
 * 小辉部门的迭代器
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class HuiIterator implements Iterator {
	
	private Employee[] employees;
	private int position;
	
	public HuiIterator(Employee[] employees) {
		this.employees = employees;
	}

	@Override
	public boolean hashNext() {
		
		return !(position > employees.length - 1 || employees[position] == null);
	}

	@Override
	public Object next() {
		Employee e = employees[position];
		position++;
		
		return e;
	}

	
	
	
}

