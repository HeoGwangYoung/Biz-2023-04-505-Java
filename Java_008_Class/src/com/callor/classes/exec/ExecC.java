package com.callor.classes.exec;

import com.callor.classes.model.ScoreDto;

public class ExecC {

	public static void main(String[] args) {
		ScoreDto ȫ�浿 = new ScoreDto();
		ScoreDto �̸��� = new ScoreDto();
		ScoreDto ������ = new ScoreDto();
		
		ȫ�浿.stName = "ȫ�浿";
		ȫ�浿.intKor = 100;
		
		�̸���.stName = "�̸���";
		�̸���.intKor = 88;
		
		������.stName = "������";
		������.intKor = 99;
		������.intEng = 79;
		������.intMth = 73;
		������.intHis = 83;
		������.intArt = 67;
		������.intMus = 82;
		������.intAth = 93;
		
		System.out.println("������ �������� : " + ������.intKor);
		System.out.println("������ ���� : " + ������.getTotal());
	}
}
