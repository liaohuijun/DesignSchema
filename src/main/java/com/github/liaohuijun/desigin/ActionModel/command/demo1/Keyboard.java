package com.github.liaohuijun.desigin.ActionModel.command.demo1;
/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Keyboard {

	private PlayCommand playCommand;
	private StopCommand stopCommand;
	private RewindCommand rewindCommand;
	public void setPlayCommand(PlayCommand playCommand) {
		this.playCommand = playCommand;
	}
	public void setStopCommand(StopCommand stopCommand) {
		this.stopCommand = stopCommand;
	}
	public void setRewindCommand(RewindCommand rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	
	
	public void play() {
		playCommand.execute();
	}
	
	public void stop() {
		stopCommand.execute();
	}
	
	public void rewind() {
		rewindCommand.execute();
	}
	
}

