package com.callor.controller;

public class ControllerF {

	/*
	 * prime() method 의 코드를 수정하여 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경
	 * 
	 * void type의 prime() method를 boolean type의 prime() method로 변경
	 * 
	 * method를 선언할때 void type 이외의 type으로 선언하면 method {} 내에서 반드시 return 명령문이 있어야 한다
	 * 
	 */
	public static boolean prime() {

		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;

		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
//				break;
				return false;
			}
		}

		boolean yesPrime = rndNum <= index;

//		if (isPrime) {
//			System.err.println(rndNum + "\t소수");
//		} else {
//			System.out.println(rndNum + "\t\t소수 아님");
//		}
		return yesPrime;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// prime() method 의 {} 내의 코드를 실행해달라
			// prime() method 를 호출한다
			if (prime()) {
				System.out.println("소수");
			} else {
				System.err.println("소수 아님");
			}
		}
	}

}
