package com.sunye.string;

public class StringUtils {
	
	public static String trimAll(String strInput) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < strInput.length(); i++) {
			
			char tm = strInput.charAt(i);
			
			if (tm != ' ') {
				
				sb.append(tm);
			}
		}
		
		return sb.toString();
	}
	
	public static String trimAll(char[] strInput) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < strInput.length; i++) {
			
			if (strInput[i] != ' ') {
				
				sb.append(strInput[i] );
			}
		}
		
		return sb.toString();
	}
	
	public static String reverse(String strInput) {
		
		StringBuilder sb = new StringBuilder();
		
		char[] tm = strInput.toCharArray();
		
		for(int i = tm.length - 1; i >= 0; i--) {
			
			sb.append(tm[i]);
		}
		
		return sb.toString();
	}
}
