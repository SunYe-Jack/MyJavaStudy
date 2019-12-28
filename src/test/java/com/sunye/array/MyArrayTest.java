package com.sunye.array;

import java.util.Arrays;

import org.junit.Test;

public class MyArrayTest {

	@Test
	public void testArray() {

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
		
		/* 数组的循环
		 * 1. for 循环使⽤数组下标 
		 * 2. for each 循环 
		 * 3. Java 8 中新增的 Lambda 表达式
		 * */
		
		int[] intArr3     = {7, 8, 9};
		Integer[] intArr4 = {0, 1, 2};
		Arrays.asList(intArr3).forEach(val -> System.out.println(val));
		Arrays.asList(intArr4).forEach(val -> {
			if(val % 2 == 0)
				System.out.println(val);
		});

	}
	
	@Test
	public void testArrayCopy() {
		
		/*
		 * Java 中数组拷⻉常⽤的两种⽅式： 
		 * 1. 使用工具类 Arrays.copyOf 或 Arrays.copyOfRange 
		 * 2. 使⽤底层⽅法 System.arraycopy
		 * 
		 * */
		Integer[] arr1 = {1, 2, 3, 4, 5};
//		拷贝数组 arr1 的前 3 个元素
		Integer[] arr3 = Arrays.copyOf(arr1, 3);
//		拷贝数组 arr1 的第 1 位到第 3 位的元素（不包括第 3 位）
		Integer[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
//		 拷贝数组 arr2 的后 3 位到 arr1 到后 3 位
		Integer[] arr2 = {6, 7, 8, 9, 10};
		System.arraycopy(arr2, 2, arr1, 2, 2);
		System.out.println(Arrays.toString(arr1));
	}

}
