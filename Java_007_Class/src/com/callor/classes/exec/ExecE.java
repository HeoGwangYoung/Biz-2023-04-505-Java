package com.callor.classes.exec;

import com.callor.classes.module.MyClassA;

public class ExecE {

	public static void main(String[] args) {
		// MyClassA type�� myA ��ü�� �����ϰ�
		// MYClassA() ���� method�� ����Ͽ� myA ��ü�� �ʱ�ȭ
		MyClassA myA = new MyClassA();
		
		/*
		 * MyClassA Ŭ������ ����� add(int, int) method���� static key word�� ����
		 * static key word�� ���� method�� ����ϱ� ���ؼ��� ��ü��� �ϴ� �븮�ڰ� �ʿ��ϴ�
		 * 
		 * ��ü�� Ŭ���� type���� �����ϰ�, ������ method�� ����Ͽ� �ʱ�ȭ�� �����Ѵ�
		 */
		int result = myA.add(30, 40);
		System.out.println(result);
	}
}
