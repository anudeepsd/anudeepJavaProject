package com.anu.demo5;

public class Check {

	public Check() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {  
	    String str = null;
	    Boolean st = Boolean.FALSE;
	    System.out.println(String.valueOf(str));  // This will print a String equal to "null"    
	    
	    if (st) {
			System.out.println("abcd");
		}
	    else {
			System.out.println("1231");
		}
	    //System.out.println(str.toString()); // This will throw a NullPointerException
	    
	} 

}
