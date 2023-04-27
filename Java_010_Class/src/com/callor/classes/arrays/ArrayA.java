package com.callor.classes.arrays;

public class ArrayA {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d\t", nums[i]);
		}
		System.out.println();

		// �迭�� ����� �������� ������ ������ �����ϱ�
		
		// ���� ��ü�迭�� ��ȸ�ϴ� for()�� ����� ���� index ��ġ�� ���� index + 1 ~ ������ �� ���Ѵ�
		// ���� ������� ū ���� ����������, �������� �������� �迭 ����� ���� ���� ��ȯ �Ѵ�
		// �� ����� ��ü �迭 ������ŭ �ݺ��ϸ� �迭�� ����� ���� �������� ���ĵȴ�
		
		// nums[0] �� nums[1] ~ nums[4] ���� ������� ��
		// nums[1] �� nums[2], nums[3], nums[4] �� ������� ��
		// nums[2] �� nums[3], nums[4] �� ������� ��
		// nums[3] �� nums[4]�� ��
		
		// �Ͽ� ū ���� ���� ������ �������� �������� ����ؼ� ��ȯ�ϱ�
		for (int out = 0; out < nums.length-1; out++) {
			for (int in = out + 1; in < nums.length; in++) {
				if (nums[out] > nums[in]) {
					int _tmp = nums[out];
					nums[out] = nums[in];
					nums[in] = _tmp;
				}		
				
			}
			for (int i = 0; i < nums.length; i++) {
				System.out.printf("%3d\t", nums[i]);
			}
			System.out.println();
		}
	}
}
