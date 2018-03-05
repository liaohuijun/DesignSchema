package com.github.liaohuijun.desigin.ActionModel.template;
/**
 * 模板模式测试类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class TemplateTest {

	public static void main(String[] args) {
		test();
	}
	
	
	public static void test() {
		
		EnterIceBox chickenEnterIceBox = new ChickenEnterIceBox();
		chickenEnterIceBox.start();
		
	}
}

