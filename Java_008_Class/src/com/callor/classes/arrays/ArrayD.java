package com.callor.classes.arrays;

/*
 * ������ �迭 10���� nums�̸����� �����ϰ� �� ��ҿ� 50 ~ 100���� �������� �����ϰ�
 * �迭 ��ҿ� ����� ������ �����Ͽ� ���
 */
public class ArrayD {

	public static void main(String[] args) {
		int[] nums = new int[10];
		nums[0] = (int) (Math.random() * 50) + 51;

		// for() �ݺ����� ����Ͽ� nums �迭�� �� ��Ұ��� �������� ����
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(nums[i] + "\t");
		}
		System.out.println();
		// �� ��ҿ� ����� ������ ��� ���Ͽ� ��� ǥ��
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		System.out.println("�� ����� �� : " + sum);
	}
}
