package com.github.liaohuijun.desigin.ActionModel.state;
/**
 * 遥控器
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class TvControl implements PowerControl{

	TvState mState;
	
	public void setState(TvState state) {
		mState = state;
	}

	//改变为开机状态
	@Override
	public void powerOn() {
		// 改变开机状态，把状态设置为开机状态
		setState(new PowerOnState());
		System.out.println("开机啦");
	}

	//改变为关机状态
	@Override
	public void powerOff() {
		//改变为关机状态，把状态设置为开机状态
		setState(new PowerOffState());
		
		System.out.println("关机啦");
	}
	
	public void nextChannel() {
		mState.nextChannel();
	}
	
	public void preChannel() {
		mState.preChannel();
	}
	
	public void turnUp() {
		mState.turnUp();
	}
	
	public void turnDown() {
		mState.turnDown();
	}
	
	
	
	
}

