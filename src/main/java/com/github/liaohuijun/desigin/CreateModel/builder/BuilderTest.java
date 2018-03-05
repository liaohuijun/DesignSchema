package com.github.liaohuijun.desigin.CreateModel.builder;

public class BuilderTest {
	
	public static void main(String[] args) {
		
		test();
	}

	public static void test() {
		Computer computer = new Computer.ComputerBuilder()
				.setMEM("8G")
				.setHDD("西部数据500G")
				.setCPU("i7")
				.build();
		
		System.out.println(computer);
	}
}

