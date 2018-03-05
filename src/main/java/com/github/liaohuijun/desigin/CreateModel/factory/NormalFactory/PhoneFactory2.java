package com.github.liaohuijun.desigin.CreateModel.factory.NormalFactory;
/**
 * 工厂类中有许多的方法用来生产不同的产品的
 * 
 * 是对简单工厂方法模式的改进，
 * 在简单工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法，分别创建对象
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */

import com.github.liaohuijun.desigin.CreateModel.factory.NokiaPhone;
import com.github.liaohuijun.desigin.CreateModel.factory.Phone;
import com.github.liaohuijun.desigin.CreateModel.factory.SanuagPhone;
import com.github.liaohuijun.desigin.CreateModel.factory.XiaoMiPhone;

public class PhoneFactory2 {
	
	public Phone produceNokia() {
		return new NokiaPhone();
	}
	
	public Phone produceXiaomi() {
		return new XiaoMiPhone();
	}
	
	public Phone produceSanug() {
		return new SanuagPhone();
	}

}

