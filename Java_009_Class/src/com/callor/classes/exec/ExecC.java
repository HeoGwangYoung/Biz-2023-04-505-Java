package com.callor.classes.exec;

public class ExecC {

	public static void main(String[] args) {

		// �迭�� ����(����� �ʱ�ȭ�� �� ����)
		int[] nums = new int[10];
		// ������ �迭 ��ҿ� �� ä���ֱ�
		// ������ ����
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		// ������ �迭 ��ҿ� ä���� ������ ��ü�� �ջ�
		// ������ ó��
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += nums[i];
		}
		System.out.println("�� : " + sum);
	}
}
