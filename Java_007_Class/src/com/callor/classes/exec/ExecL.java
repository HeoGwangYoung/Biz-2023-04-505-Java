package com.callor.classes.exec;

import com.callor.classes.module.ServiceC;

public class ExecL {

	public static void main(String[] args) {
		ServiceC serviceC = new ServiceC();
		int rndnum = (int) (Math.random() * 10);
		if (rndnum >= 2 && rndnum <= 9) {
			// num1 ������ ����� ���� �����ϸ鼭 �������� ����϶�� ���
			serviceC.guguDan(rndnum);
		}
	}
}
