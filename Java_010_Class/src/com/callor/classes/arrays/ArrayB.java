package com.callor.classes.arrays;

public class ArrayB {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();

		for (int i = 0; i < 100; i++) {
			/*
			 * nums �迭�� index���� (0 ~ 4)���� ������ �����ϱ�
			 */
			int index1 = (int) (Math.random() * nums.length);
			int index2 = (int) (Math.random() * nums.length);

			int _tmp = nums[index1];
			nums[index1] = nums[index2];
			nums[index2] = _tmp;
		}
		
		/*
		 * �迭 index �������� ���� ������ 2���� �����ϰ� ������ ��ġ�� ���� ���� �ٲٴ� ������ 100�� ����
		 * �迭�� ��� ���� ��Ģ���� ���׹��� �Ǵ� shuffle �ڵ尡 �ȴ�
		 */
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();
	}
}
