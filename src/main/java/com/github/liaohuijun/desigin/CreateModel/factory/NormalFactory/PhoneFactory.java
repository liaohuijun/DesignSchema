package com.github.liaohuijun.desigin.CreateModel.factory.NormalFactory;
/**
 * 简单工厂模式：
 * 工厂里面有一个生产手机的方法，根据不同的值生产不同的手机
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */

import com.github.liaohuijun.desigin.CreateModel.factory.NokiaPhone;
import com.github.liaohuijun.desigin.CreateModel.factory.Phone;
import com.github.liaohuijun.desigin.CreateModel.factory.SanuagPhone;
import com.github.liaohuijun.desigin.CreateModel.factory.XiaoMiPhone;

public class PhoneFactory {
	
	public Phone produce(String type) {
		
		Phone phone = null;
		
		if ("xiaomi".equals("type")) {
			phone = new XiaoMiPhone();
		}else if ("sanuag".equals(type)) {
			phone = new SanuagPhone();
		}else if ("nokia".equals("type")) {
			phone = new NokiaPhone();
		}
		
		return phone;
		
	}

}

