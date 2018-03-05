package com.github.liaohuijun.desigin.StructureModel.decorator;
/**
 * 装饰者
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class PersonCloth extends Person{
	
	protected Person mPerson;
	
	public PersonCloth(Person person) {
		mPerson = person;
	}
	

	@Override
	public void dressed() {
		mPerson.dressed();
		
	}

	
}

