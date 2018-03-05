package com.github.liaohuijun.desigin.StructureModel.decorator;
/**
 * 便宜的衣服
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class CheapCloth extends PersonCloth{

	public CheapCloth(Person person) {
		super(person);
	}
	
	//穿短裤
	public void dressShorts() {
		System.out.println("穿了短裤");
	}

	@Override
	public void dressed() {
		
		super.dressed();
		
		dressShorts();
		
	}
	
	
	
}

