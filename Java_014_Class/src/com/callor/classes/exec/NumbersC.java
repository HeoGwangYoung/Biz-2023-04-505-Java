package com.callor.classes.exec;

public class NumbersC {

	public static void main(String[] args) {
		// ������ ���� �迭 10�� ����
		// ������(class) ���� �迭�� �迭�� ������ ����� ������
		// �� ��Ҵ� �ʱ�ȭ ���� �ʴ´�
		Integer[] nums = new Integer[10];
		// ������ ���� (����) �� �� ��ҵ��� ��� �ʱ�ȭ �� �־�� �Ѵ�
		nums[0] = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
		
		// ������ ���� �迭�� ��Ҵ� �Ϲ� �⺻�� ���� �ʱ�ȭ�� ���� �����Ѵ�
		for (int i = 0; i < nums.length; i++) {
			nums[i] = new Integer(0);
		}
		
		// �⺻�� ���� �迭 10�� ����
		// �⺻�� ���� �迭�� ������ ���� �ʱ�ȭ ���� �ʾƵ�
		// �ڵ����� 0���� �ʱ�ȭ �����ȴ�
		int[] intNums = new int[10];
		
		System.out.println(nums[0]);
		System.out.println(intNums[0]);
		
		boolean bYes = nums[0].equals(nums[1]);
		System.out.println(bYes);
		
		bYes = nums[0] == nums[1];
		System.out.println(bYes);
		
		String str1 = "Korea";
		String str2 = new String("Korea");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
