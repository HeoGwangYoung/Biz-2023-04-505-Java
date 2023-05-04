package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("정수를 입력해 주세요 >> ");
			String stringNum = scan.nextLine();

			try {
				num = Integer.valueOf(stringNum);
				break;
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
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
			System.out.println(num + " 은 소수입니다");
		} else {
			System.out.println(num + " 은 소수가 아닙니다");
		}
	}
}
