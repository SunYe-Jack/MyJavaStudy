package com.sunye.myCollection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetSimpleUser {

	public static void main(String[] args) {

		/* Set 集， 不可以有重复元素，可以有NULL
		 * HashSet 无序
		 * TreeSet 有序
		 * LinkedSet
		 * Enum
		 * 
		 */
		
		HashSet<String> set = new HashSet<>();
		System.out.println(set instanceof Set);
		System.out.println(set instanceof Collection);
		System.out.println(set instanceof List);
		
		//添加元素
		set.add("A");
		set.add("D");
		set.add("B");
		set.add("C");

		//遍历-for循环
		for(int i = 0; i < set.size(); i++) {
			
			//Set中没有了get方法，因为Set是无序的，同样的索引值取出来，在不同时候可能不同
//			String str =  set.get
		}
		
		//迭代器循环
		printAllElement(set);
		
		//TreeSet
		TreeSet<String> treeSet = new TreeSet<>();
		//添加元素
		treeSet.add("E");
		treeSet.add("G");
		treeSet.add("F");
		treeSet.add("D");
		
		//迭代器循环
		printAllElement(treeSet);
		
		//迭代器循环
				printAllElement(set);
				
		//LinkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		//添加元素
		linkedHashSet.add("E");
		linkedHashSet.add("G");
		//如果要插入的元素，已经在Set中存在，add方法会直接返回false，否则添加返回true
		linkedHashSet.add("G");
		linkedHashSet.add("F");
		linkedHashSet.add("D");
		
		//迭代器循环
		printAllElement(linkedHashSet);
		
		//删除元素	remove方法，删除成功，返回true，如果传入一个Set中不存在元素，则什么也不做，返回false
//		remove(对象)

		linkedHashSet.remove("G");
		linkedHashSet.remove("7");
		printAllElement(linkedHashSet);
		
	}
	
	private static void printAllElement(Set<?> set) {
		
		//使用泛型，无论何种类型都可以遍历
		Iterator<?> iterator = set.iterator();
		// 迭代器的位置，在各元素之间
		
		String strComa = "";
		while(iterator.hasNext()) {
			
			System.out.print(strComa + iterator.next());
			
			strComa=  ",";
		}
		
		System.out.println();
	}

}
