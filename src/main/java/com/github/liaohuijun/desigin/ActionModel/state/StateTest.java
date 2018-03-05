package com.github.liaohuijun.desigin.ActionModel.state;
/**
 * 客户端测试类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class StateTest {
	
	public static void main(String[] args) {
		
		test();
	}
	
	public static void test() {
		
		//电视
		TvControl tvControl = new TvControl();
		
		//改变状态，看看是否影响行为
		tvControl.powerOn();
		
		//下一个频道
		tvControl.nextChannel();
		
		//调大音量
		tvControl.turnUp();
		
		//设置关机状态
		tvControl.powerOff();
		
		//调高音量，此时不会生效
		tvControl.turnUp();
		
	}

}

