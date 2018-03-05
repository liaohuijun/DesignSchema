package com.github.liaohuijun.desigin.StructureModel.bridge;
/**
 * 中号的笔
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class MiddlePen extends Pen{

	@Override
	public void draw() {
		System.out.println("中号的 " + color.getColor() + " 画笔画画");
		
	}

	
	
}

