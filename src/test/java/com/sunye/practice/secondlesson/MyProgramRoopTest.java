package com.sunye.practice.secondlesson;

import java.util.Random;

import org.junit.Test;

public class MyProgramRoopTest {

	/**
	 * 随机⽣成⼀个 0 ～ 1000 范围的整数，如果不能被30整除，则打印出数字，如果能被30整除 则退出循环。
	 * 生成 0 ~ 1000 范围的整数，使用语句 int r = new Random().nextInt(1000) 。
	 */
	@Test
	public void testDoWhile() {

		int r = 0;
		int count =0;
		
		do {
			
			r = new Random().nextInt(1000);
			count++;
			
			if (r % 30 == 0) {
				
				System.out.println(r + "能被30整除，退出");
				break;
				
			} else {

				System.out.println(r + "不能被30整除，继续");
				continue;
			}
			
		} while (r % 30  != 0);
		
		System.out.println("随机产生了" + count + "个不能被30整除的数。");
		
	}
	
	/**
	 * 随机⽣成⼀个 0 ～ 1000 范围的整数，如果不能被30整除，则继续，如果能被30整除 则打印数字, 退出循环。
	 * 生成 0 ~ 1000 范围的整数，使用语句 int r = new Random().nextInt(1000) 。
	 */
	
	@Test
	public void testWhile() {

		int r = 0;
		int count = 0;
		
		while((r = new Random().nextInt(1000)) % 30 !=0) {
			
			count++;
		}
		
		System.out.println("循环" + count + "次后输出：" + r);

//		*******************************************************************
		
		r = new Random().nextInt(1000);;
		count++;
		
		while(r % 30 != 0) {
			
			r = new Random().nextInt(1000);
			count++;
			
		};
		
		System.out.println("循环" + count + "次后输出：" + r);
		
//	*******************************************************************
		r = new Random().nextInt(1000);;
		count = 0;
		
		while(true) {
			
			r = new Random().nextInt(1000);
			count++;
			
			if (r % 30 == 0) {
				
				System.out.println(r + "能被30整除，退出");
				break;
				
			} else {
				
				continue;
			}
			
		};
		
	}
	/**
	 * 随机⽣成⼀个 0 ～ 1000 范围的整数，如果不能被30整除，则继续，如果能被30整除 则打印数字, 退出循环。
	 * 生成 0 ~ 1000 范围的整数，使用语句 int r = new Random().nextInt(1000) 。
	 */
	@Test
	public void testFor() {

		int r = new Random().nextInt(1000);
		int count = 0;
		
		for(; r % 30 != 0 ; r = new Random().nextInt(1000)) {
			
			count++;
			
		}
		
		System.out.println("循环" + count + "次后输出：" + r);
		
	}
	
	
}
