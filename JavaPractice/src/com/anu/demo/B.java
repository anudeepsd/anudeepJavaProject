package com.anu.demo;

public class B extends A{

	
	public B() {
		//super();
		System.out.println("Constructor B"+ this.getClass().getName());
	}

	public void name() {
		System.out.println(" name() :" +this.getClass().getName());
	}
}
