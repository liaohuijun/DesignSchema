package com.github.liaohuijun.desigin.ActionModel.Mediator;
/**
 * 同事类（也就是多个交互对象的基类）
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public abstract class Colleague {
	
	protected Mediator mediator;  //每一个同事都知道其中中介者
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	

}

