package com.callor.classes;

import java.util.Scanner;

public class ClassF {

	public static void main(String[] args) {
		/*
		 * leak(�޸�, �ڿ� ����)
		 */
		Scanner scan = new Scanner(System.in);

		int num1;
		int num2;

		for (int i = 0; i < 3; i++) {
			System.out.println("�� ���� ������ �Է��� �ּ���");
			System.out.print("����1 >> ");
			num1 = scan.nextInt();
			System.out.print("����2 >> ");
			num2 = scan.nextInt();

			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d �� %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("%d �� %d = %.2f\n", num1, num2, (float) num1 / num2);
		}
		/*
		 * scan ��ü�� �ϵ������ Ű����� ����� ������ ���� ������ ������ �ִ� ����
		 * �ϵ� ���� Ű����� �ü���� ���������� ���� ������ �ʿ�� �ϰ� 
		 * �� ������ ������ ��򰡿� �����ϰ� �ִ� �����̴�
		 * �� ���·� ������Ʈ�� ����Ǹ�, �����ҿ� ����� ������ �Ҹ�Ǵµ� ����� �ð��� �ҿ�� ���̴�
		 * �׷��� ����� ���� Ű����� �޸𸮿��� �����ϴ� ������ ������ �����Ѵ�
		 * 
		 * �̰� �ڿ��� ����(leak)�� �����ϴ� ������ �ִ�
		 */
		scan.close();
	}
}
