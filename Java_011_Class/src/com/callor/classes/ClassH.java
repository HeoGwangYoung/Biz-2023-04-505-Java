package com.callor.classes;

import java.util.Scanner;

public class ClassH {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		while(true) {
			System.out.println("�ΰ��� ������ �Է� ���ּ��� �����Ϸ��� -�Է�");
			
			System.out.print("���� 1 >> ");
			String str = scan.nextLine();
			if (str.equals("-")) {
				break;
			}
			num1 = Integer.parseInt(str);
			
			System.out.print("���� 2 >> ");
			str = scan.nextLine();
			if (str.equals("-")) {
				break;
			}
			num2 = Integer.parseInt(str);
			
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("%d / %d = %f.2\n", num1, num2, (float)num1 / num2);
		}
		System.out.println("OVER");
	}
}
