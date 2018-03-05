package com.github.liaohuijun.desigin.ActionModel.Chain;
/**
 * 使多个对象都有计划处理请求，从而避免请求的发送者和接受者之间的耦合关系。
 * 将这些对象连接一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public abstract class Leader {

	protected Leader preLeader;   //上一级的领导
	
	public final void handleRequest(int money) {
		
		if (handler(money)) {
			return;
		}
		
		if (preLeader != null) {
			preLeader.handler(money);
		}
		
	}

	public void setPreLeader(Leader preLeader) {
		this.preLeader = preLeader;
	}
	
	
	
	//自己能批复的最大的报销额度
	protected abstract int limit();
	
	//处理报销行为
	protected abstract boolean handler(int money);
	
	
}

