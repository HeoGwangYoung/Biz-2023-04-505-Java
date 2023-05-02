package com.callor.classes;

import java.util.Scanner;

public class ClassE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;

		System.out.println("두 개의 정수를 입력해 주세요");
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();

		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %.2f\n", num1, num2, (float) num1 / num2);
	}
}
