package com.callor.classes.module;

public class ServiceE {
	public void score(int score1, int score2, int score3) {

		int sum = score1 + score2 + score3;
		float avrg = (float) sum / 3;

		System.out.println("============================================");
		System.out.printf("����\t����\t����\t����\t���\n");
		System.out.print("--------------------------------------------\n");
		System.out.printf("%4d\t%4d\t%4d\t%4d\t%.1f\n", score1, score2, score3, sum, avrg);
		System.out.println("============================================");
	}
}
