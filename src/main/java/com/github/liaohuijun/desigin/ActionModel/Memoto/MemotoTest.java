package com.github.liaohuijun.desigin.ActionModel.Memoto;
/**
 * 测试备忘录模式
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class MemotoTest {
	
	public static void main(String[] args) {
		
		test();
	}

	
	public static void test() {
		
		//创建游戏
		CallOfDuty game = new CallOfDuty();
		
		//1、打游戏
		game.play();
		
		//2、游戏存档
		Caretaker caretaker = new Caretaker();
		caretaker.saveMemoto(game.createMeoto());
		
		//3、退出游戏
		game.quit();
		
		//4、恢复游戏
		CallOfDuty newGame = new CallOfDuty();
		newGame.restore(caretaker.getMemoto());
		
	}
	
}

