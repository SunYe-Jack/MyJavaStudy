package com.sunye.innerclass;

import java.util.ArrayList;
import java.util.List;

public class MyInnerClass {
	
	private Integer index;
	private String name;
	
	public MyInnerClass(Integer index, String name) {
		
		this.index = index;
		this.name = name;
	}

	
	public class PubInnerClass{
		
		private String name;
		
		public PubInnerClass(String name) {
			
			this.name = name;
		}
		
		private class InnerClass{
			
		}
		
		public void printInfo() {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(" 外围类Index= ");
			sb.append(index);
			sb.append(" 外围类Name= ");
			sb.append(MyInnerClass.this.name);
			
			System.out.println(sb.toString());
			
			String name = "方法名";
			
			class PrintClass {
				
				public String name;
				
				public PrintClass(String name) {
					
					this.name = name;
				}
				
				void print() {
					StringBuilder sb = new StringBuilder();
					
					sb.append(" 最外围类Index= ");
					sb.append(index);
					sb.append(" 最外围类Name= ");
					sb.append(MyInnerClass.this.name);
					sb.append(" 外围类Name= ");
//					sb.append(MyInnerClass.PubInnerClass.this.name);   这样写也可以
					sb.append(PubInnerClass.this.name);
					sb.append(" 当前类Name= ");
					sb.append(this.name);
					sb.append("  当前类方法Name= ");
					sb.append(name);
					
					System.out.println(sb.toString());
				}
			}
			
//			再次修改会报错，局部内部类除了可以访问包含它的外围类外，还可以访问作⽤域范围内的局部变 量。但是，这些局部变量必须被声明为 final。
//			java8以后可以不用显示地 写出 final
//			name = "";
			
			new PrintClass("方法内部类").print();
			
			new PrintInterface() {
				@Override
				public void print() {
					
					System.out.println(name);
				}
			}.print();
			
			new AbstractPrintClass() {
				
				@Override
				public void print() {
					
					System.out.println(name);
				}
			}.print();

			new PrintClass("HAHA") {
				
				@Override
				public void print() {
					
//					此时访问的不再是局部变量name"方法名"，而是父类的成员属性name
					System.out.println(this.name);
				}
			}.print();
			
			/* 利用匿名内部类 双括号初始化*/
			List<Integer> numb = new ArrayList<Integer>() {{
				
				add(1);
				add(2);
				add(3);
				add(4);
				add(5);
			}};
			
			System.out.println(numb);
			
		}
		
	}
	
	protected class ProtInnerClass{
		
		private String name;
	}
	
	private class PriInnerClass{
		
		private String name;
	}
	
	
	public static void main(String[] arg) {
		
		MyInnerClass  myOutClass = new MyInnerClass(5, "OutClass");
		
		MyInnerClass.PubInnerClass myPublicInnerCalss = myOutClass.new PubInnerClass("InnerClass");
		
		myPublicInnerCalss.printInfo();
		
	}
}
