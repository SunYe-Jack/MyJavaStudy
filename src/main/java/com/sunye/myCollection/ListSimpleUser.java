package com.sunye.myCollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListSimpleUser {
	
	public static void main(String[] args) {

		/* 集合可以分两大类
		 * 1.单元素集合：全部实现了collection接口
		 *   list：列表，有序，按插入顺序排序，元素可重复，可以存NULL
		 *   Set: 集合，无序，元素不可重复，可以存NULL
		 *   Queue：队列，可以根据需求，增/删元素。如（FIFO）先进先出
		 * 
		 */
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("C");
		list.add("B");
		list.add("F");
		
		list.remove("G");
		
		printAllElement(list);
//		System.out.println(list);
		
		
		
		LinkedList<Integer> linkList = new LinkedList<>();
		
		linkList.add(1);
		linkList.add(2);
		linkList.add(3);
		linkList.add(4);
		
		printAllElement(linkList);
//		System.out.println(list);

		List list3 = new ArrayList<>();
		
		list3.add(1);
		list3.add("e");
		list3.add(new Date());
		list3.add(new ListSimpleUser().new Customer());
		
		
	}
	
	
	
	private static void printAllElement(List<?> list) {
	
		//使用泛型，无论何种类型都可以遍历
		Iterator<?> iterator = list.iterator();
		// 迭代器的位置，在各元素之间
		
		String strComa = "";
		while(iterator.hasNext()) {
			
			System.out.print(strComa + iterator.next());
			
			strComa=  ",";
		}
		
		System.out.println();
	}
	
	class Customer {
		
	}

}
