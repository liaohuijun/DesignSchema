package com.github.liaohuijun.desigin.DesignPrinciples.principles1;
/**
 * 单一原则
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Author {
	
	private String bookName;
	
	//写一本书
	public String writeBook() {
		System.out.println("在写一本" + bookName + "书");
		
		return bookName;
	}

}

