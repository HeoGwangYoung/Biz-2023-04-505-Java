package com.callor.classes.exec;

public class ExecI {

	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		int index = -1;
		
		/*
		 * index �ʱ�ȭ�� 0���� ������ ��� ���� �迭�� ��� ���߿��� 3�� ����� �ϳ��� ���� ���
		 * index�� �״�� 0�� �� ���̰� ��� ��¿��� 0�� index�� index 0 �� ����� ���� ��µȴ�
		 * �̷��� ������ ������ �ذ��ϱ� ���ؼ� index�� -1�� �ʱ�ȭ �ϰ� ��� ��ºκп��� index ���� �ѹ���
		 * Ȯ���� �ʿ䰡 �ִ�
		 */
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 3 == 0) {
				index = i;
			}
		}
		/*
		 * index ���۰� : nums.length = 50
		 * index ���ᰪ : index > 0 ������ �־ index 1�� ��쿡 for() ����
		 * 49,48,47,46...0 ���� index���� �����ؾ� �ϴµ�
		 * ������ �ڵ�� 50,49,48,47...1���� index �����ǰ� �ִ�
		 * �������ڸ��� nums[50] ����� ���� �������� �õ��Ѵ�
		 * Index OutofBounds �����߻�
		 */
		//		for (int i = nums.length; i > 0; i--) �߸��� ��
		
//		������ �ݺ��� ����
//		for (int i = nums.length - 1; i >= 0; i--) {
//			if(nums[i] % 3 == 0) {
//				System.out.println("������ 3�� ��� : " + nums[i]);
//				System.out.println("��ġ : " + i);
//			}
//		}
		
		// 3�� ����� �ϳ��� �ȳ��°�츦 ���
		if (index >= 0) {
			System.out.println("������ ��ġ�� �� : " + nums[index]);
			System.out.println("������ ��ġ�� �ε��� : " + index);	
		}
		
	}
}
