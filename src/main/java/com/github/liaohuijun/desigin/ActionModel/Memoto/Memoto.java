package com.github.liaohuijun.desigin.ActionModel.Memoto;
/**
 * 备忘录，只是用来存储游戏过程中的数据
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Memoto {
	
	public int mCheckPoint;  //游戏的关卡数
	public int mLifeValue;	 //游戏的血量
	
	
	@Override
	public String toString() {
		return "Memoto [mCheckPoint=" + mCheckPoint + ", mLifeValue=" + mLifeValue + "]";
	}

	
	
	
	

}

