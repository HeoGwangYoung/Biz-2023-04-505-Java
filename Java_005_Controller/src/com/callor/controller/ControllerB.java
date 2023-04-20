package com.callor.controller;

public class ControllerB {
	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51;
		// yesNo flag 변수
		boolean isPrimeNum = true;
		// i를 2 ~ 자신 - 1 까지 연속된 정수를 만들어내는 코드
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				isPrimeNum = false;
				break;
			}
		}
		if (isPrimeNum) {
			System.out.println(rndNum + "\t소수");
		} else {
			System.out.println(rndNum + "\t소수 아님");
		}
	}
}
