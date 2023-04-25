package com.callor.classes.arrays;

public class ArrayF {

	public static void main(String[] args) {

		int nums[] = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			boolean isPrime = primeDSRCM(nums[i]);
			if (isPrime) {
				System.out.println(nums[i] + " �� �Ҽ�");
			} else {
				System.out.println(nums[i] + " �� \t\t�Ҽ� �ƴ�");
			}
		}
	}

	/*
	 * �ټ��� �����͸� ����ó���� ��� �����͸� �����ϰ�, ������ �Ϸ�Ǿ�����, �Ѳ����� ó���� �Ѵ�
	 * �����Ͱ� �߻��ϴ� ��� ó�� : �ǽð� ó�� ex) Ƽ�Ͽ���
	 * �����͸� ��� �����ϰ� ������ �Ϸ�Ǿ����� ó�� : ��ġ(Batch) ó�� ex) �޿����, �α����
	 */
	
	
	/*
	 * prime() method���� ������ 1���� �����ϰ� �� �������� �Ҽ����� �ƴ��� �˷��� ��� ��û
	 */
	public static boolean primeDSRCM(int Num) {
		int index;
		boolean isPrime = false;
		for (index = 2; index < Num; index++) {
			if (Num % index == 0) {
				break;
			}
		}
		if (Num <= index) {
			isPrime = true;
		}
		return isPrime;
	}
}
