package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayB {


	public static void main(String[] args) {
		
		// ScoreServiceA�� ����� method�� ����ϱ� ���� ��ü���� ����
		ScoreServiceA scoreService = new ScoreServiceA();
		
		// 3���л��� ���������� ������ ��ü���� ����
		// �� �л��� �й�, �̸�, �������� ����
		ScoreDto ȫ�浿 = new ScoreDto();
		ȫ�浿.stName = "ȫ�浿";
		ȫ�浿.stNum = "0001";
		ȫ�浿.scKor = scoreService.getScore();
		ȫ�浿.scEng = scoreService.getScore();
		ȫ�浿.scMath = scoreService.getScore();

		ScoreDto �̸��� = new ScoreDto();
		�̸���.stName = "�̸���";
		�̸���.stNum = "0002";
		�̸���.scKor = scoreService.getScore();
		�̸���.scEng = scoreService.getScore();
		�̸���.scMath = scoreService.getScore();

		ScoreDto ������ = new ScoreDto();
		������.stName = "������";
		������.stNum = "0003";
		������.scKor = scoreService.getScore();
		������.scEng = scoreService.getScore();
		������.scMath = scoreService.getScore();

		
		// ����ǥ title ���
		System.out.println("=====================================================");

		System.out.printf("�й�\t�̸�\t����\t����\t����\t����\t���\n");

		System.out.println("-----------------------------------------------------");

		// �� �л��� ���� ���� ���
		scoreService.scorePrint(ȫ�浿);
		scoreService.scorePrint(�̸���);
		scoreService.scorePrint(������);
	}
}
