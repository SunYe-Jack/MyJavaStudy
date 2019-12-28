package sunye.study.myclass;

import java.util.Arrays;

public class JavaClass extends FatherJavaClass{

	// 类变量
	 private static String classField;
	 // 实例变量
	 private String field;
	 
	 // 实例代码块
	 {
		 field = "非静态块初始化实例变量";
		 classField = "非静态块初始化类变量";
		 
		 System.out.println("filed = " +field);
		 System.out.println("classField = " + "  " + classField);
	 }
	 // 静态代码块
	 static {
//		   报错 不能再静态块给 实例变量赋值
//		 field = "实例变量";
		 classField = "静态块初始化类变量";
		 System.out.println("classField = " + "  " + classField);
	 }
	 
	 // 构造方法
	 public JavaClass() {
		 field = "构造方法中初始化实例变量";
		 classField = "构造方法中初始化类变量";
		 System.out.println("filed = " +field);
		 System.out.println("classField = " + "  " + classField);
	 }
	 
	// 构造方法
	 public JavaClass(String field) {
		 /*可以 this 来调⽤另⼀个构造器，并且调⽤语句只能出现在第⼀句。super()也是调用构造器（父类的），也得是出现在第一句*/
		 this();
//		 super();
		 classField = "构造方法中初始化类变量";
		 System.out.println("filed = " +field);
		 System.out.println("classField = " + "  " + classField);
	 }
	// 构造方法
	 public JavaClass(String field, String classField) {
		 this(field);
		 this.classField = classField;
		 System.out.println("filed = " +field);
		 System.out.println("classField = " + "  " + classField);
	 }
	 
	 // 方法
	 public void method() {
		 field = "非静态方法赋值实例变量";
		 classField = "非静态方法赋值类变量";
	 }
	 
	 public static void method2() {
//		 报错 不能在静态方法中给 实例变量赋值
//		 field = "非静态方法赋值实例变量";
		 classField = "静态方法赋值类变量";
	 }
	 
	 // 内部类
	 class InnerClass {
	 }
	 
	 public void print(String arg, int... numbs) {
		 
		 for(int numb: numbs) {
			 
			 System.out.println(numb);
		 }
		 
		 System.out.println(Arrays.toString(numbs));
	 }
}
