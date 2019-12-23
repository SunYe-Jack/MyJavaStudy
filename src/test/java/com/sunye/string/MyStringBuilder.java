package com.sunye.string;

import org.junit.Assert;
import org.junit.Test;

public class MyStringBuilder {

	@Test
	public void test() {
		
		String str1 = "hello";
		str1 += ",";
		str1 += "world";
		str1 += ".";
		
		System.out.println(str1);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("hello");
		sb.append(",");
		sb.append("world");
		sb.append(".");
//		sb.append(false);
		
		System.out.println(sb.toString());
		
		Assert.assertTrue(sb.length() == 12);
		
		sb.setLength(10);
		/* 输出结果是 : hello,worl */
		System.out.println(sb.toString());
		
		sb.setLength(20);
		/* 输出结果是 : hello,worl */
		System.out.println(sb.toString());
		
		for(char a : sb.toString().toCharArray())
			System.out.print(a + "-");
	}

}
