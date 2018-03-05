package com.github.liaohuijun.desigin.DesignPrinciples.principles3;
/*
 * View
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public abstract class View {
	
	public abstract void draw();
	
	public void measure(int width, int height) {
		//测量视图大小
	}

}

class Button extends View{

	@Override
	public void draw() {
		//挥着按钮
		
	}
	
}

class TextView extends View{

	@Override
	public void draw() {
		//绘制TextView
		
	}
	
	
}

