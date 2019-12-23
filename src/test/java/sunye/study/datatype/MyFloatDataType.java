package sunye.study.datatype;

public class MyFloatDataType {

	public static void main(String[] args) {

		testNaNAndInfinity();
	}
	
	static void testDouble() {
		System.out.println("1: " + 3 * 0.1);
		
		System.out.println("2: " + 0.3 * 0.1);
		
		System.out.println("3: " + 0.3);
		
		System.out.println("4: " + (0.1 + 0.2));
		
		System.out.println("5: " + 2 * 0.1);
	}

	static void testNaNAndInfinity() {
		
		int i= 1;
		
		System.out.println("1: " + Double.NaN );
		
		System.out.println("2: " + (Double.NaN == Double.NaN));

		System.out.println("3: " + Double.isNaN(Double.NaN));
		
		System.out.println("4: " + (Double.NaN != Double.NaN));
		
		/* 整型的0 报出异常*/
		//System.out.println("5: " + (0 / 0));
		
		System.out.println("6: " + (0.0 / 0.0));
		
		System.out.println("7: " + Double.POSITIVE_INFINITY);
		
		System.out.println("8: " + Double.NEGATIVE_INFINITY);
		
		System.out.println("9: " + (Double.POSITIVE_INFINITY == Double.POSITIVE_INFINITY));
		
		System.out.println("10: " + Double.POSITIVE_INFINITY * 0);
		
		System.out.println("11:" + Double.POSITIVE_INFINITY * 2);
		
		System.out.println("12:" + Double.POSITIVE_INFINITY / 0);
		
		System.out.println("13:" + Double.POSITIVE_INFINITY / 0.0);
	}
	
}
