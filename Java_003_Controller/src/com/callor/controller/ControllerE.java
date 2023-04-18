package com.callor.controller;

public class ControllerE {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int intRnd = (int) (Math.random() * 50) + 51;
			
			if (!(intRnd >= 51 && intRnd <= 100)) {
				System.out.println(intRnd);
			}
		}
		System.out.println("test end");
		
		int num1 = 100;
		int num2 = 100;
		// 1. ++연산 2.각 num 100과 대소비교 101 > 100 3. or연산
		if(++num1 > 100 || ++num2 > 100) {
			System.out.println("OK");
		}
		if(--num1 > 100 && --num2 > 100) {
			System.out.println("Hello");
		}
	}
}
