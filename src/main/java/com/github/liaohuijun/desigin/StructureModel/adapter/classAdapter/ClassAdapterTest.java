package com.github.liaohuijun.desigin.StructureModel.adapter.classAdapter;
/**
 * 下面是类适配器模式的测试类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class ClassAdapterTest {
	
	public static void main(String[] args) {
		test();
	}

	
	public static void test() {
		
		ClassVoltAdapter voltAdapter = new ClassVoltAdapter();
		System.out.println(voltAdapter.getVolt5());
		
	}
}

