package com.github.liaohuijun.desigin.StructureModel.proxy.demo1;
/**
 * 被代理这，小明
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class XiaoMin implements ILawsuit{

	@Override
	public void submit() {

		//老板欠小明一个月工资，小明只好申请仲裁
		System.out.println("老板拖欠工资，特此申请仲裁");
		
	}

	@Override
	public void burden() {
		
		//小明证明充分，不怕告不赢
		System.out.println("这是合同和过去一年的银行流水");
		
		
	}

	@Override
	public void defend() {


		//铁证如山，辩护也没有什么好说的
		System.out.println("证据充分，不用再说什么了");
		
	}

	@Override
	public void finish() {
		
		//结果也是肯定的，必赢
		System.out.println("诉讼成功，判决老板即日起七日内结算工资");
		
	}

	
	
}

