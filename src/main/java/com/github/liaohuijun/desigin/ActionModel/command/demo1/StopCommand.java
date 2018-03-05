package com.github.liaohuijun.desigin.ActionModel.command.demo1;
/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class StopCommand implements command{

	MediaPlayer mediaPlayer;

	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void execute() {
		mediaPlayer.stop();
		
	}
	
	
	
}

