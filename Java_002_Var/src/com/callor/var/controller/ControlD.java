package com.callor.var.controller;

public class ControlD {

	public static void main(String[] args) {
		int intRnd = (int)(Math.random() * 10);
		if(intRnd % 2 == 0) {
			System.out.println(intRnd + "��(��) ¦�� �Դϴ�");
		}
		if(intRnd % 2 != 0) {
			System.err.println(intRnd + "��(��) ¦���� �ƴմϴ�");
		}
		if(intRnd % 2 == 1) {
			System.out.println(intRnd + "��(��) Ȧ�� �Դϴ�");
		}
		if(intRnd % 2 != 1) {
			System.err.println(intRnd + "��(��) Ȧ���� �ƴմϴ�");
		}
	}
}
