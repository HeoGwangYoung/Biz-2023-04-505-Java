package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWorkB {

	public static void main(String[] args) {

		// �� ���ڿ� �迭�� ��ҿ� �̸��� ����
		// DB�� ���� ������ ������, Ű���� ������ ������Ʈ�� ����Ǵ� �߿� ������ �����͸�
		// �迭�� �����ϴ� ���
		String[] names1 = new String[10];
		names1[0] = "ȫ�浿";
		names1[1] = "�̸���";
		names1[2] = "������";
		names1[3] = "�庸��";
		names1[4] = "�Ӳ���";
		names1[5] = "��ö��";
		names1[6] = "�����";
		names1[7] = "�⵿̱";
		names1[8] = "��ö��";
		names1[9] = "�ѵ���";
		
		// String[] names = new String[10];
		// = {} �� ǥ�õ� ��ҵ��� �⺻ ������ �Ͽ� names �迭 �����ϱ�
		// names �迭�� ��ҿ� ������ ���� �̸� Ȯ���� ���
		String[] names = {"ȫ�浿", "�̸���", "������", "�庸��", "�Ӳ���"
						, "��ö��", "�����", "�⵿̱", "��ö��", "�ѵ���"};
		
//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + "\t");
//		}
//		System.out.println();
		
		// names(�л��̸�) �迭�� ��� ���� ��ŭ scores �迭 ��Ҹ� �����ϰ� �ʹ�
		ScoreDto[] scores = new ScoreDto[names.length];

		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		
		ScoreServiceA scoreService = new ScoreServiceA();

		for (int i = 0; i < scores.length; i++) {
			// names �迭�� ����� �л��̸��� ������� scores �迭 ����� stName �Ӽ��� �����ϱ�
			scores[i].stName = names[i];
//			scores[i].stNum = (i + 1) + "";
			scores[i].stNum = String.format("%04d", i+1);
			// �� �л��� ���� ������ ������ ���õ����ͷ� �����ϱ�
			scores[i].scKor = scoreService.getScore();
			scores[i].scEng = scoreService.getScore();
			scores[i].scMath = scoreService.getScore();
		}
		System.out.println("=".repeat(70));
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���");
		System.out.println("-".repeat(70));
		for(int i = 0; i < scores.length; i++) {
			scoreService.scorePrint(scores[i]);
		}
	}
}
