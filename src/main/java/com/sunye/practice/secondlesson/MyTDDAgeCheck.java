package com.sunye.practice.secondlesson;

public class MyTDDAgeCheck {
	
	public static String getAgeName(int age) {
		
		if (age <= 6) {
			
			return "儿童";
			
		} else if(age <= 17) {
			
			return"少年";
			
		} else if(age <= 40) {
			
			return"青年";
			
		} else if(age <= 59) {
			
			return"中年";

		} else {
			
			return"老年";
		}
	}

}
