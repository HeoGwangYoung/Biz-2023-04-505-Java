package com.callor.classes;

import java.util.Scanner;

public class ClassC {
	public static void main(String[] args) {
		/*
		 * Ű���带 ���ؼ� �����͸� �Է¹ް� ������ ���� �⺻ �����ͷ� ����Ѵ� 
		 * �̶� Ű���带 ���ؼ� �����͸� �Է¹ޱ� ���� ����
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		/*
		 * �ڵ尡 ����Ǵ� ���߿� prompt�� �����ְ� 
		 * ����ڷ� ���� �� ���� ������ �Է¹��� �� �����Ͽ� ����ϱ�
		 */
		System.out.println("�� ���� ������ Ű����� �Է��ϼ���");
		System.out.print("����1 >> ");
		num1 = scan.nextInt();
		System.out.print("����2 >> ");
		num2 = scan.nextInt();

		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
}