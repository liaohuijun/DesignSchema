package com.github.liaohuijun.desigin.ActionModel.Iterator;
/**
 * 迭代器测试类，相当于Boss
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class IteratorTest {
	
	public static void main(String[] args) {
		
		test();
	}
	
	
	public static void test() {
		
		CompanyMin companyMin = new CompanyMin();
		check(companyMin.iterator());
		
		CompanyHui companyHui = new CompanyHui();
		check(companyHui.iterator());
	
		
	}
	
	private static void check(Iterator iterator) {
		
		while(iterator.hashNext()) {
			System.out.println(iterator.next());
		}
		
	}

}

