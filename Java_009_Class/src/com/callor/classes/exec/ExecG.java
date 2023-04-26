package com.callor.classes.exec;

public class ExecG {

	// 매개변수 num 변수로 전달받은 값이 prime 이면 num을 아니면 0을 return 하는 method 선언
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < nums.length; i++) {
			// 만약 nums[i] 값이 prime 이라면 변수에 저장되는 값은 nums[i]
			// 값이 prime이 아니라면 변수에 저장되는 값은 0
			int zero_Or_PrimeNum = prime(nums[i]);
			if (zero_Or_PrimeNum > 0) {
				System.out.println("소수 : " + zero_Or_PrimeNum);
			} else {
				System.out.println("소수 아님 : " + nums[i]);
			}
		}
	}
}