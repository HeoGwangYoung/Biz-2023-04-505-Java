package com.callor.classes.arrays;

public class ArrayE {

	public static void main(String[] args) {
		int[] nums = new int[10];
		// 저장
		for (int i = 0; i < 10; i++) {
			nums[i] = i + 1;
		}
		// 출력
		for (int i = 0; i < 10; i++) {
			// 짝수판별 후 출력
			if (nums[i] % 2 == 0) {
				System.out.println(nums[i]);
			}
		}
		System.out.println();

		int index;

		for (int i = 0; i < 10; i++) {
			for (index = 2; index < nums[i]; index++) {
				if (nums[i] % index == 0) {
					break;
				}
			}
			if (nums[i] <= index) {
				System.out.println(nums[i] + " 는 소수");
			}
		}
	}
}
