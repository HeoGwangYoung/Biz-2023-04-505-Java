package com.callor.controller;

public class ControllerB {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51;
		// yesNo flag ����
		boolean isPrimeNum = true;
		// i�� 2 ~ �ڽ� - 1 ���� ���ӵ� ������ ������ �ڵ�
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				isPrimeNum = false;
				break;
			}
		}
		if (isPrimeNum) {
			System.out.println(rndNum + "\t�Ҽ�");
		} else {
			System.out.println(rndNum + "\t�Ҽ� �ƴ�");
		}
	}
}
