package com.callor.var.controller;

public class ControlF {

	public static void main(String[] args) {
		int intRnd = (int) (Math.random() * 10) + 1;
		
		if (intRnd % 3 == 0) {
			int intResult = intRnd * 3;
			System.out.println(intResult);
		} else {
			System.out.println(intRnd + "��(��) 3�� ����� �ƴմϴ�");
		}
		/*
		 * intResult ������ if() { } �� scope�� ���´� => if() { } block ���ο����� ������ �����Ѵ�
		 * ��, if () { }�� ����� intResult ������ ����(�б�, ����(�Ҵ�))�� �� ����
		 */
		//System.out.println(intResult);
	}
}
