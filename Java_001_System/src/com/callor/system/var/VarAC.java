package com.callor.system.var;

public class VarAC {

	public static void main(String[] args) {
		/*
		 * int num1;
		 * ������ ���� num1 �� ����(����)�� �ض�
		 * ���ุ �� ������ ����(Write, �Ҵ�, ����, ����) �����̴�
		 */
		int num1;	//����� ����
		// System.out.println(num1); err => The local variable num1 may not have been initialized
		num1 = 100;
		num1 = 200;
		num1 = 0;
		
		
		/*
		 * ������ ���� num2�� �����ϰ�, 0���� �ʱ�ȭ �Ͽ���
		 */
		int num2 = 0;
		
		
		// num3 = 100; err => num3 cannot be resolved to a variable
		// ������ ������� �ݵ�� ����(�� �ʱ�ȭ)�� �����ؾ� �Ѵ�.
		int num3 = 0;
		num3 = 100;
		
		// ������ ���
		// 	=> ������ �� �Ҵ�, ����, �����ϱ�, �������� �� �о� ����
		System.out.println(num3);
	}
}
