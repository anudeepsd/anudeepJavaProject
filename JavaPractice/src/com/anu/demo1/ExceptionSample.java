package com.anu.demo1;

public class ExceptionSample {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			throw new MyException("Generated custom exception");
		} catch (MyException e) {
			System.out.println("catch block");			
			System.out.println(e.getMessage());
		}

		   

	}

}
