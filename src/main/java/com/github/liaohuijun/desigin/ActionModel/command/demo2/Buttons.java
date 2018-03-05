package com.github.liaohuijun.desigin.ActionModel.command.demo2;
/**
 * 命令的请求者
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Buttons {
	
	//向左移动的命令
	private LeftCommand leftCommand;
	
	//向右移动的命令
	private RightCommand rightCommand;
	
	//快速向下的命令
	private FastToBottomCommand fastToBottomCommand;
	
	//改变形状的命令
	private TransformCommand transformCommand;

	//设置向左移动的命令
	public void setLeftCommand(LeftCommand leftCommand) {
		this.leftCommand = leftCommand;
	}

	//设置向右移动的命令
	public void setRightCommand(RightCommand rightCommand) {
		this.rightCommand = rightCommand;
	}

	//设置快速落下的命令
	public void setFastToBottomCommand(FastToBottomCommand fastToBottomCommand) {
		this.fastToBottomCommand = fastToBottomCommand;
	}

	//按下按钮向左移动
	public void setTransformCommand(TransformCommand transformCommand) {
		this.transformCommand = transformCommand;
	}
	
	//按下按钮向左移动
	public void toLeft() {
		leftCommand.execute();
	}
	
	//按下按钮向右移动
	public void toRight() {
		rightCommand.execute();
	}
	
	//按下按钮快速落下
	public void fall() {
		fastToBottomCommand.execute();
	}
	
	//按下按钮改变形状
	public void transform() {
		transformCommand.execute();
	}
	
	
	

}

