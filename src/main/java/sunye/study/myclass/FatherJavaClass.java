package sunye.study.myclass;

public class FatherJavaClass {
	
	// 父类父类类变量
	 private static String faClassField;
	 // 父类实例变量
	 private String faField;
	 
	 // 实例代码块
	 {
		 faField = "非静态块初始化父类实例变量";
		 faClassField = "非静态块初始化父类类变量";
		 
		 System.out.println("父类filed = " + faField);
		 System.out.println("父类classField = " + "  " + faClassField);
	 }
	 // 静态代码块
	 static {
//			   报错 不能再静态块给 实例变量赋值
//			 field = "父类实例变量";
		 faClassField = "静态块初始化父类类变量";
		 System.out.println("父类classField = " + "  " + faClassField);
	 }
	 
	 // 构造方法
	 public FatherJavaClass() {
		 faField = "构造方法中初始化实例变量";
		 faClassField = "构造方法中初始化父类类变量";
		 System.out.println("父类filed = " +faField);
		 System.out.println("父类classField = " + "  " + faClassField);
	 }

}
