package com.sunye.string;

import org.junit.Test;
import org.testng.Assert;

public class MyStringUtilsTest {

	@Test
	public void testTrimAll1() {

		Assert.assertEquals(StringUtils.trimAll("  hello"), "hello");
		Assert.assertEquals(StringUtils.trimAll("hello  "), "hello");
		Assert.assertEquals(StringUtils.trimAll("  hello  "), "hello");
		Assert.assertEquals(StringUtils.trimAll("he ll o"), "hello");
		Assert.assertEquals(StringUtils.trimAll("hel      lo"), "hello");
		Assert.assertEquals(StringUtils.trimAll("  he ll o  "), "hello");
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 50000000; i++) {
			
			StringUtils.trimAll("  he ll o  ");
		}
		System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
	}
	
	@Test
	public void testTrimAll2() {

		Assert.assertEquals(StringUtils.trimAll("  hello".toCharArray()), "hello");
		Assert.assertEquals(StringUtils.trimAll("hello  ".toCharArray()), "hello");
		Assert.assertEquals(StringUtils.trimAll("  hello  ".toCharArray()), "hello");
		Assert.assertEquals(StringUtils.trimAll("he ll o".toCharArray()), "hello");
		Assert.assertEquals(StringUtils.trimAll("hel      lo".toCharArray()), "hello");
		Assert.assertEquals(StringUtils.trimAll("  he ll o  ".toCharArray()), "hello");
	
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 50000000; i++) {
			
			StringUtils.trimAll("  he ll o  ".toCharArray());
		}
		System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
	
	}
	
	@Test
	public void testReverse() {
		
		Assert.assertEquals(StringUtils.reverse("12345"), "54321");
		Assert.assertEquals(StringUtils.reverse("hello"), "olleh");
		
	}

}
