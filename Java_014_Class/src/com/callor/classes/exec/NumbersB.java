package com.callor.classes.exec;

public class NumbersB {

	public static void main(String[] args) {
		
		String strNum1 = "30";
		String strNum2 = "40";
		
		System.out.println(strNum1 + strNum2);
		
		// ���ڿ��� ���ڸ� 4Ģ������ ������ ������ ���ڷ� ��ȯ
		int intNum1 = Integer.parseInt(strNum1);
		Integer intNum2 = Integer.valueOf(strNum2);
		int intNum3 = Integer.valueOf(strNum1);
		
		/*
		 * ���ڿ��� ���ڸ� 4Ģ������ �Ǵ� ���� �����ͷ� ��ȯ��Ű�� ������� 2���� method�� �ִ�
		 * Interger.parseInt(), Float.parseFloat()
		 * 		���ڿ��� ���ڸ� primitive type�� ���ڷ� ��ȯ�Ѵ�
		 * Integer.valueOf(), Float,valueOf()
		 *  	���ڿ��� ���ڸ� ���������ڷ� ��ȯ�Ѵ�
		 *  	���� ������ type�� primitive �ΰ��
		 *  	�� method�� �����͸� Unboxing �ϴ� ������ �߰��ȴ�
		 *  	�Ϻο����� ���ɻ� Issue �� �ִٰ� ������ ������ ũ�� ���������ʴ´�
		 *  
		 *  ���ڿ��� ���ڸ� ���� ���ڷ� �ٲܶ��� Type.valueOf() method�� ����ص� ū ������ ����
		 */
		float floatNum1 = Float.parseFloat("30.0");
		Float floatNum2 = Float.valueOf("30.0");
		
		System.out.println(intNum1 + intNum2);
	}
}
