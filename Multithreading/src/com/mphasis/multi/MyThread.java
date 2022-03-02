package com.mphasis.multi;

public class MyThread  implements Runnable{

	static int   y; //  class - level var
	
	int z; //  object - level var
	
		public static void main(String[] args) { // main-thread
			
			
			int x;// local var  or  thread-level var
			
			System.out.println("main() executed by main-thread");
			
			MyThread mt = new MyThread();
			
			Thread t = new Thread(mt);

			t.start();	
		}
	
	@Override
	public void run() { // child-thread

			System.out.println("run() invoke");		
	}
}
