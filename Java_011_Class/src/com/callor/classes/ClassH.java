package com.callor.classes;

import java.util.Scanner;

public class ClassH {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
		while(true) {
			System.out.println("�ΰ��� ������ �Է� ���ּ���");
			System.out.println("�ߴ��Ϸ��� exit �Է�");
			System.out.print("���� 1 >> ");
			num1 = scan.nextInt();
			System.out.print("���� 2 >> ");
			num2 = scan.nextInt();
			
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
			System.out.printf("%d / %d = %f.2", num1, num2, (float)num1 / num2);
		}
	}
}
