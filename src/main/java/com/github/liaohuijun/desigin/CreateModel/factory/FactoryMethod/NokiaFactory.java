package com.github.liaohuijun.desigin.CreateModel.factory.FactoryMethod;

import com.github.liaohuijun.desigin.CreateModel.factory.NokiaPhone;
import com.github.liaohuijun.desigin.CreateModel.factory.Phone;

/**
 * 生产Nokia手机的工厂
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class NokiaFactory implements Factory {

	@Override
	public Phone produce() {
		
		return new NokiaPhone();
	}

	
}

