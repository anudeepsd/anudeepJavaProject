package com.anu.demo2;

public class ThreadSample{

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1("T-1"));
		Thread t2 = new Thread(new Thread1("T-2"));

		t1.start();
		t2.run();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
