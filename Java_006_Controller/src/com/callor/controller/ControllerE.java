package com.callor.controller;

public class ControllerE {

	/*
	 * 2���� ������ �μ��� ���޹޾� method ������ �Ҷ� ������ �Ű����� 2���� �ʿ�
	 * ����� return �ϴ� method  ������ �������� ����� int���̴�
	 * method�� return type�� int
	 */
	public static void main(String[] args) {
		/*
		 1. add() method ȣ��
		 2. add() method �� 2���� ������ �Ű������� ������ �ִ� ������ 2���� "����" �� �־�� �Ѵ�
		 3. add() method ������ �� ������� return �Ѵ�
		 4. add() method �� return �� ���� �ٸ� ������ ����
		 5. �̶� "add() method ������"�� �ٸ� ������ �����Ϸ���
		 	�� ������ type�� add() method�� return type�� ���ƾ��Ѵ� �׷��� int result �������� ������ �����Ѵ�
		 6. result �������� add() method�� ���� ����� ����
		 */
		int num1 = 3;
		int num2 = 5;
		int result = add(num1, num2);
		System.out.println("�ż��� ȣ�� ��� : " + result);
	}
	
	public static int add(int firstNum, int secondNum) {
		int result = firstNum + secondNum;
		// ������� ������ �� return
		// add() method ���忡�� ���� firstNum �� secondNum���� � �������� ����Ǿ� ���� ���̴� ��� ����
		return result;
		
		// ����� ���ÿ� ����� return �� ������ ����� ���� �����ϰ� �� ����� return
		// return firstNum + secondNum;
	}
}
