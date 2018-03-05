package com.github.liaohuijun.desigin.ActionModel.command.demo2;
/**
 * 命令接收者，俄罗斯方块游戏
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class TerisMachine {
	
	//真正处理"向左"操作的逻辑代码
	public void toLeft() {
		System.out.println("向左");
	}
	
	//真正处理"向右"操作的逻辑代理
	public void toRight() {
		System.out.println("向右");
	}
	
	//真正处理"快速向下"操作的逻辑代码
	public void fastToBottom() {
		System.out.println("快速向下");
	}
	
	//真正处理"改变形状"操作的逻辑代码
	public void transform() {
		System.out.println("改变形状");
	}

}

