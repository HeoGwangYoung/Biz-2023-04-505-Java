package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {

		while (true) {
			int num = getNum();

			if (num < 0) {
				System.out.println("GAME OVER");
				// main() method ���� return ����� ����Ǹ�
				// ������Ʈ �ڵ� ��ü�� �ߴ��϶�� ���̴�
				return;
			}

			// prime() method�� ���޹��� num "������ ��"��
			// prime �̸� num�� return, �ƴϸ� -1 �� return �Ѵ�
			// return �� ����� result ������ �����Ѵ�
			int result = primeYesNo(num);

			// num ������ ����� ���� ���� prime ���� �ƴ��� �Ǵ��Ѵ�
			if (result > 0) {
				System.out.println(num + " �� �Ҽ��Դϴ�");
			} else {
				System.out.println(num + " �� �Ҽ��� �ƴմϴ�");
			}
		}
	}

	public static int getNum() {

		Scanner scan = new Scanner(System.in);
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

	public static int primeYesNo(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return -1;
			}
		}
		return num;
	}
}
