package com.callor.classes.exec;

public class ExecG {

	// �Ű����� num ������ ���޹��� ���� prime �̸� num�� �ƴϸ� 0�� return �ϴ� method ����
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
			// ���� nums[i] ���� prime �̶�� ������ ����Ǵ� ���� nums[i]
			// ���� prime�� �ƴ϶�� ������ ����Ǵ� ���� 0
			int zero_Or_PrimeNum = prime(nums[i]);
			if (zero_Or_PrimeNum > 0) {
				System.out.println("�Ҽ� : " + zero_Or_PrimeNum);
			} else {
				System.out.println("�Ҽ� �ƴ� : " + nums[i]);
			}
		}
	}
}