package com.callor.controller;

public class ControllerB {

	public static void main(String[] args) {
		int rndNum;
		for (int i = 0; i < 100; i++) {
			rndNum = (int) (Math.random() * 50) + 51;
//			if(rndNum % 2 == 0) {
//				System.out.printf("%3d ��° ������ �� : %3d\n", i+1, rndNum);
//			}

//			if (rndNum % 2 == 0) {
//				System.out.printf("%3d ��° ������ �� : %3d ¦��\n", i + 1, rndNum);
//			} else {
//				System.err.printf("%3d ��° ������ �� : %3d ¦�� �ƴ�\n", i + 1, rndNum);
//			}

			if (rndNum % 2 == 0) {
				System.out.printf("%3d ��° ������ �� : %3d ¦��\n", i + 1, rndNum);
			} else if (rndNum % 2 == 1) {
				System.err.printf("%3d ��° ������ �� : %3d Ȧ��\n", i + 1, rndNum);
			}
		}
	}
}
