package com.callor.system.var;

public class VarAD {

	public static void main(String[] args) {
		
		// ������(int type) ���� num1, num2, num3�� �����ϰ� ���� 0���� �ʱ�ȭ �Ͽ���
		 
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		
		// ����� ���� num1, num2, num3�� ���� ���� 30, 20, 15�� ���� �Ͽ���.
		 
		num1 = 30;
		System.out.println(num2); // 0 ���
		num2 = 20;
		num3 = 15;
		
	   
	    // num3 ������ ����� ���� �о Console�� ���� 3�� ����ϱ�
		// �� ���� �����ص� ������ ����� ���� ������ ����.
		// ������ �ѹ� ����(����)�� ���� �ڵ尡 �۵��Ǵ� ���� ���� ��� �����ȴ�
		
		
		System.out.println(num3);
		System.out.println(num3);
		System.out.println(num3);
		
		System.out.println();
		
		// num1, num2, num3 ������ ������ ���� �����ϴ� �ڵ� ������ �ָ��ϴ�
		// �� �ڵ尡 ����� �� num1, num2, num3 ���� ��� ��������
		num1 = num3;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println();
		// �� ���� ���� �߿� num3�� ���� 200���� �����ߴ�
		// ���� num3��(��) ���� 200�� �����ߴ�
		// �� �ڵ尡 ����Ǿ����� num1, num2 ������ ���� ������ ����
		num3 = 200;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// ���⿡�� �ڵ� �۵��� ������
	}
}
