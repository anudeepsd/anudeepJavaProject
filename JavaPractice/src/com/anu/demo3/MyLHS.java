package com.anu.demo3;

import java.util.LinkedHashSet;

public class MyLHS {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
		LinkedHashSet<String> lhs3 = new LinkedHashSet<>();
		
		lhs.add("abc");
		lhs.add("ANU");
		lhs.add("abcd");
		lhs.add("qwe");
		
		lhs2.add("QWE");
		lhs2.add("ewq");
		lhs2.add("EWQ");
		lhs2.add("app");
		lhs2.add("appd");
		
		lhs3.addAll(lhs2);
		lhs3.remove("appd");
		lhs3.add("appd");
		
		
		
		System.out.println(lhs3.equals(lhs2));

	}

}
