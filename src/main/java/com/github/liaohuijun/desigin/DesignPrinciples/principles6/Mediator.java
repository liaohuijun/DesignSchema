package com.github.liaohuijun.desigin.DesignPrinciples.principles6;
/**
 * 中介
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */

import java.util.ArrayList;
import java.util.List;

public class Mediator {

	List<Room> roomList = new ArrayList<>();
	
	public Mediator() {
		for(int i = 0; i < 10; i++) {
			roomList.add(new Room(12 + i, (12 + i) * 100));
		}
	}
	
	public Room rentOut(float area, float price) {
		for(Room room : roomList) {
			if (isSuitable(room, area, price)) {
				return room;
			}
		}
		
		return null;
	}
	
	private boolean isSuitable(Room room, float area, float price) {
		return room.area == area && room.price == price;
	}
	
	
}

