package com.callor.classes;

import java.util.Scanner;

public class ClassG {

	/*
	 * �� ���� ������ �Է¹޾� �� ������ 4Ģ���� ����� ����ϱ�
	 * �� ������ ���� �ݺ��ϴٰ�
	 * 
	 * �Է��� ���� -1 �̸� �ݺ����� ��� �ߴ�
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * while(�ݺ�����) { } �ݺ������� true�� ���� ���� �ݺ� loop
		 * 
		 * while(true) { } ���� ����(�� ������ ������ true �̹Ƿ�) ���� �ݺ�
		 * �ڵ带 ������ ������ ������ ������ �ݺ��ȴ�
		 */
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.println("�� ���� ������ �Է��ϼ���");
			System.out.println("-1 �� �Է��ϸ� �ߴ��մϴ�");
			
			System.out.print("����1 >> ");
			num1 = scan.nextInt();
			// while(true) ���ѹݺ� ���� ���� ����
			if(num1 < 0) {
				break;
			}

			System.out.print("����2 >> ");
			num2 = scan.nextInt();
			if(num2 < 0) {
				break;
			}
			
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		}
		System.out.println("GAME OVER");
	}
}
