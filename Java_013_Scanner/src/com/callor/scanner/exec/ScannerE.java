package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rndNum = (int) (Math.random() * 10) + 1;

		while (true) {
			int num = 0;

			System.out.println("1 ~ 10 ���� ������ �Է��� �ּ���(���� : QUIT)");
			System.out.print("���� >> ");

			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				break;
			}

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�");
				continue;
			}

			if (rndNum == num) {
				System.out.println("���߾��");
				rndNum = (int) (Math.random() * 10) + 1;
			} else if (num > rndNum) {
				System.out.println("ū ��");
			} else if (rndNum > num) {
				System.out.println("���� ��");
			}

		}
		System.out.println("GAME OVER");
	}
}
