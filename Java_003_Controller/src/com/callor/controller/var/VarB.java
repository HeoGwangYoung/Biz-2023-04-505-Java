package com.callor.controller.var;

public class VarB {

	public static void main(String[] args) {
		// ������(character type)
		// ������, ����(����ȭ��), �ѱ� �ѱ��ڸ� ������ �� �ִ� ��Ư�� ����
		char cVar = 'A';
		System.out.println(cVar);
		System.out.println(cVar + 0);

		for (char c = 'A'; c < 'Z' + 1; c++) {
			System.out.print(c + 0);
			System.out.print("\t");
		}
	}
}
