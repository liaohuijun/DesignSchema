package com.github.liaohuijun.desigin.StructureModel.adapter.objectAdapter;

import com.github.liaohuijun.desigin.StructureModel.adapter.Volt220;

/**
 * 对象适配器的测试类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class ObjectVoltAdapterTest {
	
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		
		//创建一个220V的电压的对象，也就是被转换的类的对象
		Volt220 volt220 = new Volt220();
		
		//创建一个对象适配器类的对象，并且保存一个被转换的类的对象
		ObjectVoltAdapter voltAdapter = new ObjectVoltAdapter(volt220);
		System.out.println(voltAdapter.getVolt5());
		
	}
	
}

