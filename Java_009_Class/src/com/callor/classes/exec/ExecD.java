package com.callor.classes.exec;

public class ExecD {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		// ������ �غ�, ������ ����
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		// ������ ó�� 5�� ��� ã��
		for (int i = 0; i < 10; i++) {
			if (nums[i] % 5 == 0) {
				System.out.println("5�� ��� : " + nums[i]);
			}
		}
		
	}

}
