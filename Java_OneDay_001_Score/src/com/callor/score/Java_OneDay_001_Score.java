package com.callor.score;


public class Java_OneDay_001_Score {
	
	public static void main(String[] args) {
		// �迭 ����
		ScoreDto[] scores = new ScoreDto[10];
		
		// ��ü ����
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		
		// ScoreServiceŬ���� �޼��带 ����ϱ� ���� ���� ��ü ����
		ScoreService serv = new ScoreService();
		
		// ���� ���� (�ݵ�� ������� ȣ���������)
		serv.stInfoInitalize(scores);
		serv.Totalset(scores);
		
		// ���
		serv.printTitle();
		serv.printStScore(scores);
		serv.printTotal(scores);
	}
}
