package com.callor.controller;

public class ControllerC {

	public static void main(String[] args) {
		int rndNum = (int) (Math.random() * 50) + 51;
		
		int index;
		for (index = 2; index < rndNum; index++) {
			if(rndNum % index == 0) {
//				System.out.println(rndNum + " �� �Ҽ��ƴ�");
				break;
			}
		}
		System.out.printf("rnd %d , index %d\n",rndNum ,index);
		
		/*
		 * for() �ݺ������� �ִ밪�� index�� ����
		 *  �ִ밪ǥ�� index < �ִ밪 �Ǵ� index <= �ִ밪���� ǥ���� �Ѵ�
		 *  for() �ݺ����� ��� �ݺ��� ���ΰ��� �������� ������̴�
		 * 
		 * for() �ݺ����� �߰��� break�� ������ �ݺ��� ������ �ߴ��� �� �ִ�
		 *  �Ǵ� �׷��� �ʰ� ���� ���Ǵ�� �ݺ����� ���� �Ϸ� �� �� �ִ�.
		 *  
		 * for() �ݺ����� ����Ϸ�Ǹ� rndNum <= index ������ true�� �ȴ�
		 *  �� ������ �˻��Ϸ��� index ������ for() ������ �����Ѵ�
		 */
		
		// > �� �ݴ� <=
		if(rndNum <= index) {
			System.out.println(rndNum + " �� �Ҽ�");
		} else {
			System.out.println(rndNum + " �� �Ҽ� �ƴ�");
		}
	}
}
