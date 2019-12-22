package com.sunye.practice.secondlesson;

import org.junit.Test;

public class MyProgramSwitchTest {

	/**
	 * 假如你有⼀个机器人，你通过输入数字指令来指挥机器人，比如输入 1 让机器⼈扫地，输⼊ 2 让机 器⼈打开灯。具体指令如下：
	 * 数字指令 执⾏命令 
	 * 1 扫地 2 开灯 3 关灯 4 播放音乐 5 关闭音乐
	 *  其他数字 不能识别的指令
	 */
	
	@Test
	public void testSwitch() {

		int a = 4;
		
		switch (a) {
		
		case 1 : System.out.println("扫地"); break;
		
		case 2 : System.out.println("开灯"); break;
		
		case 3 : System.out.println("关灯 "); break;
		
		case 4 : System.out.println("播放音乐"); break;
		
		case 5 : System.out.println("关闭音乐"); break;
		
		default : System.out.println("不能识别的指令");
		
		}
	}

}
