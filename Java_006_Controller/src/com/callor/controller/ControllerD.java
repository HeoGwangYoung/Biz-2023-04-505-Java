package com.callor.controller;

public class ControllerD {

	public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0;
			}
		}
		return rndNum;
	}

	public static void main(String[] args) {
		int primeSum = 0;
		int primeCount = 0;

		for (int i = 0; i < 100; i++) {
			int rndNum = prime();
			if (rndNum > 0) {
				primeSum += rndNum;
				primeCount++;
				System.out.println(primeCount + ")\t" + rndNum + "\t" + primeSum);
			}
		} // end for
		System.out.println("소수의 개수 : " + primeCount);
		System.out.println("소수의 합 : " + primeSum);
	}
}
