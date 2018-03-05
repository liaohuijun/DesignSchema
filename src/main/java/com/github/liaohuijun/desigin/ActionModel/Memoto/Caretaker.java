package com.github.liaohuijun.desigin.ActionModel.Memoto;
/**
 * 管理备忘录，有可能很多个备忘录，该例子中只有一个
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Caretaker {
	
	private Memoto memoto;

	public Memoto getMemoto() {
		return memoto;
	}

	public void saveMemoto(Memoto memoto) {
		this.memoto = memoto;
	}
	
	

}

