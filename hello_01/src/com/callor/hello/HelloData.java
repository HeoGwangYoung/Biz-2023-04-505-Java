package com.callor.hello;

public class HelloData {

	public static void main(String[] args) {
		System.out.println("Hello Korea");
		System.out.println("Hello" + "Korea");
		System.out.println("Hello       Korea");
		System.out.println("Hello"    +       "Korea");
		
		System.out.println(30 + 40);
		System.out.println("30" + "40");
		System.out.println("30 + 40");
		
		// 30 + 40 = 70
		System.out.println("30 + 40 = 70");
		System.out.println("30 + 40 = " + 30 + 40);
		
		// "30 + 40" + 30 �� �����Ϸ��� �õ�
		// �� ������ ���ڿ� + ������ �����̴�
		// �̷����� ���� �������� 30�� ���ڿ� 30���� �ٲ������
		System.out.println("30 + 40 = " + "30" + 40);
		System.out.println("30 + 40 = 30" + 40);
		System.out.println("30 + 40 = " + "30" + "40");
		System.out.println("30 + 40 = " + (30 + 40));
		System.out.println(30 + 40 + " = 30 + 40");
		System.out.println("30 x 40 = " + 30 * 40);
		// ���ڿ��� +(���Ῥ����)�� �����ϴ�
		// System.out.println("30 - 40 = " + 30 - 40);
		// System.out.println("30" - "40");
		// System.out.println("30" * "40");
		// System.out.println("30" / "40");
		
		System.out.println("30" + "40");
	}
}
