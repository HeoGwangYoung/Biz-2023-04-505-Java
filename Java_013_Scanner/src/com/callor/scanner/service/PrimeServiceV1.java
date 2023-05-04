package com.callor.scanner.service;

import java.util.Scanner;

public class PrimeServiceV1 {

	private Scanner scan = new Scanner(System.in);

	public int getNum() {

		int num = 0;

		while (true) {
			System.out.println("3�̻� ���� ������ �Է��� �ּ��� (QUIT : ����)");
			System.out.print("���� >> ");

			String stringNum = scan.nextLine();

			if (stringNum.equals("QUIT")) {
				return -1;
			}
			try {
				num = Integer.valueOf(stringNum);
//				if (num < 3) {
//					continue;
//				}
				// contunue Ű���带 ����ϰ� ���� ������
				if (num >= 3) {
					break;
				}
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}
		return num;
	}

	// �Ű������� ���Ͽ� ���޹��� num ���� prime�� �ƴϸ� -1, prime�̸� num�������� return
	public int primeYesNo(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return -1;
			}
		}
		return num;
	}
}
