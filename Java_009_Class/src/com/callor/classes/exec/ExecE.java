package com.callor.classes.exec;

public class ExecE {

	public static void main(String[] args) {
		/*
		 * �迭�� ����� ���� ������ �׶� �׶� ��Ȳ�� ���� �ٸ���
		 * �迭�� ��Ҹ� ������� for() �ݺ������� ó���� �Ҷ� �迭 ����� ������ ������ ���ڷ� �ڵ��ϴ� ����
		 * �迭 ����� ������ ���� �ɶ� ���� �����ؾ��ϴ� �ڵ� �κ��� ��������
		 * �׷��� Java������ �迭�� �����ϸ� �迭�� ��� ������ �˼� �ִ� ������ �ڵ����� �����Ѵ�
		 * �迭.length
		 */
		int[] nums = new int[22];
		// ������ �غ�, ������ ����
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		// ������ ó�� 5�� ��� ã��
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 5 == 0) {
				System.out.println("5�� ��� : " + nums[i]);
			}
		}

	}

}
