package com.callor.var.controller;

public class ControlH {

	public static void main(String[] args) {

		int num = 1;
		for (; num < 10;) {
			System.out.println("�ȳ��ϼ���" + (num++));
		}

		int index = 1;
		// index < 10 ������ true �� ���ȸ� { } ������ �ڵ带 �����Ѵ�
		for (; index < 10;) {
			System.out.printf("%d x %d = %d\n", 5, index, 5 * index++);
		}
	}
}
