package com.callor.classes.exec;

public class NumbersA {

	public static void main(String[] args) {
		
		// �⺻�ڷ��� (primitive type) ���� ���� Ű����
		int num1 = 0;
		float num2 = 0.0f;
		long num3 = 0l;
		double num4 = 0.0;
		boolean bYes = true;
		char cVar = 'A';
		
		// �����ڷ���(class type) ���� ���� Ű����
		// �⺻�ڷ��� ������ Ư���� ����� �ΰ��Ͽ� �����뵵�� ����ϱ� ���� Ű����
		// �⺻������ ������ ������ Ŭ������
		// Wrapper class
		// �⺻���� ������ �����鼭, Ȯ��� ����� ������ �ϴ� Ŭ����
		Integer intNum1 = 0;
		Float floatNum2 = 0.0f;
		Long longNum3 = 0l;
		Double doubleNum4 = 0.0;
		Boolean bYes1 = true;
		String str = "Republic of Korea";
		Character cVar1 = 'A';
		
		// �⺻������ �����͸� �����ϴ� ������ ������ ���´�
		// int�� ������ Integer�� ������ �⺻ �������� �����ϴ� ������ ������ ���´�
		num1 = intNum1; // Integer type�� �����͸� int type�� ������ ����
		intNum1 = num1; // int type�� �����͸� Integer type�� ������ ����
		
		/*
		 *  primitive(�⺻��) ������ ����� �����͸� wrapper(������) ������ �����ϴ� ����
		 *  Ȯ��� ����� ����� �� �ִ�
		 *  �⺻�� ������ ����� �����͸� ������ ������ �����ϴ� ��
		 *  box�� �⺻�� ������ ��� �Ͱ� �����ؼ� boxing �̶�� �Ѵ�
		 *  
		 *  Wrapper Ŭ������ ����� �����͸� �⺻�� ������ �����ϴ� ���� unboxing (�ڽ� ��ü) �̶�� �Ѵ�
		 */
	}
}
