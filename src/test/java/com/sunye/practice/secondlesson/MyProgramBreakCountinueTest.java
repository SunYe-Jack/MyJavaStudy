package com.sunye.practice.secondlesson;

import org.junit.Test;

public class MyProgramBreakCountinueTest {

	@Test
	public void testBreak() {

		for(int i = 1; i < 10; i++) {
			
			for(int j = 1; j < 10; j++) {
				
				if (j % 2 == 0) {
					
//					break;
					continue;
				}
				System.out.println("j = " + j);
			}
			
			System.out.println("i = " + i);
			
		}
		
	}


}
