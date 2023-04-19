package com.callor.controller;

public class ControllerE {

	public static void main(String[] args) {

		int intRnd = (int) (Math.random() * 50) + 51;
		boolean isPrimeNumber = true;
				
		for (int i = 2; i < intRnd / 2 + 1; i++) {
			if(intRnd % i == 0) {
				isPrimeNumber = false;
			}
		}

		if (isPrimeNumber) {
			System.out.println(intRnd + "는(은) 소수 입니다");
		} else {
			System.out.println(intRnd + "는(은) 소수가 아닙니다");
		}
	}

}
