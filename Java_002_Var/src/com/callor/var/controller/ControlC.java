package com.callor.var.controller;

public class ControlC {

	public static void main(String[] args) {
		// 0 ~ 9���� �߿��� ������ ���� 1�� ����
		int intRnd = (int)(Math.random() * 10);
		boolean bEven = intRnd % 2 == 0;
		
		if(bEven) {
			System.out.println(intRnd + " ��(��) ¦���Դϴ�");
		}
		if(!bEven) {
			System.err.println(intRnd + " ��(��) ¦���� �ƴմϴ�");
		}
	}
}
