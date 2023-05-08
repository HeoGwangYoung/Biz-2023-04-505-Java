package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.service.ScoreServiceV1;

/*
 * �Ϲ����� ����(primitive)�� method�� �Ű������� �����Ҷ� ���� ��ü�� ���޵Ǵ� ���� �ƴϰ� ������ "��(������)"�� ���޵ȴ�
 * �Ű������� ���޹��� method ���� �ƹ��� ������ ���� �����ص� ���� ���� ������� �ʴ´�
 */

public class ScoreB {

	public static void main(String[] args) {
		// ScoreDto type �� ������ ��Ҹ� ������ scoreList ����Ʈ ��ü ����
		List<ScoreDto> scList = new ArrayList<>();
		ScoreServiceV1 scService = new ScoreServiceV1();
		
		scService.makeScore(scList);
//		System.out.println(scList.toString());
		
		System.out.println("���� ��");
		scService.printScore(scList);
		
		scService.sortScore(scList);
		
		System.out.println("���� ��");
		scService.printScore(scList);
		
//		int num1 = 100;
//		int num2 = 200;
		// scService add() ���� ������ �����ϱ�
		// num1, num2�� ����� ���� ���޵ȴ� ������ ���޵Ǵ� ���� �ƴϴ�
//		scService.add(num1, num2);
//		System.out.println(num1);
//		System.out.println(num2);
	}
}
