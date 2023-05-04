package com.callor.scanner.exec;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {

		while (true) {
			int num = getNum();

			if (num < 0) {
				System.out.println("GAME OVER");
				// main() method 에서 return 명령이 실행되면
				// 프로젝트 코드 전체를 중단하라는 것이다
				return;
			}

			// prime() method는 전달받은 num "변수의 값"이
			// prime 이면 num를 return, 아니면 -1 을 return 한다
			// return 한 결과를 result 변수에 저장한다
			int result = primeYesNo(num);

			// num 변수에 저장된 값을 보고 prime 인지 아닌지 판단한다
			if (result > 0) {
				System.out.println(num + " 은 소수입니다");
			} else {
				System.out.println(num + " 은 소수가 아닙니다");
			}
		}
	}

	public static int getNum() {

		Scanner scan = new Scanner(System.in);
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
