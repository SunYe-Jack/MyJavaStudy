package com.sunye.practice.secondlesson;

import org.junit.Test;

public class MyProgramIFELSETest {
	
	/**
	 * 给定⼀个年龄，然后判断该年龄属于儿童、青年、中年还是老年；年龄使用 int 类 型，只支持持整数。
	 * 年龄段的划分规则如下：
	 * 0 ~ 6岁 儿童 
	 * 7 ~ 17岁 少年
	 * 18 ~ 40岁青年 
	 * 41 ~ 59岁 中年
	 * 60及以上 老年
	 */
	@Test
	public void identifyAgeTest() {
		
		int age = 60;
		
		if (age <= 6) {
			
			System.out.println("儿童");
		} else if(age <= 17) {
			
			System.out.println("少年");
			
		} else if(age <= 40) {
			
			System.out.println("青年");
			
		} else if(age <= 59) {
			
			System.out.println("中年");

		} else {
			
			System.out.println("老年");
		}
			
	}
}
