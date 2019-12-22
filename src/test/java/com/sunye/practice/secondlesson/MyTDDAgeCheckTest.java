package com.sunye.practice.secondlesson;

import org.junit.Assert;
import org.junit.Test;

public class MyTDDAgeCheckTest {

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

		/* 三段式测试编程*/
		
	
		/* 待实现的方法*/
//		String MyTDDAgeCheck.getAgeName(int age);
		
		// given
		Assert.assertEquals(MyTDDAgeCheck.getAgeName(6), "儿童");
		Assert.assertEquals(MyTDDAgeCheck.getAgeName(7), "少年");
		Assert.assertEquals(MyTDDAgeCheck.getAgeName(18), "青年");
		Assert.assertEquals(MyTDDAgeCheck.getAgeName(45), "中年");
		Assert.assertEquals(MyTDDAgeCheck.getAgeName(67), "老年");
		// when
		// then
	}

}
