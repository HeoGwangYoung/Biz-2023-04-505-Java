package com.callor.score;

public class ScoreService {
	// ������ ������ �ν��Ͻ�
	public int korTotal = 0;
	public int engTotal = 0;
	public int mthTotal = 0;
	public int musTotal = 0;
	public int artTotal = 0;
	public int totalofTotal = 0;
	public float totalofAvg = 0f;
	
	// �л���ȣ�� ������ ������ �޼���
	public void stInfoInitalize(ScoreDto[] score) {
		int defualtNum = 23001;
		// �Ű������� ScoreDto Ÿ���� �迭������ �޾ƿͼ� �迭��ҿ� ���� ������ ��������
		for (int i = 0; i < score.length; i++) {
			score[i].stNum = String.format("%d", defualtNum);
			defualtNum ++;
			
			score[i].stKorSc = (int) (Math.random() * 50) + 51;
			score[i].stEngSc = (int) (Math.random() * 50) + 51;
			score[i].stMthSc = (int) (Math.random() * 50) + 51;
			score[i].stMusSc = (int) (Math.random() * 50) + 51;
			score[i].stArtSc = (int) (Math.random() * 50) + 51;
		}
	}

	public void Totalset(ScoreDto[] scores) {
		// �Ű������� �迭������ �޾ƿͼ� ���� �ν��Ͻ�(����)�� ������
		for (int i = 0; i < scores.length; i++) {
			korTotal += scores[i].stKorSc;
			engTotal += scores[i].stEngSc;
			mthTotal += scores[i].stMthSc;
			musTotal += scores[i].stMusSc;
			artTotal += scores[i].stArtSc;
			totalofTotal += scores[i].getStTotal();
			totalofAvg += scores[i].getStAvg();
		}
	}
	// �ܼ��� ��ܺκ��� ������ִ� �޼���
	public void printTitle() {
		System.out.println("=".repeat(70));
		System.out.println("* �ѿ� �� ���� ����Ʈ *");
		System.out.println("=".repeat(70));
		System.out.printf("�й�\t\t  ����\t  ����\t  ����\t  ����\t  �̼�\t ����\t���\n");
		System.out.println("-".repeat(70));
	}
	// �Ű������� �迭�� �޾ƿͼ� �迭����� �ν��Ͻ� �������� ������ִ� �޼���
	public void printStScore(ScoreDto[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s\t\t%5d\t%5d\t%5d\t%5d\t%5d\t%5d\t%.2f\n",
					score[i].stNum, score[i].stKorSc, score[i].stEngSc,
					score[i].stMthSc, score[i].stMusSc, score[i].stArtSc,
					score[i].getStTotal(), score[i].getStAvg());
		}
	}

	//�Ű������� �迭�� �޾ƿͼ�(����� ���Ҷ� �迭 ����� ������ ������ �ؼ� length�� ��������)
	//���� �ν��Ͻ���(����) �� ����� ������ִ� �޼���
	public void printTotal(ScoreDto[] score) {
		System.out.println("-".repeat(70));
		System.out.printf("����\t\t%5d\t%5d\t%5d\t%5d\t%5d\t%5d\n",
				this.korTotal, this.engTotal, this.mthTotal, 
				this.musTotal, this.artTotal, this.totalofTotal);
		System.out.println();
		System.out.printf("���\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\n", 
				(float)korTotal / score.length, (float)engTotal / score.length, (float)mthTotal / score.length, 
				(float)musTotal / score.length, (float)artTotal / score.length, totalofAvg / score.length);
		System.out.println("=".repeat(70));
	}
	
}
