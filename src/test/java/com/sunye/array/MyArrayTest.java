package com.sunye.array;

import java.util.Arrays;

import org.junit.Test;

public class MyArrayTest {

	@Test
	public void test() {

		int[] intArr     = new int[3];
		String [] strArr = new String[3];
		double[] douArr  = new double[3];
		float[]  floArr  = new float[3];
		boolean[] booArr  = new boolean[3];
//		int[] intArr1 = new int[] = {1, 2, 3};
		
		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(douArr));
		System.out.println(Arrays.toString(floArr));
		System.out.println(Arrays.toString(booArr));
		
//		直接使⽤⼤括号⽅法赋值，数组的⻓度为⼤括号内元素的个数，不能在 [] 内指定⻓度，否则编译器会报错。
//		可以省略前边的 new 操作符⽽直接使⽤⼤括号。
		int[] intArr1     = new int[] {2, 2, 3};
		int[] intArr2     = {4, 5, 6};
		
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(intArr2));
		
	}

}
