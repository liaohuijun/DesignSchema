package com.github.liaohuijun.desigin.ActionModel.command.demo2;
/**
 * 玩家，也是客户端
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Player {
	
	public static void main(String[] args) {
		
		test1();
		
		//test2();
		
	}
	

	private static void test1() {
		
		//俄罗斯方块游戏
		TerisMachine terisMachine = new TerisMachine();
		
		
		//根据游戏我们造4中命令
		LeftCommand leftCommand = new LeftCommand();
		RightCommand rightCommand = new RightCommand();
		FastToBottomCommand fastToBottomCommand = new FastToBottomCommand();
		TransformCommand transformCommand = new TransformCommand();
		
		//引用一个命令的具体执行者
		leftCommand.setTerisMachine(terisMachine);
		rightCommand.setTerisMachine(terisMachine);
		fastToBottomCommand.setTerisMachine(terisMachine);
		transformCommand.setTerisMachine(terisMachine);
		
		//按下按钮可以执行不同的命令
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setFastToBottomCommand(fastToBottomCommand);
		buttons.setTransformCommand(transformCommand);
		
		//具体按下哪个键玩家说的算
		buttons.toLeft();
		buttons.toRight();
		buttons.fall();
		buttons.transform();
		
		
	}
	
	//对于大部分开发者来说很容易接受下面的代码
	private static void test2() {
		
		//俄罗斯方块游戏
		TerisMachine machine = new TerisMachine();
		
		//要实现怎样的控制，直接调用相应的函数就行
		machine.toLeft();
		machine.toRight();
		machine.fastToBottom();
		machine.transform();
		
	}
	
	
}

