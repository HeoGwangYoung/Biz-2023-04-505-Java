package com.callor.controller;

public class ControllerC {

	public static void main(String[] args) {
		/*
		 * 100 개의 랜덤수를 생성하기 생성된 랜덤수가 3의 배수인가 판별 아니면 2의 배수인가 판결
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
