package com.callor.controller;

public class ControllerB {

	public static void main(String[] args) {
		
		/*
		 * int index = 0
		 * for() �ݺ������� ����� ���� ���� for() �ݺ����� ���۵ɶ� ���ʿ� �ѹ� ����
		 * ����Ƚ���� ������� �ѹ��� ����
		 */
		int sum = 0;
		for(int index = 0; index < 10; index++) {
			System.out.print(index + "\t");
			// ���� ����
			// �� ������ �ٸ� ������ ��ȭ�Ǵ� ���� ��� �����Ͽ� �״� ����
			sum += (index + 1);
		}
		System.out.println();
		System.out.println(sum);
	}
}
