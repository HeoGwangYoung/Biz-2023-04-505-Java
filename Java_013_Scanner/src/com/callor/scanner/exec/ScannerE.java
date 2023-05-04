package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerE {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rndNum = (int) (Math.random() * 10) + 1;

		while (true) {
			int num = 0;

			System.out.println("1 ~ 10 까지 정수를 입력해 주세요(종료 : QUIT)");
			System.out.print("정수 >> ");

			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				break;
			}

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}

			if (rndNum == num) {
				System.out.println("잘했어요");
				rndNum = (int) (Math.random() * 10) + 1;
			} else if (num > rndNum) {
				System.out.println("큰 수");
			} else if (rndNum > num) {
				System.out.println("작은 수");
			}

		}
		System.out.println("GAME OVER");
	}
}
