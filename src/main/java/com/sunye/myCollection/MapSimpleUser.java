package com.sunye.myCollection;

import java.util.HashMap;
import java.util.Map;

public class MapSimpleUser {

	public static void main(String[] args) {

		HashMap<Integer, String> hsMap = new HashMap<>();
		
		hsMap.put(1, "AAA");
		hsMap.put(2, "BBB");
		
		System.out.println(hsMap.put(1, "CCC"));
		System.out.println(hsMap.put(3, "CCC"));
		
		for(Map.Entry<Integer, String> entry: hsMap.entrySet()) {
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
