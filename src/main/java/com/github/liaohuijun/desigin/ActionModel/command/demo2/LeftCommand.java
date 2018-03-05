package com.github.liaohuijun.desigin.ActionModel.command.demo2;
/**
 * 向左移动的命令
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class LeftCommand  implements Command{

	//持有一个命令执行者的引用
	TerisMachine terisMachine;

	public void setTerisMachine(TerisMachine terisMachine) {
		this.terisMachine = terisMachine;
	}

	@Override
	public void execute() {

		//调用游戏机里面的方法具体实现
		terisMachine.toLeft();
		
	}
	
	
	
	
	
}

