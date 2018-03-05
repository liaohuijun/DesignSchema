package com.github.liaohuijun.desigin.ActionModel.Chain;
/**
 * 责任链模式，有两种情况：
 * 1、先自己处理，自己处理不了，再交给上级处理
 * 2、线交给上级处理，上级处理不了，再自己处理（比如类的加载机制）
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class ChainTest {
	
	public static void main(String[] args) {
		
		test();
		
	}

	
	public static void test() {
		
		Leader groupLeader = new GroupLeader();
		Leader directorLeader = new Director();
		Leader boss = new Boss();
		
		groupLeader.setPreLeader(directorLeader);
		directorLeader.setPreLeader(boss);
		boss.setPreLeader(null);
		
		groupLeader.handleRequest(5000);
		
	}
	
}

