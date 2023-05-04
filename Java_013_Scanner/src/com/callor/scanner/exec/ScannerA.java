package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("������ �Է��� �ּ��� >> ");
			String stringNum = scan.nextLine();

			try {
				num = Integer.valueOf(stringNum);
				break;
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�");
			}
		}
		scan.close();

		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(num + " �� �Ҽ��Դϴ�");
		} else {
			System.out.println(num + " �� �Ҽ��� �ƴմϴ�");
		}
	}
}
