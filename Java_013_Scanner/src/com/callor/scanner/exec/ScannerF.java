package com.callor.scanner.exec;

import java.util.Scanner;

import com.callor.scanner.config.PublicConfig;

public class ScannerF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		int lottoGameNums = 45;

		// 1 ~ 45 ������ ����

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
			System.out.println("���ο� ���� �� ����" + rndNum);

			
			while (true) {
				int num = 0;

				System.out.println( PublicConfig.dLine(100) );
				System.out.println((count + 1) + " ��° �� ���߱�");
				System.out.println("1 ~ 45 ���� ������ �Է��� �ּ���");
				System.out.print("���� >> ");
				String str = scan.nextLine();
				
				try {
					num = Integer.valueOf(str);
				} catch (Exception e) {
					System.out.println("�߸��� �Է��Դϴ�");
					continue;
				}
				if (num < 0 || num > lottoGameNums) {
					System.out.println("�Է¹����� ������ϴ�");
				} else if (num > rndNum) {
					System.out.println("������ ���� Ů�ϴ�");
				} else if (rndNum > num) {
					System.out.println("������ ���� �۽��ϴ�");
				} else if (rndNum == num) {
					System.out.println("���߾��");
					System.out.println( PublicConfig.sLine(100) );
					nums[count] = num;
					count++;
					break;
				}
			}

			if (count > nums.length - 1) {
				System.out.print("����� �� :\t");
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
