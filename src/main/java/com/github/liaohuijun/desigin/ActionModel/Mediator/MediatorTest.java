package com.github.liaohuijun.desigin.ActionModel.Mediator;
/**
 * 中介者模式 测试类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class MediatorTest {
	
	public static void main(String[] args) {
		
		test();
		
	}
	
	public static void test() {
		
		//构造一个主板
		MainBoard mediator = new MainBoard();
		
		//分别构造各种零件
		CDDevice cdDevice = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		GraphicsCard graphicsCard = new GraphicsCard(mediator);
		SoundCard soundCard = new SoundCard(mediator);
		
		//将各个零件安装到主板
		mediator.setCdDevice(cdDevice);
		mediator.setCpu(cpu);
		mediator.setSoundCard(soundCard);
		mediator.setGraphicsCard(graphicsCard);
		
		//完成后可以开始播放片
		cdDevice.load();
		
	}

}

