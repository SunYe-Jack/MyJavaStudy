package sunye.study.datatype;

public class MyIntDataType {


	static {
		num = 4;
//		num ++;
	}
	static int num = 3;
	
	public static void main(String[] args) {
		
		float a = 3.1F;
		float b = 3.6F;
		double d = 3.9;
		float c = a + b;
		

	    int value = Integer.MAX_VALUE;
		int value_1 = Integer.MAX_VALUE + 1;
		int value_2 = Integer.MAX_VALUE + Integer.MAX_VALUE;
		int value_3 = -2;
		int value_4 = Integer.MIN_VALUE;
		
		System.out.println("最大值                = " + value + "   " + Integer.toBinaryString(value));
		System.out.println("最大值+1    = " + value_1 + " " + Integer.toBinaryString(value_1));
		System.out.println("最大值+最大值  = " + value_2 + "           " + Integer.toBinaryString(value_2));
		System.out.println("整数-2     = " + -2 + "           " + Integer.toBinaryString(-2));
		System.out.println("最小值                 = " + value_4 + "  " + Integer.toBinaryString(value_4));
		
			
	}
	


}
