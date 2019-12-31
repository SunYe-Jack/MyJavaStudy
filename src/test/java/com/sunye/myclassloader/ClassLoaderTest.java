package com.sunye.myclassloader;

import java.net.URL;

import org.junit.Test;

public class ClassLoaderTest {

	@Test
	public void test() {

		URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		for(URL url : urls){
			
			System.out.println(url.toExternalForm());
		}
	}
	
	@Test
	public void testLoader() {
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		/*sun.misc.Launcher$AppClassLoader@28d93b30*/
		System.out.println(loader);
		
		/*sun.misc.Launcher$ExtClassLoader@511d50c0*/
		System.out.println(loader.getParent());
		
		/*---- null,因为根类加载器（启动类加载器是C++实现，所以Java获取不到内容）*/
		System.out.println(" ---- " + loader.getParent().getParent());
	}

}
