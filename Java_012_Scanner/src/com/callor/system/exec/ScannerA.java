package com.callor.system.exec;

import java.util.Scanner;

public class ScannerA {
	public static void main(String[] args) {

		// Ű���忡�� �����͸� �Է¹ޱ� ���� Ŭ����
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		// while(����) ��ɹ�
		// ������ ����� true�� ���� ������ �ݺ��ϴ� ��ɹ�
		while (true) {

			// prompt(�ȳ���) ���� �����ֱ�
			System.out.println("�� ���� ������ �Է��ϼ���");
			System.out.print("����1 >> ");
			num1 = scan.nextInt();

			System.out.print("����2 >> ");
			num2 = scan.nextInt();

			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			
			System.out.println("�����Ϸ��� QUIT�� �Է��ϼ���");
			System.out.print("$ ");
			String str = scan.nextLine();
		}
	}
}
