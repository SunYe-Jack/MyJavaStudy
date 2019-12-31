package com.sunye.myThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTread {
	
	static final Long timeS = 500L;

	static Thread t1 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t1 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	});
	
	static Thread t2 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t2 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	});
	
	static Thread t3 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t3 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	});
	
	static Thread t4 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t4 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	});
	
	static Thread t5 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t5 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	});
	
	static Thread t6 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t6 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	});
	
	static Thread t7 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t7 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	});
	
	static Thread t8 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			System.out.println("I am t8 ...");
			try {
				Thread.sleep(timeS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	});
	
	static ExecutorService executor = Executors.newSingleThreadExecutor();
	
	public static void main(String[] args) throws InterruptedException {

		test2();
	}
	
	public static void test1() throws InterruptedException {
		
		t1.start();
		t1.join(timeS);
		t2.start();
		t2.join(timeS);
		t3.start();
		t3.join(timeS);
		t4.start();
		t4.join(timeS);
		t5.start();
		t5.join(timeS);
		t6.start();
		t6.join(timeS);
		t7.start();
		t7.join(timeS);
		t8.start();
	}
	
	public static void test2() {
		
		executor.submit(t1);
		executor.submit(t2);
		executor.submit(t3);
		executor.submit(t4);
		executor.submit(t5);
		executor.submit(t6);
		executor.submit(t7);
		executor.submit(t8);
	}

}
