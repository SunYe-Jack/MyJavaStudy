package com.sunye.practice.secondlesson;

import org.junit.Test;

public class MyProgramFLowTest {

	@Test
	public void testBlockScope() {
		
		int n1 = 100;
		
		System.out.println(n1);
		
		{
//			报错 : 因为 外面n1的作用域是整个函数，此时定义的n1与外面定义的冲突。
//			int n1= 101;
			int n2 = 200;
			
//			不报错，因为外面n1的作用域是整个函数。
			System.out.println(n1);
			{
//				n2能被访问到，因为嵌套的代码块中，子块可以访问父块的内容。
				System.out.println(n2);
			}
		}
//		会报错，是因为代码块{}里的n2其作用域仅限于 被定义的代码块以及其子代码块，出了代码块，作用域失效，n2访问不到了。
//		System.out.println(n2);	
		
//		此n2是不报错，因为代码块{}里的n2其作用域仅限于 被定义的代码块以及其子代码块，跟此时的定义的n2不冲突。
		int n2 = 201;
		System.out.println(n2);
		
	}
	
}
