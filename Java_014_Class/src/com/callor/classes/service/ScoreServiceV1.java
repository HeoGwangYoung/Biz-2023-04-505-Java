package com.callor.classes.service;

import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceV1 {

	// �л����� 10���� �����ϱ� ���� ��������
	private int classSize = 10;
	private int lineNum = 50;

	/*
	 * �Ű������� �Ϲ� ������ �ƴ� ������ ��ü ������ ����ߴ� ������ ��ü ������ ���� ����� ���� ���޵Ǵ� ���� �ƴϰ� �������� �ּҰ�
	 * ���޵ȴ�
	 * 
	 * main() method���� ������ scoreList�� �ּҰ� ���޵ǰ� makeScore() ���� ���� �����Ű�� main()
	 * method�� scoreList�� ���� ����Ǵ� ������ ���Եȴ�
	 */
	public void makeScore(List<ScoreDto> scoreList) {

		for (int i = 0; i < classSize; i++) {

			// 001, 002 �������� �й� ���ڿ� �����
			String stNum = String.format("%03d", i + 1);
			int scKor = (int) (Math.random() * 50) + 51;
			int scMath = (int) (Math.random() * 50) + 51;
			int scMusic = (int) (Math.random() * 50) + 51;
			int scArt = (int) (Math.random() * 50) + 51;

			/*
			 * List type�� ������ �迭������ ���� �迭����, �迭�ʱ�ȭ, �� ��ҿ� ������ ���� 1. ���� ����ִ�(blank) List
			 * type�� ���� 2. Dto ��ü������ �����ϰ� 3. Dto �� ������ ���� setting(setter) 4. List�� Dto�� add
			 */

			ScoreDto scoreDto = new ScoreDto();
			scoreDto.setStNum(stNum);
			scoreDto.setScKor(scKor);
			scoreDto.setScMath(scMath);
			scoreDto.setScMusic(scMusic);
			scoreDto.setScArt(scArt);

			scoreList.add(scoreDto);
		} // makeScore() end
	}

	public void printScore(List<ScoreDto> scList) {
		System.out.println("=".repeat(lineNum));
		System.out.println("�й�\t����\t����\t����\t�̼�\t����");
		System.out.println("-".repeat(lineNum));
		for (ScoreDto scoreDto : scList) {
			System.out.printf("%4s\t%4d\t%4d\t%4d\t%4d\t%4d\n", scoreDto.getStNum(), scoreDto.getScKor(), scoreDto.getScMath()
					, scoreDto.getScMusic(), scoreDto.getScArt(), scoreDto.getTotal());
		}
		System.out.println("=".repeat(lineNum));
	}
	
	// scList �����͸� ������ �������� �������� �����ϱ�
	// scList �� ��ü �����Ϳ��� getTotal() ���� �������� ���ϰ�
	// scList �� ��ü ��Ҹ� ��ȯ�ϱ�
	public void sortScore(List<ScoreDto> scList) {
		for (int i = 0; i < scList.size() - 1; i++) {
			for (int j = i + 1; j < scList.size(); j++) {
				
				if(scList.get(i).getTotal() > scList.get(j).getTotal()) {
					ScoreDto temp = scList.get(i);
					scList.set(i, scList.get(j));
					scList.set(j, temp);
				}
			}
		}
	}

	public void add(int num1, int num2) {
		num1 = 1000;
		num2 = 2000;
	}

}
