package com.callor.classes.exec;

public class ClassC {

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		// nums �迭 ��ҿ� ����� ��� ���� �����ǰ�
		// ���ο� �迭 20���� �����ϱ�
		// �迭�� ���� ������ �ϸ� ������ ��� ������ �����ȴ�
		// �迭�� �ѹ� ������� ���¿��� ���Ӱ� ũ�⸦ �����ϰų� �� �� ����
//		nums = new int[20];

		
		// �迭 ��� ���θ� �ݺ��ϴ� Ȯ��� for �ݺ��� (for each)
		// 0 �� index ���� �迭 �� index ���� ������ �ݺ�
		// nums �迭��Ҹ� ��� ���� ����, 0 index ��� ���� �� index ��ұ��� 
		// ������� num ������ �����Ͽ� {} �ڵ忡�� ����� �� �ֵ��� �Ѵ�
		for (int num : nums) {
			System.out.print(num + "\t");
		}
	}
}
