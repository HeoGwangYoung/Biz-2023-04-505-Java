package com.callor.system.exec;

import java.util.Scanner;

public class ScannerD {

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
			 * strNum1�� ����� ���ڿ��� QUIT�� �ƴϰ�, ���ڿ��� �������� �ƴѰ��
			 * 1. �׳� Enter�� ������� ""
			 * 2. ������ �ƴ� �Ǽ� ���� �Է��� ��� 30.0 ��
			 * 3. space(��ĭ)�� �Է��� ��� "30 ", " 30" ...
			 * 4. �� ��...
			 */
			
			try {
				num1 = Integer.valueOf(strNum1);				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("����1�� �������� �Է��ؾ� �մϴ�");
				continue;
			}
			
			
			System.out.println("����2 (QUIT:����) >> ");
			String strNum2 = scan.nextLine();
			if (strNum2.equals("QUIT")) {
				break;
			}
			try {
				num2 = Integer.valueOf(strNum2);
				
			} catch (Exception e) {
				/*
				 * try - catch ������ exception�� �߻��� ���
				 * Integer.valueOf(strNum1) ����� ����Ǵ� ����
				 * ���������� �ڵ尡 �۵����� �ʾ����� catch{} ���� �ڵ尡 ����ȴ�
				 * try - catch ������ ���� �ڵ�� exception�� �߻��Ͽ��� �ڵ尡 �ߴܵǴ� ���� �ϴ� �����Ѵ�
				 */
				// TODO: handle exception
			}
			
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			System.out.printf("%d / %d = %.2f\n", num1, num2, (float)num1 / num2);
		}
		System.out.println("GAME OVER");
		scan.close();
	}
}
