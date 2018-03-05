package com.github.liaohuijun.desigin.ActionModel.Iterator;
/**
 * 迭代器接口
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public interface Iterator {

	//是否还有下一个元素
	boolean hashNext();
	
	//返回当前位置的元素，并将位置移动下一位
	Object next();
	
}

