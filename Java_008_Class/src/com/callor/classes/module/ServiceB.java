package com.callor.classes.module;

import com.callor.classes.model.ScoreDto;

public class ServiceB {

	public void score(ScoreDto score) {
		
		System.out.println("�й� : " + score.stNum);
		System.out.println("�̸� : " + score.stName);
		System.out.println("���� : " + score.intKor);
		System.out.println("���� : " + score.intEng);
		System.out.println("���� : " + score.intMth);
		System.out.println("���� : " + score.intHis);
		System.out.println("���� : " + score.intMus);
		System.out.println("�̼� : " + score.intArt);
		System.out.println("ü�� : " + score.intAth);

		System.out.println("���� : " + score.getTotal());
		System.out.println("��� : " + score.getAvg());
	}
}
