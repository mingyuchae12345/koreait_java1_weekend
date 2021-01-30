package com.kita.first.level1;

import java.util.Scanner;

public class Science {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자값을 입력하시오 : ");
		int num = scan.nextInt();
		System.out.println("num: " + num);
		
		System.out.println("문자열을 입력하시오: ");
		String str = scan.next();
		System.out.println("str: " + str);
	}
}
