package com.sunye.innerclass;

import org.junit.Test;

public class CalcMinMaxTest {

	@Test
	public void test() {

		int[] pair1= new CalcMinMax().calc(1, 4, 9, 3, 2);
		System.out.println("最⼩值：" + pair1[0]);
		System.out.println("最⼤值：" + pair1[1]);
		
		CalcMinMax.Pair pair = new CalcMinMax().calc2(1, 4, 9, 3, 2);
		System.out.println("最⼩值：" + pair.getMin());
		System.out.println("最⼤值：" + pair.getMax());
	}

}
