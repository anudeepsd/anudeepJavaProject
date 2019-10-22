package com.anu.demo5;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		A a = new B();
		((B) a).show(); //since "show()" is only available with B reference
		a.disp();
	}
}
	class A {

		public A() {
			System.out.println("Class A cons");
		}
		
		public void disp() {
			System.out.println(" A - disp() ");
			
		}

	}
	
	class B extends A{

		public B() {
			System.out.println("Class B cons");
		}
		public void disp() {
			System.out.println(" B - disp() ");
			
		}
		public void show() {
			System.out.println(" B - show() ");
			
		}
	}	
	

