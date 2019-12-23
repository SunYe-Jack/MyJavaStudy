package com.sunye.string;

import org.junit.Assert;
import org.junit.Test;


public class MyStringTest {

	@Test
	public void testString() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		/* 判断是否是同一个内存地址，用== 判断*/
		Assert.assertEquals(str1, str2);
		
		String str3 = "hello world";
		String str4 = str1 + "world";
		
		/* str4是字符串变量和 双引号定义字符串 连接的字符串，它存在于堆内存中，不在常量池内
		 * 只有纯双引号定义的字符串才在常量池中 
		 */
		Assert.assertFalse(str3 == str4);
		
		String str5 = new String("hello");
		String str6 = new String("hello");
		Assert.assertFalse(str5 == str1);
		Assert.assertFalse(str5 == str6);
		
		/* intern函数是返回常量池中字符串的引用，不存在会新建再返回*/
		String str7 = str6.intern();
		Assert.assertFalse(str7 == str6);
		/* 说明str7 是指向常量池中的 "hello" */
		Assert.assertTrue(str7 == str1);
		
		String str8 = new String("hello").intern();
		Assert.assertTrue(str8 == str7);
		Assert.assertFalse(str8 == str5);
		
	}
	
	@Test 
	public void test字符串的长度() {
		
		String str =
				"hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
		/* hello,𝕝𝕠𝕠𝕜 */
		System.out.println(str);
		
		/* 返回的是String类中，char[]数组的length(),是实际的字符数组元素的个数 */
		Assert.assertTrue(str.length() == 14);
		
		/* 计算的是String中实际的字符数 */
		Assert.assertTrue(str.codePointCount(0, str.length()) == 10);
		
	}
	
	@Test
	public void testSubString() {
		
		/* subString 截取的是字符串底层中 字符数组的 指定元素，不是按照一个具体字符截取*/
		
		String str =
				"hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
		
		/* hello,𝕝𝕠𝕠𝕜 */
		System.out.println(str.substring(0, str.length()));
		
		/* 𝕝𝕠𝕠𝕜 */
		System.out.println(str.substring(6, str.length()));
		
		/* ?𝕝𝕠𝕠𝕜 -- 乱码 */
		System.out.println(str.substring(7, str.length()));
		
		/* hello,? -- 乱码 */
		System.out.println(str.substring(0, 7));
		
	    String str1 = "abc";
	    String strTmp = "a";
	    
	    System.out.println(str1.substring(0, 1));
	    Assert.assertTrue(strTmp == str1.substring(0, 1));
	}
	
	@Test
	public void test字符串拼接() {
		
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + str2;
	    str1 += str2;
		
		System.out.println(str3);
		System.out.println(str1);
		
	}
	
	@Test
	public void test字符串格式化() {
		
		/* 类似与%c %d 是一个个占位符 %n 是换行可以不用被替换 */
		
		/* %s 字符串  */
		/* %c 字符类型  */
		String str2 = String.format("大写a: %c %n", 'A');
		System.out.println(str2);
		/* %b 布尔类型  */
		/* %d 整数类型（⼗进制数）  */
		String str4 = String.format("字母a的整数值: %d %n", (int)'a');
		System.out.println(str4);
		/* %x 整数类型（⼗六进制数）  */
		/* %o 整数类型（⼋进制数）  */
		/* %f 浮点类型  */
		/* %a 浮点类型（⼗六进制数）  */
		/* %% 百分⽐类型  */
		/* %n 换⾏  */
		
	}
	
	@Test
	public void test字符串比较() {
		
		String str1 = "aB";
		String str2 = "ab";
		
		Assert.assertFalse(str1.equals(str2));
		/* 忽略大小写的比较*/
		Assert.assertTrue(str1.equalsIgnoreCase(str2));
		
	}
	
	@Test
	public void test字符串前后缀判断() {
		
		String str1 = "hello";
		
		Assert.assertFalse(str1.startsWith("e"));
		Assert.assertTrue(str1.endsWith("lo"));
		Assert.assertTrue(str1.contains("ell"));
		Assert.assertFalse(str1.contains("eoll"));
		
	}
	
	@Test
	public void test字符串查找() {
		
		String str1 = "hello world";
		/* 从左边查找*/
		Assert.assertTrue(str1.indexOf("e") == 1);
		/* 从右边查找*/
		Assert.assertTrue(str1.lastIndexOf("e") == 1);
		
		Assert.assertTrue(str1.indexOf("l", 0) == 2);
		Assert.assertTrue(str1.indexOf("l", 3) == 3);
		Assert.assertTrue(str1.indexOf("l", 4) == 9);
		
		Assert.assertTrue(str1.lastIndexOf("l", str1.length()) == 9);
		Assert.assertTrue(str1.lastIndexOf("l", 8) == 3);
		
		Assert.assertTrue(str1.indexOf("Z", 0) == -1);
		
		for(int i = 0; i > -1; i = str1.indexOf("l", i + 1)) {
			
			if(str1.charAt(i) == 'l') {
				
				System.out.println(String.format("第 %d 位是小写字母l", i));
			}
			
		}
		
		for(int i = str1.length() - 1; i > -1; i = str1.lastIndexOf("l", i - 1)) {
			
			if(str1.charAt(i) == 'l') {
				
				System.out.println(String.format("第 %d 位是小写字母l", i));
			}
			
		}
		
	}
	
	@Test
	public void test字符串trim() {
	
		String str1 = "  aa  bb f   ";
		
		System.out.println(str1.trim());
	}
	
	@Test
	public void test1() {
		
		long start = System.currentTimeMillis();
		
		String str1 = "";
		
		for(int i = 0; i < 50000; i++) {
			str1 += i;
		}
		
		/* 238890
		 * 耗时：3947 ms
		 */
		System.out.println(str1.length());
		System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
		
		
		/* 下面代码是JVM 对   ’+=’ 拼接的优化， 只是在for循环里面优化成了StringBuilder
		 * 而我们期望的是在for循环外面创建一个StringBuilder就够了。
		 */
		start = System.currentTimeMillis();
		str1 = "";
		for(int i = 0; i < 50000; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(str1);
			sb.append(i);
			str1 = sb.toString();
		}
		/* 238890
		 * 耗时：5685 ms
		 */
		System.out.println(str1.length());
		System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
		
		start = System.currentTimeMillis();
		str1 = "";

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 50000; i++) {
			sb.append(str1);
			sb.append(i);
		}
		/* 238890
		 * 耗时：1 ms
		 */
		System.out.println(sb.length());
		System.out.println(String.format("耗时：%d ms", System.currentTimeMillis() - start));
	}

}
