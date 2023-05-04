package com.callor.scanner.exec;

import java.util.Scanner;

import com.callor.scanner.config.PublicConfig;

public class ScannerG {
	public static void main(String[] args) {
		int[] nums = new int[6];
		int[] correct = new int[6];
		Scanner scan = new Scanner(System.in);

		// �ߺ����� ����
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

		// ������ ���
		System.out.println("������");
		System.out.println(PublicConfig.dLine);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println(PublicConfig.dLine);
		
		
		
		int num = 0;
		int count = 0;
		// �Է� �� ��
		while (true) {
			System.out.print("(1 ~ 45) ������ �Է��ϼ��� >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("�߸��� �Է��Դϴ�");
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
					System.out.println("���߼̽��ϴ� " + nums.length + " �߿� " + count);
					System.out.println("�Է��Ͻż��� : " + nums[i] + " �� ���信�� ���ܵ˴ϴ�");
					break;
				}
			}
			if(!isCorrect) {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}
			
			
			if (count > nums.length - 1) {
				break;
			}
		}
		
		scan.close();
		// �������� ����
		for (int in = 0; in < nums.length - 1; in++) {
			for (int out = in + 1; out < correct.length; out++) {
				if(nums[in] > nums[out]) {
					int temp = nums[in];
					nums[in] = nums[out];
					nums[out] = temp;
				}
			}
		}
		// ���
		System.out.println(PublicConfig.dLine);
		System.out.println("Game Over");
		System.out.print("�迭��Ҵ�\t");
		
		for (int i = 0; i < correct.length; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		System.out.println(PublicConfig.dLine);
	}
}
