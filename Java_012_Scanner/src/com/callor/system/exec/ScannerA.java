package com.callor.system.exec;

import java.util.Scanner;

public class ScannerA {
	public static void main(String[] args) {

		// 키보드에서 데이터를 입력받기 위한 클래스
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;

		// while(조건) 명령문
		// 조건의 결과가 true인 동안 무한히 반복하는 명령문
		while (true) {

			// prompt(안내문) 먼저 보여주기
			System.out.println("두 개의 정수를 입력하세요");
			System.out.print("정수1 >> ");
			num1 = scan.nextInt();

			System.out.print("정수2 >> ");
			num2 = scan.nextInt();

			System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
			
			System.out.println("종료하려면 QUIT를 입력하세요");
			System.out.print("$ ");
			String str = scan.nextLine();
		}
	}
}
