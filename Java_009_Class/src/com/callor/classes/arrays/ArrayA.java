package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;

public class ArrayA {

	public static void main(String[] args) {
		ScoreDto ȫ�浿 = new ScoreDto();
		ȫ�浿.stName = "ȫ�浿";
		ȫ�浿.stNum = "0001";
		ȫ�浿.scKor = (int)(Math.random() * 50) + 51;
		ȫ�浿.scEng = (int)(Math.random() * 50) + 51;
		ȫ�浿.scMath = (int)(Math.random() * 50) + 51;
		
		ScoreDto �̸��� = new ScoreDto();
		�̸���.stName = "�̸���";
		�̸���.stNum = "0002";
		�̸���.scKor = (int)(Math.random() * 50) + 51;
		�̸���.scEng = (int)(Math.random() * 50) + 51;
		�̸���.scMath = (int)(Math.random() * 50) + 51;
		
		ScoreDto ������ = new ScoreDto();
		������.stName = "������";
		������.stNum = "0003";
		������.scKor = (int)(Math.random() * 50) + 51;
		������.scEng = (int)(Math.random() * 50) + 51;
		������.scMath = (int)(Math.random() * 50) + 51;
		
		System.out.println("=====================================================");
		
		System.out.printf("�й�\t�̸�\t����\t����\t����\t����\t���\n");
		
		System.out.println("-----------------------------------------------------");
		
		System.out.printf("%s\t%s\t%4d\t%4d\t%4d\t%4d\t%.1f\n", ȫ�浿.stNum, ȫ�浿.stName, ȫ�浿.scKor, 
				ȫ�浿.scEng, ȫ�浿.scMath, ȫ�浿.getTotal(), ȫ�浿.getAvg());
		
		System.out.printf("%s\t%s\t%4d\t%4d\t%4d\t%4d\t%.1f\n", �̸���.stNum, �̸���.stName, �̸���.scKor, 
				�̸���.scEng, �̸���.scMath, �̸���.getTotal(), �̸���.getAvg());
		
		System.out.printf("%s\t%s\t%4d\t%4d\t%4d\t%4d\t%.1f\n", ������.stNum, ������.stName, ������.scKor, 
				������.scEng, ������.scMath, ������.getTotal(), ������.getAvg());
	}
}
