package com.callor.controller;

public class ControllerD {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			boolean isPrime = true;
			int rndNum = (int) (Math.random() * 50) + 51;

			for (int j = 2; j < rndNum; j++) {
				if (rndNum % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(rndNum + "\t ¼Ò¼ö");
			}
		}
	}

}
