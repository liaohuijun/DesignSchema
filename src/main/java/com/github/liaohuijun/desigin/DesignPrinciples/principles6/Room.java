package com.github.liaohuijun.desigin.DesignPrinciples.principles6;
/**
 * 房间
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Room {

	public float area;   //面积
	public float price;  //价格
	
	public Room(float area, float price) {
		this.area = area;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Room [area=" + area + ", price=" + price + "]";
	}
	
	
	
}

