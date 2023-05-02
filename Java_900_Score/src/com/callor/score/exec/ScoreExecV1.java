package com.callor.score.exec;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.ScoreServiceV1;

public class ScoreExecV1 {

	public static void main(String[] args) {
		// 10�� �л��� ������ ������ ��ü�迭 ����
		ScoreDto[] scoreList = new ScoreDto[10];

		// ��ü�迭 �ʱ�ȭ �ϱ�
		for (int i = 0; i < scoreList.length; i++) {
			scoreList[i] = new ScoreDto();
		}

		// ScoreService�� �ִ� method ���� ����ϱ� ���� �غ�
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		// ScoreService Ŭ������ scoreList ��ü �迭������ ������(����� �ʱ�ȭ�� �Ϸ��) scoreList ��ü �迭����
		// �����ϴ� ����
		scService.setScoreList(scoreList);
		
		
		// ���� �����ϱ�
		scService.scoreRndMake();
		
		/*
		 * ScoreSerive�� scoreList ��ü �迭�� public���� �����ʰ� private ���� �����Ѵ�
		 * �ڵ� ��𼱰� ������(�ۼ���)�� ����ġ �ʰ� scoreList �����Ͱ� ����Ǵ� ���� �����ϴ� �����̴�
		 * 
		 */
//		scService.scoreList = new ScoreDto[100];
		
		// ���� ����Ʈ ����ϱ�
		scService.scoreListPrint();
		scService.scoreTotalPrint();
		scService.scoreAvgPrint();
	}
}
