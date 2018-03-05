package com.github.liaohuijun.desigin.ActionModel.Mediator;
/**
 * CPU
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class CPU extends Colleague{
	
	private String dataVideo;
	private String dataSound;
	
	public CPU(Mediator mediator) {
		super(mediator);
	}

	//获取视频数据
	public String getDataVideo() {
		return dataVideo;
	}

	public String getDataSound() {
		return dataSound;
	}
	
	//解码数据
    public void decodeData(String data){
        String[] tmp = data.split(",");

        dataVideo = tmp[0];
        dataSound = tmp[1];

        mediator.changed(this);
    }
	
	
	

}

