package com.callor.classes;

import java.util.Scanner;

public class ClassH {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
		while(true) {
			System.out.println("두개의 정수를 입력 해주세요");
			System.out.println("중단하려면 exit 입력");
			System.out.print("정수 1 >> ");
			num1 = scan.nextInt();
			System.out.print("정수 2 >> ");
			num2 = scan.nextInt();
			
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
			System.out.printf("%d / %d = %f.2", num1, num2, (float)num1 / num2);
		}
	}
}
