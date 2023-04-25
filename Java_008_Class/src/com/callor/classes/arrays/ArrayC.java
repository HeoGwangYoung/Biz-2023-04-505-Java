package com.callor.classes.arrays;

public class ArrayC {

	public static void main(String[] args) {
		int[] nums = new int[10];

		nums[0] = 33;
		nums[1] = 35;
		nums[2] = 56;
		nums[3] = 77;
		nums[4] = 45;
		nums[5] = 27;
		nums[6] = 84;
		nums[7] = 62;
		nums[8] = 16;
		nums[9] = 79;

		System.out.println(nums[0]); // num0 = 33
		System.out.println(nums[1]); // num1 = 35
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);

		for (int i = 0; i < 10; i++) {
			System.out.println(nums[i]);
		}
	}
}
