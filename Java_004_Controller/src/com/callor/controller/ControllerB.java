package com.callor.controller;

public class ControllerB {

	public static void main(String[] args) {
		int rndNum;
		for (int i = 0; i < 100; i++) {
			rndNum = (int) (Math.random() * 50) + 51;
//			if(rndNum % 2 == 0) {
//				System.out.printf("%3d 번째 생성된 수 : %3d\n", i+1, rndNum);
//			}

//			if (rndNum % 2 == 0) {
//				System.out.printf("%3d 번째 생성된 수 : %3d 짝수\n", i + 1, rndNum);
//			} else {
//				System.err.printf("%3d 번째 생성된 수 : %3d 짝수 아님\n", i + 1, rndNum);
//			}

			if (rndNum % 2 == 0) {
				System.out.printf("%3d 번째 생성된 수 : %3d 짝수\n", i + 1, rndNum);
			} else if (rndNum % 2 == 1) {
				System.err.printf("%3d 번째 생성된 수 : %3d 홀수\n", i + 1, rndNum);
			}
		}
	}
}
