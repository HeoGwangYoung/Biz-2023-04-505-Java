package com.callor.controller;

public class ControllerA {

	/*
	 * java.exe ������ ControllerA.class ������ �о �޸𸮿� load�ϰ� ���ϸ��� ȣ���ϴ� method()
	 * ������ �޼���, ������ �޼���
	 */
	
	public static void main(String[] args) {
		
		// return type�� void �̹Ƿ� �ܵ����θ� ȣ���Ͽ� ����� ���� �� �� �ִ�
		prime();
		
		// prime() method�� return type�� void�̱� ������ �ٸ� ��ɹ��� ���Եǰų� ������ ���� ������ �� ����
//		boolean yesPrime = prime();
		
		// ������ �����ϴ� ���� ������ �� ����
//		if(prime()) {	}
		
	} // end main
	
	/*
	 * �Ű������� ����, return type�� void(���ٶ�� ǥ��)�� prime() method ����
	 */
	public static void prime() {
		int rndNum = (int)(Math.random() * 50) + 51;
		int index = 0;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % 2 == 0) {
				break;
			}
		}
		if (index >= rndNum) {
			System.out.println(rndNum + " �Ҽ�");
		} else {
			System.out.println(rndNum + " �Ҽ� �ƴ�");
		}
	}

}
