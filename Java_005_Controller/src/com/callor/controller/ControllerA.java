package com.callor.controller;

public class ControllerA {

	public static void main(String[] args) {
		/*
		 * ū �Ǽ��� (double) douNum ������ �����ϰ� Math.random() �� ������� ������ �ʱ�ȭ �Ѵ�
		 */
		double douNum = Math.random();
//		douNum = douNum * 50;
		douNum *= 50;
		/*
		 * ������ intNum ������ �����ϰ� douNum������ ���� ���������� ��ȯ�� �� �ʱ�ȭ �Ͽ���
		 */
		int intNum = (int) douNum;
		intNum += 51;

		/*
		 * int type(������) rndNum ������ �����ϰ� 51 ~ 100���� ���Ƿ� ������ �������� rndNum ������ �ʱ�ȭ �Ͽ���
		 */
		int rndNum = (int) (Math.random() * 50) + 51;

		// rndNum ������ ����� ���� �о Console�� ����϶�
		System.out.println(rndNum);
	}
}
