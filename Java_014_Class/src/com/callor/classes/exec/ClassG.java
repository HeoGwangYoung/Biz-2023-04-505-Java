package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassG {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			numList.add(rndNum);
		}

		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) % 2 == 0) {
				System.out.print(numList.get(i) + " ");
			}
		}
		// numList�� �� ���� ���� 10�� �߰��ϱ�
		numList.add(10);

		// index 0�� ��ġ�� ������ ����
		numList.remove(0);
		
		// index 0�� ��ġ�� ������ �߰�
		numList.add(0, 20);
		
		// index 0�� ��ġ�� ������ �о num ������ ����
		int num = numList.get(0);
		
		// index 1�� ��ġ�� �����͸� 100���� ����
		// ������ index 1�� ��ġ�� �����ʹ� �����ǰ� 100�� ����
		numList.set(1, 100);
		
	}
}
