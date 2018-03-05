package com.github.liaohuijun.desigin.ActionModel.Mediator;
/**
 * 显卡类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class GraphicsCard extends Colleague{

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}
	
	//播放视频
	public void videoPlay(String data) {
		System.out.println("视频：" + data);
	}
	
}

