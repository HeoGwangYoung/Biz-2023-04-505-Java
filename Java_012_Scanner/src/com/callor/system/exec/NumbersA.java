package com.callor.system.exec;

public class NumbersA {

	public static void main(String[] args) {
		// ���ڿ��� ����
		// ����(����)���길 ����, ��Ÿ 4Ģ���� �Ұ�
		// ���ڷ� �������� ���� �����ʹ� ���ڿ�
		String strNum1 = "30";
		String strNum2 = "30.0";
		String strNum3 = "30 + 40";
		
		// ���ڿ��� ���ڸ� 4Ģ������ ������ ���ڷ� ��ȯ�ϱ�
		int num1 = Integer.valueOf(strNum1);
		float num2 = Float.valueOf(strNum2);
		
		/*
		 * ���ڿ��� ���ڸ� ���� 4Ģ������ ������ ���ڷ� ��ȯ�ϱ� ���ؼ��� ������ ���ڿ� �ܿ� ��� ���ڿ��� ������ �� ����
		 */
		
		System.out.println(Integer.valueOf("30"));
//		System.out.println(Integer.valueOf(" 30"));
//		System.out.println(Integer.valueOf("30 "));
//		System.out.println(Integer.valueOf("A30"));
//		System.out.println(Integer.valueOf("30A"));
		
		
//		int num3 = Integer.valueOf(strNum3);
		
		System.out.println(num1 + num2);
//		System.out.println(num2 + num3);
	}
}
