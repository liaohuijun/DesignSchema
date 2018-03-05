package com.github.liaohuijun.desigin.ActionModel.state.normal;
/**
 * 电视遥控器，含有开机，关机，下一频道，上一频道，调高音量，调低音量
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class TvController {

	//开机状态
	private final static int POWER_ON = 1;
	
	//关机状态
	private final static int POWER_OFF = 2;
	private int mState = POWER_OFF;
	
	//开机
	public void powerOn() {
		mState = POWER_ON;
		if (mState == POWER_OFF) {
			System.out.println("开机啦");
		}
	}
	
	//关机
	public void powerOff() {
		mState = POWER_OFF;
		if (mState == POWER_ON) {
			System.out.println("关机啦");
		}
	}
	
	//下一频道
	public void nextChannel() {
		if (mState == POWER_ON) {
			System.out.println("下一频道");
		}else {
			System.out.println("两个红灯提示没有开机");
		}
	}
	
	//上一频道
	public void preChannel() {
		if (mState == POWER_ON) {
			System.out.println("上一频道");
		}else {
			System.out.println("两个红灯提示没有开机");
		}
	}
	
	//调高音量
	public void turnUp() {
		if (mState == POWER_ON) {
			System.out.println("调高音量");
		}else {
			System.out.println("两个红灯提示没有开机");
		}
	}
	
	//调低音量
	public void turnDown() {
		if (mState == POWER_ON) {
			System.out.println("调低音量");
		}else {
			System.out.println("两个红灯提示没有开机");
		}
	}
	
}

