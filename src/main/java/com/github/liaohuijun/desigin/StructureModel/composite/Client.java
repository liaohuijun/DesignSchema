package com.github.liaohuijun.desigin.StructureModel.composite;
/**
 * 客户端测试类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月12日
 */
public class Client {
	
	public static void main(String[] args) {
		test();
	}

	
	public static void test() {
		
		//构造一个根节点
		Composite root = new Composite("root");
		
		//构造两个枝干节点
		Composite branch1 = new Composite("branch1");
		Composite branch2 = new Composite("branch2");
		
		//构造两个叶子节点
		Leaf leaf1 = new Leaf("left1");
		Leaf leaf2 = new Leaf("left2");
		
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		
		root.addChild(branch1);
		root.addChild(branch2);
		
		root.doSomething();
		
	}
	
}

