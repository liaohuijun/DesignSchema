package com.github.liaohuijun.desigin.StructureModel.composite;
/**
 * 透明组合模式
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public abstract class Component {
	
	protected String name;

	
	public Component(String name) {
		this.name = name;
	}
	
	//具体的逻辑由子类来实现
	public abstract void doSomething();
	
	//添加一个节点
	public abstract void addChild(Component child);
	
	//移除一个节点
	public abstract void removeChild(Component child);
	
	//获取一个节点
	public abstract Component getChild(int index);
	
	

}

