package com.callor.controller;

public class ControllerH {

	public static boolean prime(int rndNum) {
		int index = 0;

		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		boolean yesPrime = rndNum <= index;

		return yesPrime;
	}
	/*
	 * Java������ method�� �̸��� �Ű������� type�� ���� prime(int rndNum)�� prime(int)��� �̸����� ����ǰ�
	 * prime() �� prime()��� �̸����� ����ȴ� ���� prime(int)�� prime()�� ���� �ٸ� method�� �ν��Ѵ� �̰���
	 * Java�� Ư¡�߿� �ߺ�����(OverLoading)�̶�� �Ѵ�
	 * 
	 * ȣ���ϴ� ������ prime(30)�� ���� ȣ���ϸ� prime(int)�� ����ǰ� prime()�� ���� ȣ���ϸ� prime()�� ����ȴ�
	 */

	public static boolean prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;

		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		boolean yesPrime = rndNum <= index;

		return yesPrime;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int mainRndNum = (int) (Math.random() * 50) + 51;

			if (prime(mainRndNum)) {
				System.err.println(mainRndNum + "�Ҽ�");
			} else {
				System.out.println(mainRndNum + "�Ҽ� �ƴ�");
			}
			if (prime()) {
				System.out.println("overloading method result : prime number");
			}
		}

	}
}
