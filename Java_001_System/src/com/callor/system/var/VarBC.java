package com.callor.system.var;

public class VarBC {

	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = 30;
		intNum2 = 40;
		// �� ������ ����� ���� ũ�⸦ ���ϴ� ����
		System.out.println(intNum1 > intNum2);	// false
		System.out.println(intNum1 < intNum2);	// true
		System.out.println(intNum1 == intNum2);	// false
		
		System.out.println(intNum1 >= intNum2);	// false
		System.out.println(intNum1 <= intNum2);	// true
		System.out.println(intNum1 != intNum2);	// true
		
		// �� ������ ����� ���� ¦���ΰ�?
		System.out.println(intNum1 % 2 == 0);
		System.out.println(intNum2 % 2 == 0);
		
		System.out.println();
		
		// �� ������ ����� ���� ��� ¦���ΰ�?
		System.out.println(intNum1 % 2 == 0 && intNum2 % 2 == 0);
		// �� ������ ����� ���߿� �Ѱ��� ¦���ΰ�?
		System.out.println(intNum1 % 2 == 0 || intNum2 % 2 == 0);
		
		System.out.println();
		
		// �ο��� ���� - �� �ڵ带 ���� �� �ڵ�ó�� and, or���� ��� ���ص� ��
		
		// Y1	Y2	+	*
		// 0	0	0	0
		// 0	1	1	0
		// 1	0	1	0
		// 1	1	2	1
		
		int intYes1 = intNum1 % 2;
		int intYes2 = intNum2 % 2;
		
		System.out.println(intYes1 * intYes2 > 0);
		System.out.println(intYes1 + intYes2 > 0);
	}
}
