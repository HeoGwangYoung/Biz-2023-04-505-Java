package com.callor.controller;

public class ControllerG {

	/*
	 * prime() method �� �ڵ带 �����Ͽ� ������ �������� �Ҽ����� �ƴ��� �Ǻ��ϴ� �ڵ�� ���� void type�� prime()
	 * method�� boolean type�� prime() method�� ����
	 * 
	 * 
	 * method�� �����Ҷ� void type �̿��� type���� �����ϸ� method {} ������ �ݵ�� return ��ɹ��� �־�� �Ѵ�
	 * prime() method {} ������ �����ߴ� rndNum ������ �Ű�����(parameter)�� �����Ͽ���. �Ű������� ������ �ʱ�ȭ�Ҽ�
	 * ���� ������ prime() method�� ȣ�� �ϸ鼭 ���� �������־�߸� �� ������ �ʱ�ȭ �Ҽ� �ִ� prime(int rndNum =
	 * 0)�� ���� �ڵ� ��� �Ұ�
	 * 
	 * main() ���� prime(55) �� ���� �ڵ尡 ���� �ɶ� �Ű����� ���� �ʱ�ȭ �ȴ�
	 * 
	 */
	public static boolean prime(int rndNum) {
//		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;

		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
//				break;
				return false;
			}
		}

//		if (isPrime) {
//			System.err.println(rndNum + "\t�Ҽ�");
//		} else {
//			System.out.println(rndNum + "\t\t�Ҽ� �ƴ�");
//		}
		boolean yesPrime = rndNum <= index;

		return yesPrime;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			// main���� �������� �����
			int mainRndNum = (int) (Math.random() * 50) + 51;

			// prime() method���� "�������ֱ�"
			// prime() method���� mainRndNum ������ ����� ���� "������ �ֱ�"
			// �̶� mainRndNum �� argument ��� �Ѵ�
			if (prime(mainRndNum)) {
				System.err.println(mainRndNum + "�Ҽ�");
			} else {
				System.out.println(mainRndNum + "�Ҽ� �ƴ�");
			}
		}

	}
}
