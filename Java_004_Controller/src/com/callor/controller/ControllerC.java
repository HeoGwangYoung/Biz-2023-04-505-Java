package com.callor.controller;

public class ControllerC {

	public static void main(String[] args) {
		/*
		 * 100 ���� �������� �����ϱ� ������ �������� 3�� ����ΰ� �Ǻ� �ƴϸ� 2�� ����ΰ� �ǰ�
		 */
		int rndNum;

		for (int i = 0; i < 100; i++) {
			rndNum = (int) (Math.random() * 50) + 51;
			if (rndNum % 3 == 0) {
				System.out.printf("%3d \t *3\n", rndNum);
			} else if (rndNum % 2 == 0) {
				System.out.printf("%3d \t\t *2\n", rndNum);
			}
		}
	}
}
