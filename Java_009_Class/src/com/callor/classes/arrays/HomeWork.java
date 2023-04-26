package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWork {

	public static void main(String[] args) {
		ScoreDto[] scores = new ScoreDto[10];

		// Ŭ���� �迭 ����
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}

		// �� ��ü�� �й��� �̸� ����
		scores[0].stNum = "0001";
		scores[0].stName = "ȫ�浿";
		scores[1].stNum = "0002";
		scores[1].stName = "�̸���";
		scores[2].stNum = "0003";
		scores[2].stName = "������";
		scores[3].stNum = "0004";
		scores[3].stName = "�庸��";
		scores[4].stNum = "0005";
		scores[4].stName = "�Ӳ���";
		scores[5].stNum = "0006";
		scores[5].stName = "��ö��";
		scores[6].stNum = "0007";
		scores[6].stName = "�����";
		scores[7].stNum = "0008";
		scores[7].stName = "�⵿̱";
		scores[8].stNum = "0009";
		scores[8].stName = "��ö��";
		scores[9].stNum = "0010";
		scores[9].stName = "�ѵ���";
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		// �� ��ü�� ���� ���� �� ���� ��� 
		for (int i = 0; i < scores.length; i++) {
			scores[i].scKor = (int) (Math.random() * 50) + 51;
			scores[i].scEng = (int) (Math.random() * 50) + 51;
			scores[i].scMath = (int) (Math.random() * 50) + 51;
			korTotal += scores[i].scKor;
			engTotal += scores[i].scEng;
			mathTotal += scores[i].scMath;
		}
		
		System.out.println("=".repeat(70));
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("-".repeat(70));
		
		ScoreServiceA scoreService = new ScoreServiceA();
		
		// ���� ���
		for (int i = 0; i < scores.length; i++) {
			scoreService.scorePrint(scores[i]);
		}
		System.out.println("-".repeat(70));
		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal, 10);
		System.out.println("=".repeat(70));
	}

}
