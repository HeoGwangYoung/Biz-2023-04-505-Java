package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {

	public static void main(String[] args) {
		// java 1.7 ���� �������� �����ڿ��� Generic�� �����ص� �ȴ�
		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			numList.add(rndNum);
		}

		for (int i = 0; i < numList.size() - 1; i++) {
			for (int j = i + 1; j < numList.size(); j++) {
				if (numList.get(i) > numList.get(j)) {
					
					numList.add(i, numList.get(j));
					numList.add(j + 1, numList.get(i + 1));
					
					numList.remove(i + 1);
					numList.remove(j + 1);
					
					// numList.set ���� �� �����ϰ� ����
					// int num = nummList.get(i)
				}
			}
		}
		
		// List type�� ��ü�������� toString() method�� ���Եǰ� �ܼ��� List�� ������ ��� �� �� �� �ִ�
		System.out.println(numList.toString());
	}
}
