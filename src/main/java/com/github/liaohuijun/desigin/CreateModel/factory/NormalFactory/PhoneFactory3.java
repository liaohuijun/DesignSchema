package com.github.liaohuijun.desigin.CreateModel.factory.NormalFactory;
/**
 * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接条用即可。
 * 
 * 简单工厂模式 之静态工厂方法模式。
 * 
 * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * 在以上的的三种模式中，第一种如果传入的字符有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，
 * 所以，大多数情况下，我们会选用第三种--静态工厂方法模式。
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */

import com.github.liaohuijun.desigin.CreateModel.factory.NokiaPhone;
import com.github.liaohuijun.desigin.CreateModel.factory.Phone;
import com.github.liaohuijun.desigin.CreateModel.factory.SanuagPhone;
import com.github.liaohuijun.desigin.CreateModel.factory.XiaoMiPhone;

public class PhoneFactory3 {

	private PhoneFactory3() {}
	
	public static Phone produceNokia() {
		return new NokiaPhone();
	}
	
	public static Phone produceSanug() {
		return new SanuagPhone();
	}
	
	public static Phone produceXiaomi() {
		return new XiaoMiPhone();
	}
	
}

