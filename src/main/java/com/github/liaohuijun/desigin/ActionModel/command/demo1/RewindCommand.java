package com.github.liaohuijun.desigin.ActionModel.command.demo1;
/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class RewindCommand implements command{

	MediaPlayer mediaPlayer;
	
	
	
	@Override
	public void execute() {

		mediaPlayer.rewind();
		
	}



	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	
	
}

