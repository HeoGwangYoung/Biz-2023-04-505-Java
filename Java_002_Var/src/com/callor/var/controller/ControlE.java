package com.callor.var.controller;

public class ControlE {

	public static void main(String[] args) {
		int intRnd = (int) (Math.random() * 10) + 1;

		if (intRnd % 3 == 0) {
			System.out.println(intRnd + "��(��) 3�� ����Դϴ�");
		}
		// intRnd ���� 3�� ����� ��쵵 �ѹ� �ƴѰ��� Ȯ���Ͽ� �ټ� ��ȿ������ �ڵ� ������ �ȴ�
		if (intRnd % 3 != 0) {
			System.err.println(intRnd + "��(��) 3�� ����� �ƴմϴ�");
		}
		
		// ���� ���ϴ� ���� : 3�� ��� ã��
		if (intRnd % 3 == 0) {
			System.out.println(intRnd + "��(��) 3�� ����Դϴ�");
		// ���� ���ϴ� ������ �޼����� ������ ���
		} else {
			System.out.println(intRnd + "��(��) 3�� ����� �ƴմϴ�");
		}
	}
}
