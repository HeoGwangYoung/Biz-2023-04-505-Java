package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rndNum = (int) (Math.random() * 10) + 1;

		while (true) {
			System.out.print("1 ~ 10 정수 입력(종료 : QUIT) >> ");
			String strNum = scan.nextLine();

			if (strNum.equals("QUIT")) {
				break;
			}

			int num = 0;

			try {
				num = Integer.valueOf(strNum);
			} catch (Exception e) {
				System.out.println("정수를 입력해주세요");
				continue;
			}
			if (num > 10 || num < 1) {
				System.out.println("입력범위를 벗어났습니다");
				continue;
			}

			if (num == rndNum) {
				System.out.println("잘했어요");
				System.out.println("새로운 게임 시작");
				rndNum = (int) (Math.random() * 10) + 1;
			} else {
				System.out.println("틀리셨습니다");
			}
		}
		System.out.println("GAME OVER");
	}

}
