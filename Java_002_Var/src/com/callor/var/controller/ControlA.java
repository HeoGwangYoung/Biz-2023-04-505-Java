package com.callor.var.controller;

public class ControlA {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 43;
		
		boolean bEven1 = num1 % 2 == 0;
		boolean bEven2 = num2 % 2 == 0;
		
		/*
		 * if(���� �����) {  }
		 * ���� "���� �����"�� ����� true�̸�, { } block ������ �ڵ带 �����϶�
		 * 
		 * if(boolean type ����) { } ���� "boolean type ����" ���� true�̸� { } block ������ �ڵ带 �����϶�
		 */
		
		// bEven1 ������ ���� true �̸�?
		if(bEven1) {
			System.out.println(num1 + " �� ¦���Դϴ�");
		}
		
		// bEven2 ������ ���� true �̸�?
		if(bEven2) {
			System.out.println(num2 + " �� ¦���Դϴ�");
		}
		
		// bEven2 ���� true�� �ƴϸ�?
		if(!bEven2) {
			System.out.println(num2 + " �� ¦���� �ƴմϴ�");
		}
		/*
		 * Control key word
		 * � ���ǿ� ���� ��� �ڵ� ���� ������ �����ϴ� ��ɹ�
		 * if() ��ɹ��� ()�� ������ true, false�� �� ���� �ڵ��� ��������� �����Ѵ�
		 * 
		 * if() ��ɹ�����
		 * () ������ true �϶��� ~~�Ѵ� ��� �д´�
		 * () ������ !true �϶��� ~~�� �ƴϴ� ��� �д´�
		 * () ������ false �϶��� ~~�� �ƴϴ� ��� �д´�
		 */
	}
}
