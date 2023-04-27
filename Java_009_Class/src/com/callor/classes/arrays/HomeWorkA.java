package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWorkA {

	public static void main(String[] args) {
		// �� �л��� ������ �����ϱ� ���� ��ü ���� ����
		// ���� = ���� + �ʱ�ȭ = ����� �غ� �� ����
		// ScoreDto Ŭ������ ����Ͽ� score ��ü(����)�� ����
		// ScoreDto() ������ method�� ����Ͽ� ��ü�� �ʱ�ȭ(new) �Ѵ�
		ScoreDto score = new ScoreDto();

		// ScroeDto type scores �迭�� �����ϰ� ��Ҹ� 10�� �����Ѵ�
		// scores �迭�� score ������ 10�� ��ҷ� ���´�
		ScoreDto[] scores = new ScoreDto[10];

		// Class type���� ����� �迭�� �ݵ�� ���� ��Ҹ� �ʱ�ȭ ��Ű�� ������ �ʿ��ϴ�
		scores[0] = new ScoreDto();
		scores[1] = new ScoreDto();
		scores[9] = new ScoreDto();

		// scores �迭 (���) ������ŭ for() �ݺ����� �̿��Ͽ� scores �迭�� ���� ��ҵ��� ��� �ʱ�ȭ �Ѵ�
		// scores �迭�� ��� ��ҵ��� �ʱ�ȭ �Ǿ� ����� �غ� �Ϸ�ȴ�
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		// �й�, �̸�, ���������� �� �迭�� ��ҿ� ����
		// ScoreServiceA Ŭ������ ���ǵ� �������� method, ���� ���� ��� method�� Ȱ���ϱ� ���Ͽ� ��ü�� �����ϱ�
		ScoreServiceA scoreService = new ScoreServiceA();

		scores[0].stNum = "0001";
		scores[0].stName = "ȫ�浿";
		scores[1].stNum = "0002";
		scores[1].stName = "�̸���";

		for (int i = 0; i < scores.length; i++) {
			scores[i].scKor = scoreService.getScore();
			scores[i].scEng = scoreService.getScore();
			scores[i].scMath = scoreService.getScore();
		}
	}
}
