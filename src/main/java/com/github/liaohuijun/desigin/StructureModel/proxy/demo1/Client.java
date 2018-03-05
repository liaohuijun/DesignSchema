package com.github.liaohuijun.desigin.StructureModel.proxy.demo1;

public class Client {
	
	public static void main(String[] args) {
		
		//构造一个小明
		ILawsuit xiaomi = new XiaoMin();
		
		//构造一个律师并将小明作为构造参数传递进去
		ILawsuit lawsuit = new Lawyer(xiaomi);
		
		//律师提交诉讼
		lawsuit.submit();
		
		//律师进行举证
		lawsuit.burden();
		
		//律师代替小明进行辩护
		lawsuit.defend();
		
		//完成诉讼
		lawsuit.finish();
		
	}
	

}

