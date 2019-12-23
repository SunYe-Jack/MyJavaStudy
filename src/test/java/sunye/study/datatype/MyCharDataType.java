package sunye.study.datatype;

public class MyCharDataType {

	public static void main(String[] args) {

		System.out.println(Character.isJavaIdentifierPart('A'));
		
		System.out.println(Character.isJavaIdentifierPart(2));
		
//		System.out.println(Character.isJavaLetter('B'));
//		
//		System.out.println(Character.isJavaLetterOrDigit('C'));
		
		System.out.println(Character.isJavaIdentifierStart('D'));
		
		System.out.println(Character.isJavaIdentifierStart('2'));
	}

}
