package com.github.liaohuijun.desigin.ActionModel.state;
/**
 * 开机状态
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class PowerOnState implements TvState{

	@Override
	public void nextChannel() {
		System.out.println("下一个频道");
		
	}

	@Override
	public void preChannel() {
		System.out.println("上一个频道");
		
	}

	@Override
	public void turnUp() {
		System.out.println("调高音量");
	}

	@Override
	public void turnDown() {
		System.out.println("调低音量");
	}

	
	
}

