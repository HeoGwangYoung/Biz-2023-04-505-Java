package com.callor.controller;

public class ControllerF {

	/*
	 * prime() method �� �ڵ带 �����Ͽ� ������ �������� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ�� ����
	 * 
	 * void type�� prime() method�� boolean type�� prime() method�� ����
	 * 
	 * method�� �����Ҷ� void type �̿��� type���� �����ϸ� method {} ������ �ݵ�� return ��ɹ��� �־�� �Ѵ�
	 * 
	 */
	public static boolean prime() {

		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;

		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
//				break;
				return false;
			}
		}

		boolean yesPrime = rndNum <= index;

//		if (isPrime) {
//			System.err.println(rndNum + "\t�Ҽ�");
//		} else {
//			System.out.println(rndNum + "\t\t�Ҽ� �ƴ�");
//		}
		return yesPrime;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// prime() method �� {} ���� �ڵ带 �����ش޶�
			// prime() method �� ȣ���Ѵ�
			if (prime()) {
				System.out.println("�Ҽ�");
			} else {
				System.err.println("�Ҽ� �ƴ�");
			}
		}
	}

}
