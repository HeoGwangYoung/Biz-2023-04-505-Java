package com.callor.classes.exec;

public class ExecB {

	public static void main(String[] args) {
		// ������ �迭 nums�� �����ϰ�, ���� ���� 10���� �����϶�
		int[] nums = new int[10];

		// nums�迭�� 0����Һ��� 9����ұ��� ������� 1 ~ 10���� ���� �����ϱ�
		for (int index = 0; index < 10; index++) {
			// nums[index] ��ġ�� index + 1�� ���� ����
			nums[index] = index + 1;
		}

		// nums �迭�� 0�� ��Һ��� 9�� ��ұ��� 51 ~ 100 ���� �������� �����϶�
		for (int index = 0; index < 10; index++) {
			// nums[index] ��ġ�� 51 ~ 100 ���� ������ ����
			nums[index] = (int) (Math.random() * 50) + 51;

		}
	}
}
