package com.callor.controller;

public class ControllerD {
	/*
	 * 1~100 ������ ���ڸ� ���ι������� �Ϸķ� �����ϱ� 
	 * 1	2	3	4	5 
	 * 6	7	8	9	10
	 */
	public static void main(String[] args) {
		int last = 100;
		for (int i = 0; i < last; i++) {
			//i + 1 (1~100 ����) ���ڸ� �Ϸķ� �����ϱ�
			System.out.print((i + 1) + "\t");
			
			// ������ �ϴٰ� ����� ���ڰ� 5�� ����̸� �ٹٲ� �ϱ�
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
