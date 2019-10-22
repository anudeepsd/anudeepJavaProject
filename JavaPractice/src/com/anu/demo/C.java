package com.anu.demo;

public class C extends B{

	
	public C() {
		//super();
		System.out.println("Constructor C"+ this.getClass().getName());
	}

	public void name() {
		System.out.println(" name() :" +this.getClass().getName());
	}
}
