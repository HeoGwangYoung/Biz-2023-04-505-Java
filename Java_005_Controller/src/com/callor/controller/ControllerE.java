package com.callor.controller;

public class ControllerE {

	/*
	 * method�� ����
	 * method�� ��ġ java�� ��ɹ��� ���� ����� �Ͱ� ����
	 * method ���� ��Ģ�� ���� �̸�() {} ���� ����� {} ���� ���ϴ� �ڵ带 �ۼ��Ѵ�
	 */
	public static void prime() {
		
		boolean isPrime = true;
		int rndNum = (int) (Math.random() * 50) + 51;

		for (int j = 2; j < rndNum; j++) {
			if (rndNum % j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(rndNum + "\t �Ҽ�");
		}
	}
	
	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// prime() method �� {} ���� �ڵ带 �����ش޶�
			// prime() method �� ȣ���Ѵ�
			prime();
		}
	}

}
