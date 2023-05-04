package com.callor.scanner.exec;

import java.util.Scanner;

import com.callor.scanner.config.PublicConfig;

public class ScannerF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		int lottoGameNums = 45;

		// 1 ~ 45 랜덤수 생성

		int count = 0;

		
		while (true) {
			int rndNum = (int) (Math.random() * lottoGameNums) + 1;
			boolean isdup = false;
			
			for (int i = 0; i < nums.length; i++) {
				if (rndNum == nums[i]) {
					isdup = true;
				}
			}
			if (isdup) {
				continue;
			}
			System.out.println("새로운 랜덤 수 생성" + rndNum);

			
			while (true) {
				int num = 0;

				System.out.println( PublicConfig.dLine(100) );
				System.out.println((count + 1) + " 번째 수 맞추기");
				System.out.println("1 ~ 45 까지 정수를 입력해 주세요");
				System.out.print("정수 >> ");
				String str = scan.nextLine();
				
				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("잘못된 입력입니다");
					continue;
				}
				if (num < 0 || num > lottoGameNums) {
					System.out.println("입력범위를 벗어났습니다");
				} else if (num > rndNum) {
					System.out.println("랜덤수 보다 큽니다");
				} else if (rndNum > num) {
					System.out.println("랜덤수 보다 작습니다");
				} else if (rndNum == num) {
					System.out.println("잘했어요");
					System.out.println( PublicConfig.sLine(100) );
					nums[count] = num;
					count++;
					break;
				}
			}

			if (count > nums.length - 1) {
				System.out.print("저장된 수 :\t");
				for (int i = 0; i < nums.length; i++) {
					System.out.print(nums[i] + "\t");
				}
				System.out.println();
				break;
			}
		}
		scan.close();
		System.out.println("GAME OVER");
	}
}
