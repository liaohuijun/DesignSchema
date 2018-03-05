package com.github.liaohuijun.desigin.StructureModel.bridge;
/**
 * 笔的抽象
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public abstract class Pen {

	//保存另一个变化的维度
	protected Color color;
	
	public abstract void draw() ;
	
	public void setColor(Color color) {
		this.color = color;
	}
	
}

