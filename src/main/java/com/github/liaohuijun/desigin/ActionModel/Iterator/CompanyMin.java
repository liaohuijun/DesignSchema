package com.github.liaohuijun.desigin.ActionModel.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Company{
	
	List<Employee> list = new ArrayList<>();
	
	public CompanyMin() {
		list.add(new Employee("xiaoA", 33));
		list.add(new Employee("xiaoQ", 34));
		list.add(new Employee("xiaoF", 35));
		list.add(new Employee("xiaoG", 36));
		list.add(new Employee("xiaoH", 37));
	}

	public List<Employee> getList() {
		return list;
	}

	@Override
	public Iterator iterator() {
		
		return new MinIterator(list);
	}
	
	
	

}

