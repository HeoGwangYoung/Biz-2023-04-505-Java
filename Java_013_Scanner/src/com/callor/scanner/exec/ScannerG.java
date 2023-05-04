package com.callor.scanner.exec;

import java.util.Scanner;

import com.callor.scanner.config.PublicConfig;

public class ScannerG {
	public static void main(String[] args) {
		int[] nums = new int[6];
		int[] correct = new int[6];
		Scanner scan = new Scanner(System.in);

		// 중복제외 저장
		int rndNum = (int) (Math.random() * 45) + 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == rndNum) {
					rndNum = (int) (Math.random() * 45) + 1;
					j = -1;
				}
			}
			nums[i] = rndNum;
			correct[i] = nums[i];
		}

		// 정답지 출력
		System.out.println("정답지");
		System.out.println(PublicConfig.dLine);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println(PublicConfig.dLine);
		
		
		
		int num = 0;
		int count = 0;
		// 입력 후 비교
		while (true) {
			System.out.print("(1 ~ 45) 정수를 입력하세요 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			if (num > 45 || num < 1) {
				continue;
			}

			boolean isCorrect = false;
			
			for (int i = 0; i < nums.length; i++) {
				if (num == correct[i]) {
					isCorrect = true;
					correct[i] = 0;
					count++;
					System.out.println("맞추셨습니다 " + nums.length + " 중에 " + count);
					System.out.println("입력하신숫자 : " + nums[i] + " 가 정답에서 제외됩니다");
					break;
				}
			}
			if(!isCorrect) {
				System.out.println("틀렸습니다");
			}
			
			
			if (count > nums.length - 1) {
				break;
			}
		}
		
		scan.close();
		// 오름차순 정렬
		for (int in = 0; in < nums.length - 1; in++) {
			for (int out = in + 1; out < correct.length; out++) {
				if(nums[in] > nums[out]) {
					int temp = nums[in];
					nums[in] = nums[out];
					nums[out] = temp;
				}
			}
		}
		// 출력
		System.out.println(PublicConfig.dLine);
		System.out.println("Game Over");
		System.out.print("배열요소는\t");
		
		for (int i = 0; i < correct.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		System.out.println(PublicConfig.dLine);
	}
}
