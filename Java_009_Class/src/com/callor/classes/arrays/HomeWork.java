package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWork {

	public static void main(String[] args) {
		// 클래스 배열 생성
		ScoreDto[] scores = new ScoreDto[10];

		// 클래스 배열에 각각의 객체 생성
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		// 이름과 학번을 담을 배열 선언
		String[] name = {"홍길동", "이몽룡", "성춘향", "장보고", "임꺽정", "김철수", "김희경", "이기동", "박철수", "한동후"};
		String[] num = {"0001", "0002", "0003", "0004", "0005", "0006", "0007", "0008", "0009", "0010"};
		// 총합을 저장할 변수 선언
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		// 각 객체에 데이터저장 및 총합 계산 
		for (int i = 0; i < scores.length; i++) {
			scores[i].stName = name[i];
			scores[i].stNum = num[i];
			scores[i].scKor = (int) (Math.random() * 50) + 51;
			scores[i].scEng = (int) (Math.random() * 50) + 51;
			scores[i].scMath = (int) (Math.random() * 50) + 51;
			korTotal += scores[i].scKor;
			engTotal += scores[i].scEng;
			mathTotal += scores[i].scMath;
		}
		// 타이틀 출력
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(70));
		
		// 서비스 메서드를 이용하기 위해 객체 생성
		ScoreServiceA scoreService = new ScoreServiceA();
		
		// 점수 출력
		for (int i = 0; i < scores.length; i++) {
			scoreService.scorePrint(scores[i]);
		}
		System.out.println("-".repeat(70));
		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal, scores.length);
		System.out.println("=".repeat(70));
	}

}
