package com.callor.classes.module;

public class ServiceF {

	public void score (int score1, int score2, int score3, int score4, int score5, int score6, int score7) {
		int total = score1 + score2 + score3 + score4 + score5 + score6 + score7;
		float avg = (float)total / 7;
		System.out.println("ÃÑÁ¡ : " + total);
		System.out.println("Æò±Õ : " + avg);
	}
}
