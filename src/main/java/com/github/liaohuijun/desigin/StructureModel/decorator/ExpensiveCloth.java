package com.github.liaohuijun.desigin.StructureModel.decorator;

public class ExpensiveCloth extends PersonCloth{

	public ExpensiveCloth(Person person) {
		super(person);
	}
	
	
	//穿了短袖
	private void dressShirt() {
		System.out.println("穿了短袖");
	}
	
	//穿了皮衣
	private void dressLeather() {
		System.out.println("穿了皮衣");
	}
	
	private void dressJean() {
		System.out.println("穿了牛仔裤");
	}


	@Override
	public void dressed() {

		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
		
	}
	
	
	
	
}

