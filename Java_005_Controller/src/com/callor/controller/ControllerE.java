package com.callor.controller;

public class ControllerE {

	/*
	 * method의 선언
	 * method는 마치 java의 명령문을 새로 만드는 것과 같다
	 * method 선언 규칙에 따라 이름() {} 등을 만들고 {} 내에 원하는 코드를 작성한다
	 */
	public static void prime() {
		
		boolean isPrime = true;
		int rndNum = (int) (Math.random() * 50) + 51;

		for (int j = 2; j < rndNum; j++) {
			if (rndNum % j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(rndNum + "\t 소수");
		}
	}
	
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// prime() method 의 {} 내의 코드를 실행해달라
			// prime() method 를 호출한다
			prime();
		}
	}

}
