package com.callor.hello.data;

public class VarA {
	
	public static void main(String[] args) {
		/*
		 * ������ ��򰡿� "����(int, �ֳ��ϸ� 150�� �����ϱ�)"�� ������ ���ִ� ������ �Ѱ� �����ϰ�
		 * num1 �̶�� �̸�ǥ(label)�� �ٿ���
		 * ���� num1 �̶�� �θ��� �׸���, ���� num1�� ���� 150�� �����϶�
		 */
		var num1 = 150; // var => java10 �̻� ������ ��밡��
		var num2 = 76;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}
}
