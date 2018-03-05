package com.github.liaohuijun.desigin.StructureModel.proxy.demo1;
/**
 * 诉讼接口类
 * 4个方法很简单，诉讼的一般流程
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public interface ILawsuit {
	
	//提交申请
	void submit();
	
	//进行举证
	void burden();
	
	//开始辩护
	void defend();
	
	//诉讼完成
	void finish();
	

}

