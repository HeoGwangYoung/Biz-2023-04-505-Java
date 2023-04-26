package com.callor.classes.service;

import com.callor.classes.model.ScoreDto;

public class ScoreServiceA {
	// 51 ~ 100���� ������ �������� ����� return �ϴ� method
	public int getScore() {
		int score = (int) (Math.random() * 50) + 51;
		return score;
	}
	// ScoreDto type �Ű������� ���Ͽ� �������� �����͸� �޾Ƽ� ����ϱ�
	public void scorePrint(ScoreDto score) {
		System.out.printf("%s\t%s\t%4d\t%4d\t%4d\t%4d\t%.2f\n",
				score.stNum, score.stName, score.scKor, score.scEng, score.scMath,
				score.getTotal(), score.getAvg());
	}
	
	public void scoreTotalPrint(int kor, int eng, int math, int num) {
		System.out.printf("\t\t%4d\t%4d\t%4d\t%4d\t%.2f\n",
				kor, eng, math, kor+eng+math, (float)(kor+eng+math) / (3*num));
	}
}
