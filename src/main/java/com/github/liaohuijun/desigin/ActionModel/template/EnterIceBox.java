package com.github.liaohuijun.desigin.ActionModel.template;
/**
 * 把大象放冰箱
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public abstract class EnterIceBox {
	
	protected void openDoor() {
		System.out.println(" 1、打开冰箱门");
	}
	
	protected void enterInfoIcobox() {
		System.out.println(" 2、把大象放冰箱");
	}
	
	protected void closeDoor() {
		System.out.println(" 3、关闭冰箱门");
	}
	
	protected final void start() {
		openDoor();
		enterInfoIcobox();
		closeDoor();
	}

}

