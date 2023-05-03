package com.callor.system.exec;

import java.util.Scanner;

public class ScannerE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.println("�� ���� ������ �Է��ϼ���");

			String strNum1 = "";
			String strNum2 = "";

			while (true) {
				System.out.print("����1 (QUIT:����) >> ");
				strNum1 = scan.nextLine();
				if (strNum1.equals("QUIT")) {
					break;
				}

				try {
					num1 = Integer.valueOf(strNum1);
				} catch (Exception e) {
					System.out.println("����1�� �������� �Է��ؾ� �մϴ�");
					continue;
				}
				break;
			}

			if (strNum1.equals("QUIT")) {
				break;
			}

			while (true) {
				System.out.print("����2 (QUIT:����) >> ");
				strNum2 = scan.nextLine();
				if (strNum2.equals("QUIT")) {
					break;
				}
				try {
					num2 = Integer.valueOf(strNum2);

				} catch (Exception e) {
					System.out.println("����2�� �������� �Է��ؾ� �մϴ�");
					continue;
				}
				break;
			}

			if (strNum2.equals("QUIT")) {
				break;
			}

			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("%d / %d = %.2f\n", num1, num2, (float) num1 / num2);
		}
		System.out.println("GAME OVER");
		scan.close();
	}
}
