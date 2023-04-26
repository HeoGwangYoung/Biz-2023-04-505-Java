package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayD {
	/*
	 * class type �� ��ü �迭 �����
	 * ClassName[] object = new ClassName[10]
	 * class type�� �迭�� �Ϲ� ���� �迭�� �޸� ��� ����� �� ����. ���ÿ� �ʱ�ȭ ���� �ʴ´�
	 * ������ �迭 ��Ҹ� �ʱ�ȭ ��Ű�� �ڵ尡 �ʿ��ϴ�
	 */
	public static void main(String[] args) {

		ScoreDto[] scores = new ScoreDto[10];
		
		// class type�� �迭 ��� ��ü�� ��ü ��ҷ� �����ϱ�
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		
		ScoreServiceA scoreService = new ScoreServiceA();
		scores[0].stNum = "0001";
		scores[0].stName = "ȫ�浿";
		scores[0].scKor = scoreService.getScore();
		scores[0].scEng = scoreService.getScore();
		scores[0].scMath = scoreService.getScore();
		
		System.out.println("=".repeat(70));
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("-".repeat(70));
		
		scoreService.scorePrint(scores[0]);
	}
}