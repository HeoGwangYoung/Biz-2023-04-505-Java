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
		// 1. ++���� 2.�� num 100�� ��Һ� 101 > 100 3. or����
		if(++num1 > 100 || ++num2 > 100) {
			System.out.println("OK");
		}
		if(--num1 > 100 && --num2 > 100) {
			System.out.println("Hello");
		}
	}
}
