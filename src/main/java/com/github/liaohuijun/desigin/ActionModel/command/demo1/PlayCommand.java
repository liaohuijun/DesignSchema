package com.github.liaohuijun.desigin.ActionModel.command.demo1;
/**
 * 
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class PlayCommand implements command{

	private MediaPlayer MediaPlayer;
	
	
	
	@Override
	public void execute() {

		this.MediaPlayer.play();
		
	}



	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		MediaPlayer = mediaPlayer;
	}

	
	
}

