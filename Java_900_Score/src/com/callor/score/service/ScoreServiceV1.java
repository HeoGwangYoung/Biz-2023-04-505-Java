package com.callor.score.service;

import com.callor.score.model.ScoreDto;

/*
 * Java�� �̿��� Application ���� �Ϲ����� �������� Service Ŭ������ ����Ѵ�
 * Service Ŭ������ ������ �ַ� ����Ͻ����� �ڵ尡 �ۼ��ȴ�
 * ���������� ����ڿ��� �ϴ����� ������� �ʰ�, ������ ����, ����, ��� ���� �����ϴ� �ڵ��̴�
 * 
 * �л��� ���������� ���������� �����ϴ� method
 * �л��� ��������Ʈ�� ����ϴ� method
 * �� ������ ������ ����Ͽ� ����ϴ� method
 * �� ������ ����� ����Ͽ� ����ϴ� method
 */
public class ScoreServiceV1 {
	private int intKor;
	private int intEng;
	private int intMath;
	private int intMus;
	private int intArt;
	private float floatAvg;
	
	// �迭 ����, ������ ������ �ʰ�, �ʱ�ȭ�� ���� ���� ����
	private ScoreDto[] scoreList; // this.scoreList

	/*
	 * scoreList ��ü ������ �����͸� ���޹޾� �������� �ʱ�ȭ(setting)�ϴ� method
	 *  1. ScoreDto Ŭ������ �迭�� �ϴ�type�� scoreList �Ű����� ����
	 *  2. �ٸ������� ���޹��� scoreList ������ ���� this.scoreList �������Ҵ��ϱ�
	 * 
	 */

	public void setScoreList(ScoreDto[] scoreList) {
		this.scoreList = scoreList;
	}

	/*
	 * private ���������ڰ� ����� method
	 * �� method �� ���� Ŭ���� scope �� method �鸸 ����Ҽ� �ֵ��� �ϴ� ��
	 */
	private int getScore() {
		return (int) (Math.random() * 50) + 51;
	}

	// �л��� ���������� ���������� �����ϴ� method
	public void scoreRndMake() {
		for (int i = 0; i < scoreList.length; i++) {
			
			// 23*** ������ �й� �����ϱ�
			String stNum = String.format("23%03d", i+1);
			scoreList[i].stNum = stNum;
			// ������ �й� �� �л��� ���� ��ü�� ����ϱ�
			scoreList[i].scKor = getScore();
			scoreList[i].scEng = getScore();
			scoreList[i].scMath = getScore();
			scoreList[i].scMusic = getScore();
			scoreList[i].scArt = getScore();
		}

	}

	public void scoreListPrint() {
		System.out.println("=".repeat(70));
		System.out.println("�ѿ� �� ����ó�� �ý��� 2023");
		System.out.println("-".repeat(70));
		System.out.println("�й�\t����\t����\t����\t����\t�̼�\t����\t���");
		System.out.println("-".repeat(70));

		for (int i = 0; i < scoreList.length; i++) {
			System.out.printf(scoreList[i].stNum + "\t");
			System.out.printf("%5d\t", scoreList[i].scKor);
			System.out.printf("%5d\t", scoreList[i].scEng);
			System.out.printf("%5d\t", scoreList[i].scMath);
			System.out.printf("%5d\t", scoreList[i].scMusic);
			System.out.printf("%5d\t", scoreList[i].scArt);
			System.out.printf("%5d\t", scoreList[i].getTotal());
			System.out.printf("%5.2f\n", scoreList[i].getAvg());
		}
		System.out.println("-".repeat(70));
	}

	public void scoreTotalPrint() {
		// �������� ������ �ջ��ϱ� ���� ���� ����
//		int intKor = 0;
//		int intEng = 0;
//		int intMath = 0;
//		int intMus = 0;
//		int intArt = 0;
		
		// �� ���� ���� ���� ����ϱ�
		for (int i = 0; i < scoreList.length; i++) {
			intKor += scoreList[i].scKor;
			intEng += scoreList[i].scEng;
			intMath += scoreList[i].scMath;
			intMus += scoreList[i].scMusic;
			intArt += scoreList[i].scArt;
			
			// ����� ����� ����ϱ� ���� �غ�
			// �� �л��� ����� �� �ջ��� ����Ͽ� floatAvg�� �����صα�
			floatAvg += scoreList[i].getAvg();
		}
		System.out.print("����\t");
		System.out.printf("%5d\t", intKor);
		System.out.printf("%5d\t", intEng);
		System.out.printf("%5d\t", intMath);
		System.out.printf("%5d\t", intMus);
		System.out.printf("%5d\t", intArt);
		
		int intTotal = intKor;
		intTotal += intEng;
		intTotal += intMath;
		intTotal += intMus;
		intTotal += intArt;
		System.out.printf("%5d\n", intTotal);
	}

	public void scoreAvgPrint() {
		System.out.print("���\t");
		System.out.printf("%5.2f\t", (float)intKor / scoreList.length);
		System.out.printf("%5.2f\t", (float)intEng / scoreList.length);
		System.out.printf("%5.2f\t", (float)intMath / scoreList.length);
		System.out.printf("%5.2f\t", (float)intMus / scoreList.length);
		System.out.printf("%5.2f\t\t", (float)intArt / scoreList.length);
		System.out.printf("%5.2f\n", (float)floatAvg / scoreList.length);
		System.out.println("=".repeat(70));
		
	}
}
