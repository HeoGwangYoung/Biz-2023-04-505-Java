package com.callor.controller;

public class ControllerB {

	public static boolean prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;
		for (index = 0; index < rndNum; index++) {
			if (rndNum % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			/*
			 * prime() method�� �����Ͽ� return ���� yesPrime�� �����ϱ�
			 * �̶� prime() method�� return type�� yesPrime�� return type�� ���ƾ� �Ѵ�
			 */
			boolean yesPrime = prime();
			if(yesPrime) {
				System.out.println("�Ҽ�");
			} else {
				System.out.println("�Ҽ� �ƴ�");
			}
		}
	}
}
