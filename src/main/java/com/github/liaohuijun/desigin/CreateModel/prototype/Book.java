package com.github.liaohuijun.desigin.CreateModel.prototype;
/**
 * 原型模式
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class Book  implements Cloneable{
	
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	@Override
	protected Book clone() throws CloneNotSupportedException {
		
		return (Book)super.clone();
	}
	
	
	

}

