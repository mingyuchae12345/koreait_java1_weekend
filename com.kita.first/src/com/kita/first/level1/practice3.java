package com.kita.first.level1;

import java.util.Scanner;

public class practice3 {
	public static void main(String[] args) {
//		���� ���� ������ �Է����ּ���: (��/��)
//		������ �Է����ּ���:
		
//		���� ����: 60
//		���� ���� : 70
		
//		"��� �̸��Դϴ�."
//		"����Դϴ�."
//		"��� �ʰ��Դϴ�."
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("���� ���� ������ �Է����ּ���(��/��): ");
		String type = sc.next();
		System.out.println("������ �Է��� �ּ���: ");
		int score = sc.nextInt();
		
		int avg = 0;
		
		if("��".contentEquals(type)) {
			avg = 60;
			
		}	else if("��".contentEquals(type)) {
			avg = 70;
		}	else {
			System.out.println("�߸� �Է��߽��ϴ�");
		} if(avg == 0) {
			System.out.println("�ٽ� �Է����ּ���.");
		} else if(score < avg) {
			System.out.println("��� �̸��Դϴ�.");
		} else if(score > avg) {
			System.out.println("��� �ʰ��Դϴ�.");
		} else {
			
		}
	}
}