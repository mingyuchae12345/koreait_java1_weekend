package com.kita.first.level1;

public class If {
	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 3;
		int n3 = 3;
		
		boolean result1 = (n1 == n2);
		System.out.println("result1: "+result1);
		
		boolean result2 = (n1 != n2);
		System.out.println("result2 : "+result2);
		
		boolean result3 = ((n1 != n2) && (n2 == n3));
	}
}
