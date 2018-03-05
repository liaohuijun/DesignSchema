package com.github.liaohuijun.desigin.StructureModel.proxy.demo1;
/**
 * 代理律师
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class Lawyer implements ILawsuit{

	//持有一个具体的被代理这的引用
	private ILawsuit mLawsuit;
	
	public Lawyer(ILawsuit lawsuit) {
		mLawsuit = lawsuit;
	}
	
	
	@Override
	public void submit() {
		mLawsuit.submit();
		
	}

	@Override
	public void burden() {
		mLawsuit.burden();
		
	}

	@Override
	public void defend() {
		mLawsuit.defend();
		
	}

	@Override
	public void finish() {
		mLawsuit.finish();
		
	}

	
	
}

