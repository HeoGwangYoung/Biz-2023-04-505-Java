package com.callor.classes.exec;

public class ExecH {

	public static void main(String[] args) {
		int[] nums = new int[50];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		
		// ���ǿ� �´� ������ ���ǿ� �´� ���� �հ踦 ���
		// ������ �հ踦 ������ ������ ���� ����
		
		int count = 0;
		int sum = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 3 == 0) {
				// sum = nums[i] // ���� ������ ���� ����
				sum += nums[i];
				count++;
			}
		}
		System.out.println("3�� ��� �� ���� ���� : " + count);
		System.out.println("3�� ��� �� ���� �հ� : " + sum);
	}
}