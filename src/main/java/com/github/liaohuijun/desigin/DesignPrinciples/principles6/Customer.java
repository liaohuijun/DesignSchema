package com.github.liaohuijun.desigin.DesignPrinciples.principles6;
/**
 * 迪米特原则：
 * 客户
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Customer {
	
	public float roomArea;
	public float roomPrice;
	
	public void rentRoom(Mediator mediator) {
		System.out.println(mediator.rentOut(roomArea, roomPrice));
	}
	
	public static void main(String[] args) {
		
		//客户
		Customer customer = new Customer();
		
		//中介
		Mediator mediator = new Mediator();
		
		//租房子
		customer.rentRoom(mediator);
		
	}

}

