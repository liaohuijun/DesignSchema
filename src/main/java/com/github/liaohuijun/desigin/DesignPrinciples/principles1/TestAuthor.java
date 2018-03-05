package com.github.liaohuijun.desigin.DesignPrinciples.principles1;
/**
 * 测试
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class TestAuthor {
	
	public static void  main(String[] args) {
		
		//作家
		Author author = new Author();
		
		//出版社
		Publisher publisher = new Publisher();
		
		//写了一本书
		String bookName = author.writeBook();
		
		//出版社出版者这本书
		publisher.publishBook(bookName);
		
	}
	

}

