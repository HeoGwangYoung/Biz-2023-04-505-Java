package com.callor.classes.module;

import com.callor.classes.model.ScoreDto;

public class ServiceB {

	public void score(ScoreDto score) {
		
		System.out.println("학번 : " + score.stNum);
		System.out.println("이름 : " + score.stName);
		System.out.println("국어 : " + score.intKor);
		System.out.println("영어 : " + score.intEng);
		System.out.println("수학 : " + score.intMth);
		System.out.println("국사 : " + score.intHis);
		System.out.println("음악 : " + score.intMus);
		System.out.println("미술 : " + score.intArt);
		System.out.println("체육 : " + score.intAth);

		System.out.println("총점 : " + score.getTotal());
		System.out.println("평균 : " + score.getAvg());
	}
}
