package com.github.liaohuijun.desigin.ActionModel.Mediator;
/**
 * 声卡类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class SoundCard extends Colleague{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}
	
	//播放音频
	public void soundPlay(String data) {
		System.out.println("音频：" + data);
	}
	
}

