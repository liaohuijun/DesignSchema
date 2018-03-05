package com.github.liaohuijun.desigin.CreateModel.prototype;
/**
 * 测试原型模式类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class BookTest {
	
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		test();
		
	}
	

	
	public static void test() throws CloneNotSupportedException{
		
		Book book = new Book();
		book.setName("JAVA设计模式");
		book.setPrice(74);
		
		Book book1 = book.clone();
		
		System.out.println(book1);
		System.out.println(book);
		
	}
}

