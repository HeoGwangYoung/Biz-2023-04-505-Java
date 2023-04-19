package com.callor.controller;

public class ControllerA {

	public static void main(String[] args) {
		int intRnd;
		for (int i = 0; i < 100; i++) {
			intRnd = (int) (Math.random() * 50) + 51;
			System.out.printf("%3d 번째 생성된 수 : %3d", (i + 1), intRnd);
			if (intRnd < 51 || intRnd > 100) {
				System.err.print(" Over");
			} else {
				System.out.print(" Good");
			}
			System.out.println();
		}
		System.out.println("test end");
	}
}
