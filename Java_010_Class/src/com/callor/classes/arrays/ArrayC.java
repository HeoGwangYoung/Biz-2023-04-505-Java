package com.callor.classes.arrays;

public class ArrayC {

	public static void main(String[] args) {
		int[] nums = new int[45];

		// create
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		// shuffle
		for (int i = 0; i < 1000; i++) {
			int index1 = (int) (Math.random() * nums.length);
			int index2 = (int) (Math.random() * nums.length);

			int _tmp = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _tmp;
		}
		// print
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();

		int[] lotto = new int[6];

		// copy nums to lotto
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = nums[i];
		}

		// sort lotto
		for (int out = 0; out < lotto.length - 1; out++) {
			for (int in = out + 1; in < lotto.length; in++) {
				if (lotto[out] > lotto[in]) {
					int _tmp = lotto[out];
					lotto[out] = lotto[in];
					lotto[in] = _tmp;
				}
			}
		}
		
		// print lotto
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%d\t", lotto[i]);
		}
	}
}