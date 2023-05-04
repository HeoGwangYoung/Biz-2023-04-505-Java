package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rndNum = (int) (Math.random() * 10) + 1;

		while (true) {
			System.out.print("1 ~ 10 ���� �Է�(���� : QUIT) >> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				break;
			}

			int num = 0;

			try {
				num = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("������ �Է����ּ���");
				continue;
			}
			if (num > 10 || num < 1) {
				System.out.println("�Է¹����� ������ϴ�");
				continue;
			}

			if (num == rndNum) {
				System.out.println("���߾��");
				System.out.println("���ο� ���� ����");
				rndNum = (int) (Math.random() * 10) + 1;
			} else {
				System.out.println("Ʋ���̽��ϴ�");
			}
		}
		System.out.println("GAME OVER");
	}

}
