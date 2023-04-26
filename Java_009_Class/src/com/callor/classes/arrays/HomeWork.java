package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWork {

	public static void main(String[] args) {
		// Ŭ���� �迭 ����
		ScoreDto[] scores = new ScoreDto[10];

		// Ŭ���� �迭�� ������ ��ü ����
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		// �̸��� �й��� ���� �迭 ����
		String[] name = {"ȫ�浿", "�̸���", "������", "�庸��", "�Ӳ���", "��ö��", "�����", "�⵿̱", "��ö��", "�ѵ���"};
		String[] num = {"0001", "0002", "0003", "0004", "0005", "0006", "0007", "0008", "0009", "0010"};
		// ������ ������ ���� ����
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		// �� ��ü�� ���������� �� ���� ��� 
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
		// Ÿ��Ʋ ���
		System.out.println("=".repeat(70));
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("-".repeat(70));
		
		// ���� �޼��带 �̿��ϱ� ���� ��ü ����
		ScoreServiceA scoreService = new ScoreServiceA();
		
		// ���� ���
		for (int i = 0; i < scores.length; i++) {
			scoreService.scorePrint(scores[i]);
		}
		System.out.println("-".repeat(70));
		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal, scores.length);
		System.out.println("=".repeat(70));
	}

}
