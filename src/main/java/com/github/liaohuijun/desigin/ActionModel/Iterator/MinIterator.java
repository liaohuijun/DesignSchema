package com.github.liaohuijun.desigin.ActionModel.Iterator;
/**
 * 小民的迭代器
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */

import java.util.List;

public class MinIterator  implements Iterator{
	
	private List<Employee> list;
	private int posttion;
	
	public MinIterator(List<Employee> list) {
		this.list = list;
	}
	
	@Override
	public boolean hashNext() {
		
		return !(posttion > list.size() - 1 || list.get(posttion) == null);
	}
	@Override
	public Object next() {
		
		Employee employee = list.get(posttion);
		posttion++;
		
		return employee;
	}

	
	
}

