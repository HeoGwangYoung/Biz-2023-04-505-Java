package com.callor.controller;

public class ControllerD {

	/*
	 * 51 ~ 100 ���� ������ ������ 100�� ����, ������ ������ �߿� ¦���� ��ΰ� �Ǻ�
	 */

	public static void main(String[] args) {
		int nCount = 0;
		int nSum = 0;
		float avrg = 0;

		for (int i = 0; i < 100; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;

			if (rndNum % 2 == 0) {
				nCount++;
				// ���� : ���ڰ��� ��� �׾Ƽ� ����
				nSum += rndNum;
			}
		}
		
		avrg = (float)nSum / (float)nCount;
		
		System.out.printf("¦���� ���� : %d\n", nCount);
		System.out.printf("¦���� �հ� : %d\n", nSum);
		System.out.printf("¦���� ��� : %.1f\n", avrg);
	}
}
