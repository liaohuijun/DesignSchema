package com.github.liaohuijun.desigin.StructureModel.bridge;
/**
 * 桥接模式关键是把抽象与行为实现相分离，动态结合
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class BridgeTest {
	
	public static void main(String[] args) {
		
		test();
		
	}
	
	public static void test() {
		
		Pen pen = new BigPen();
		
		//红色的大号的笔
		pen.setColor(new RedColor());
		pen.draw();
		
		//绿色的大号的笔
		pen.setColor(new GreenColor());
		pen.draw();
		
		//蓝色的大号的笔
		pen.setColor(new BlueColor());
		pen.draw();
		
		//蓝色的小号的笔
		pen = new SmallPen();
		pen.setColor(new BlueColor());
		pen.draw();
		
		//绿色的中号的笔
		pen = new MiddlePen();
		pen.setColor(new GreenColor());
		pen.draw();
		
		
	}
	
	

}

