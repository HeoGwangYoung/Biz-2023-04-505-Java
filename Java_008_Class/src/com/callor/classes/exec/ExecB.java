package com.callor.classes.exec;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.module.ServiceB;

public class ExecB {

	public static void main(String[] args) {

		/*
		 * ScroeDto Ŭ������ ����Ͽ� scoreDto ��ü�� �����ϰ� ������ method(scoreDto())�� ����Ͽ� ��ü��
		 * �ʱ�ȭ(new)�Ѵ�
		 * 
		 * scoreDto ��ü�� �ʱ�ȭ �Ͽ� ����� �غ� �Ǹ� �ν��Ͻ��� �Ǿ��ٶ�� ǥ���Ѵ�
		 * 
		 * scoreDto ��ü�� �ʱ�ȭ �ϴ� ���� scoreDto Ŭ�������� ������ ������ (���⼭�� 9����)�� ��� ����� �� �ֵ��� ���ÿ�
		 * �ʱ�ȭ�� �ȴ�
		 */
		ScoreDto scoreDto = new ScoreDto();
		// �ʱ�ȭ�� scoreDto�� ���Ե� �������� ���� �ٽ� ����
		scoreDto.intKor = (int) (Math.random() * 50) + 51;
		scoreDto.intMth = (int) (Math.random() * 50) + 51;
		scoreDto.intMus = (int) (Math.random() * 50) + 51;
		scoreDto.intHis = (int) (Math.random() * 50) + 51;
		scoreDto.intAth = (int) (Math.random() * 50) + 51;
		scoreDto.intArt = (int) (Math.random() * 50) + 51;
		scoreDto.intEng = (int) (Math.random() * 50) + 51;

		scoreDto.stNum = "0001";
		scoreDto.stName = "ȫ�浿";

		ServiceB serviceB = new ServiceB();
		serviceB.score(scoreDto);
	}
}
