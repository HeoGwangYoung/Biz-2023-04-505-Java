package com.callor.system.exec;

public class StringA {

	public static void main(String[] args) {
		// ���ڿ� ����
		/*
		 * �Ϲ����� ����(primitive variable) int, float, long, double, boolean, char primitive
		 * ������ ������ �����ϴ� Ű���尡 ��� �ҹ����̴� �� Ű����� ���� �����͸� �����ϴ� ������ ������
		 *  �����ϴ� �뵵 (����)������
		 * ��(type)�� ���� ��ȯ�ϴ� �뵵�θ� ���ȴ�
		 * 
		 * ���ڿ� ������ primitive type �� �ƴϴ� Ŭ���� type �̴� Class type���� ������ ������ ��������
		 * ���(method)���� ���� �����ϰ� �ִ�
		 */
		String str = "Korea";
		System.out.println(str.substring(3));

		// String class type�� ���� �����ϱ�
		String str2 = "Korea";	//ù��°(�Ϲ�����)���
		String str3 = new String("Korea"); //�ι�°(��ü���)���
		
		System.out.println("STR2 : " + str2);
		System.out.println("STR3 : " + str3);
		
		boolean bYes = str2 == str3;
		System.out.println(bYes);
	}
}
