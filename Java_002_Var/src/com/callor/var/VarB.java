package com.callor.var;

public class VarB {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		// ������ � ���� ����, �Ҵ�, �����Ϸ��� �ݵ�� ���� ����Ǿ�� �Ѵ�
		num1 = 30;
		num2 = 40;
		
		// ���� �ϰ�, �� ������ ���� ��� ����
		int sum1 = 0;
		sum1 = num1 + num2;
		
		// ����� ���ÿ� �� ������ ���� ��� ����
		int sum2 = num1 + num2;
		
		/*
		 * num1 + num2 ������ ����� ������ �����Ϸ��� �Ѵ�. �̶� num1�� num2 ������ type�� int type�̴�
		 * �̸��� num1�� num2 ������ ����� �����ʹ� �翬�� int type�̴� ��� ���� �����Ѵ�
		 * ��������� (int type) + (int type)�� ������ �ǰ� �� ����� �翬������ int type�� �ȴ�
		 * ���� ����� ������ sum1 ������ type�� �翬�� int type�� �Ǿ�� �Ѵ�
		 * 
		 * long�� �Ǵ� �Ǽ��� ������ ������ �� ������ ���⿡���� �޸� ���� ���� �� �ִ�
		 */
		System.out.println(sum1);
	}
}
