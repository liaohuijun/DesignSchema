package com.github.liaohuijun.desigin.CreateModel.factory.FactoryMethod;

import com.github.liaohuijun.desigin.CreateModel.factory.Phone;
import com.github.liaohuijun.desigin.CreateModel.factory.SanuagPhone;

/**
 * 生产三星手机的工厂
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class SanuagFactory implements Factory{

	@Override
	public Phone produce() {

		return new SanuagPhone();
	}

	
	
}

