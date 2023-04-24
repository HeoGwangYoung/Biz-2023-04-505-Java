package com.callor.classes.exec;

import com.callor.classes.module.ServiceB;

public class ExecK {

	public static void main(String[] args) {
		ServiceB serviceB = new ServiceB();

		String name = "ȫ�浿";
		int rndKorScore = (int) (Math.random() * 50) + 51;
		int rndEngScore = (int) (Math.random() * 50) + 51;
		int rndMthScore = (int) (Math.random() * 50) + 51;

		serviceB.scorePrint(name, rndKorScore, rndEngScore, rndMthScore);
	}
}
