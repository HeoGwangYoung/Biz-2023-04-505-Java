package com.callor.controller.var;

public class VarE {

	public static void main(String[] args) {
		String str = "Republic of Korea";
		String nation = "";
		// str�� ����� ���ڿ��� 12��°���� �߶� �������� ���ڿ��� nation ������ ����
		nation = str.substring(12);
		System.out.println(nation);
		
		// str�� ����� ���ڿ��� 9��°���� �ѹ��ڸ��� 11��°���� �� �ѹ� �߶� �� ������ ���ڿ��� ���
		System.out.println(str.substring(9,11));
	}
}
