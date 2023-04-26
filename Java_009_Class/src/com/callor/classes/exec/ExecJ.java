package com.callor.classes.exec;

public class ExecJ {

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
		boolean checkFirst = true;
		int lastIndex = -1;
		int firstIndex = -1;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		for (int i = 0; i < nums.length; i++) {
						
			if(prime(nums[i]) > 0 && checkFirst) {
				firstIndex = i;
				checkFirst = false;
			}
			
			if(prime(nums[i]) > 0) {
				lastIndex = i;
			}
		}
		// ���2) for 2����� 1��° firstIndexã�� 2��° for������ firstIndex ���� �ݺ��� ����
		if (firstIndex > -1) {
			System.out.println("ù��° �ε��� : " + firstIndex + " �� : " + nums[firstIndex]);
			System.out.println("������ �ε��� : " + lastIndex + " �� : " + nums[lastIndex]);
		}
	}
}