package com.callor.scanner.service;

import java.util.Scanner;

public class PrimeServiceV1 {

	private Scanner scan = new Scanner(System.in);

	public int getNum() {

		int num = 0;

		while (true) {
			System.out.println("3이상 양의 정수를 입력해 주세요 (QUIT : 종료)");
			System.out.print("정수 >> ");

			String stringNum = scan.nextLine();

			if (stringNum.equals("QUIT")) {
				return -1;
			}
			try {
				num = Integer.valueOf(stringNum);
//				if (num < 3) {
//					continue;
//				}
				// contunue 키워드를 사용하고 싶지 않으면
				if (num >= 3) {
					break;
				}
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
			}
		}
		return num;
	}

	// 매개변수를 통하여 전달받은 num 값이 prime이 아니면 -1, prime이면 num변수값을 return
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
