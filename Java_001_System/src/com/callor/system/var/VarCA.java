package com.callor.system.var;

public class VarCA {

	public static void main(String[] args) {
		
		boolean bYes = true;
		int intNum1 = 30;
		int intYes1 = 0;
		
		/*
		 *   = (���� ������) �������� ����� ����� ���� ������ ������ �´� Ÿ������ �����ؾ��Ѵ�
		 *   ������ ���� Ÿ���� �̸� �����Ǿ� �ְ� ������ Ÿ�Կ� �´� ����� �����ؾ� �Ѵ�
		 *   
		 *   intNum1 % 2�� ���� ���� ����� ���� 0 �Ǵ� 1�̹Ƿ� �� ����� ���������� �̸� �����
		 *   intYes1���� ������ ���ִ�
		 *   
		 *   ~~ == 0�� ���� ���� ����� boolean type�� true, false�̹Ƿ� �� ����� �̸� ����� bYes����
		 *   ���� �� ���ִ�
		 */
		intYes1 = intNum1 % 2;
		bYes = intNum1 % 2 == 0;
	}
}
