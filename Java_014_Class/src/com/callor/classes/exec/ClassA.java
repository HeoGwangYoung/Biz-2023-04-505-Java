package com.callor.classes.exec;

import java.util.Iterator;

public class ClassA {

	public static void main(String[] args) {

		// ������ �迭 10�� ����
		int[] nums = new int[10];

		// �� �������(nums 0����� ~ nums 9�� ���) �� �� ����
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println("ó������ ¦���� ����� index : " + i + "\t�� : " + nums[i]);
				break;
			}
		}
	}

}
