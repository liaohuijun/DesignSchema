package com.github.liaohuijun.desigin.StructureModel.adapter.objectAdapter;

import com.github.liaohuijun.desigin.StructureModel.adapter.FiveVolt;
/**
 * 对象适配器，实现目标接口，保存一个被转换对象的引用
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
import com.github.liaohuijun.desigin.StructureModel.adapter.Volt220;
public class ObjectVoltAdapter implements FiveVolt{

	//保存一个被转换对象的引用
	Volt220 volt220;
	
	public ObjectVoltAdapter(Volt220 volt220) {
		this.volt220 = volt220;
	}
	
	@Override
	public int getVolt5() {
		
		return 5;
	}

	public Volt220 getVolt220() {
		return volt220;
	}


	

	
	
}

