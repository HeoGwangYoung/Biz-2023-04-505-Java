package com.callor.controller;

public class ControllerC {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			// i ++; for {} ������ index �� �����ϱ� ������ ������� �ʴ� ���� ����
			if (i % 2 == 0) {
				System.out.print(i + 1 + " ");
			}
		}
		System.out.println();
		for (int i = 0; i < 20; i += 2) {
				System.out.print(i + 1 + " ");
		}
	}
}
