package com.anu.demo2;

public class Thread1 implements Runnable {

	private String name = null;
	public Thread1(String str) {
		this.name = str;
		// System.out.println("instantiated class : " + this.getClass().getName());
		System.out.println("This thread is : " + Thread.currentThread().getName() + " name is : " +this.name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i+ ") Running  : " + Thread.currentThread().getName() + " name is : " +this.name);
			//System.out.println(i);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
