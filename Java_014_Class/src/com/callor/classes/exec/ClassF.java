package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassF {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("Korea");
		strList.add("���ѹα�");
		strList.add("�츮����");
		
		// index 0���� ������ ����
		// �����Ͱ� ���ŵǸ� list�� size() �� �پ���
		strList.remove(0);
		strList.remove(0);
		strList.remove(0);
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.print(strList.get(i));
		}
	}
}
