package com.callor.classes.exec;

public class ExecK {

	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		// i ���� ��ȭ�Ǵ� ����
		// ���۰��� 0, ���ᰪ�� i<nums.length
		// i : 0 ~ nums.length - 1, 0 ~ 49 ���� ���ϴ� ��
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + "\t");
			// i+1 => i�� 1���� �����ϵ��� ����� ���� ( )����
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}