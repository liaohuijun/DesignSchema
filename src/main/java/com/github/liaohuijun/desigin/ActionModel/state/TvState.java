package com.github.liaohuijun.desigin.ActionModel.state;
/**
 * 电源状态接口，定义了电视操作的函数
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public interface TvState {

	//下一个频道
	void nextChannel();
	
	//上一个频道
	void preChannel();
	
	//调高音量
	void turnUp();
	
	//调低音量
	void turnDown();
	
}

