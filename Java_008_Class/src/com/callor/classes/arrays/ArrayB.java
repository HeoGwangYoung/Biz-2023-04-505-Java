package com.callor.classes.arrays;

public class ArrayB {

	public static void main(String[] args) {
		// 10���� ��Ҹ� ���� ������ �迭 nums ����
		int[] nums = new int[10];
		
		// nums �迭�� 0��° �����͸� Console�� ���
		System.out.println(nums[0]);

		// nums �迭�� 0��° ��ġ�� ����100�� ����
		nums[0] = 100;

		/*
		 * �迭�� ���� �����ϱ�
		 * �迭[index] = ��
		 * 
		 * �迭���� ���� ������
		 * result = �迭[index]
		 * 
		 * index : ÷�� ��� �Ѵ� (�ε��� => ũ�� -1 ���� �̴�)
		 * 
		 * index�� �׻� 0���� �����Ѵ�
		 * index�� �� ���� (�迭�� ����) - 1 �̴�
		 */
		
//		nums[10] = 100;
//		System.out.println(nums[10]); //java.lang.ArrayIndexOutOfBoundsException ���� �߻��� �ڵ��ߴܵ�
	}
}
