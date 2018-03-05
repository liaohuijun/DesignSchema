package com.github.liaohuijun.desigin.ActionModel.strategy;
/**
 * 策略模式
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class StrategyTest {
	
	public static void main(String[] args) {
		
		test();
		
	}
	
	
	public static void test() {
		
		//商场
		Shop shop = new Shop();
		
		//普通会员、白金会员、黄金会员
		NormalMember normalMember = new NormalMember();
		WhiteGoldMember whiteGoldMember = new WhiteGoldMember();
		YellowGoldMember yellowGoldMember = new YellowGoldMember();
		
		//一本书100块钱
		double price = 100;
		
		shop.setStrategy(normalMember);
		System.out.println("我是普通会员，我不打折，价格为：" + shop.calcPrice(price));
		
		shop.setStrategy(whiteGoldMember);
		System.out.println("我是白金会员，我打9折，价格为：" + shop.calcPrice(price));
		
		shop.setStrategy(yellowGoldMember);
		System.out.println("我是黄金会员。我打8折，价格为：" + shop.calcPrice(price));
		
		
	}

}

