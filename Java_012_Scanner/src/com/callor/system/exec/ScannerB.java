package com.callor.system.exec;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.println("�� ���� ������ �Է��ϼ���");
			System.out.print("����1 (QUIT:����) >> ");
			String strNum1 = scan.nextLine();
			if (strNum1.equals("QUIT")) {
				break;
			}
			/*
			 * ���� Ű����� 30 �̶�� ���� �Է��ϰ� Enter ������ strNum1 �������� ���ڿ��� ������ "30" ���ڿ��� ����ȴ� ����������
			 * strNum2 ���� ���ڿ��� ���ڰ� ����ȴ� �� �� ������ ���������ϸ� ���ڿ� ���� ������ �ǰ� ������ 4Ģ ������ ������ ����
			 * 
			 * ���ϴ� ������ ������ ���ڰ��� 4Ģ �����̴� ���� �Էµ� ���ڿ��� ���ڸ� ���� ������ �����ͷ� ��ȯ�� �� �־�� �Ѵ�
			 */

			// ���ڿ��� ���ڸ� ������ ���� �����ͷ� ��ȯ�ϱ�
			num1 = Integer.valueOf(strNum1);
			System.out.println("����2 (QUIT:����) >> ");
			String strNum2 = scan.nextLine();
			if (strNum2.equals("QUIT")) {
				break;
			}
			num2 = Integer.valueOf(strNum2);
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("%d / %d = %.2f\n", num1, num2, (float)num1 / num2);
		}
		System.out.println("GAME OVER");
		scan.close();
	}
}
