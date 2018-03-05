package com.github.liaohuijun.desigin.StructureModel.proxy;
/**
 * 客户类，即使用代理类的类型
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class ProxyTest {
	
	public static void main(String[] args) {
		
		test();
		
	}
	
	
	public static void test() {
		
		//构造一个真实对象
		Subject realSubject = new RealSubject();
		
		//通过一个真实对象构造一个代理对象
		Subject proxy = new ProxySubject(realSubject);
		
		//调用代理对象的相关方法
		proxy.visit();
		
	}
	

}

