package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassE {

	public static void main(String[] args) {
		
		// Generic type <>�� ������ Ŭ���� type
		// numList�� �߰� �� �� �ִ� �����ʹ� ������ �����ϵ��� �Ѵ�
		// Generic type�� primitive type �� ����� �� ����
		// �ݵ�� Ŭ���� (wrapper class, data class)�� ����� �� �ִ�
		
//		List<int>numList1 = new ArrayList<>();
		// numList���� �������� �߰��� �� �ִ� ��Ģ�ο�
		List<Integer> numList = new ArrayList<>();

		System.out.println(numList.size());

		// List type�� ������ item �߰��ϱ�
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(50);
//		numList.add(30.0f);
		System.out.println(numList.size());

		// index 3�� ��ġ�� 100�� ���� �߰��ϱ� 
		numList.add(3, 100);
		numList.add(3, 200);

		for (int i = 0; i < numList.size(); i++) {
			System.out.print(numList.get(i) + "\t");
		}
	}
}
