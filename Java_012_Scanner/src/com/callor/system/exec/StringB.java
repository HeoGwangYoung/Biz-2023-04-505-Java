package com.callor.system.exec;

public class StringB {
	/*
	 * ���ڿ� ������ �����ϴ� ����� ũ�� 2������ �ִ�
	 * �Ϲ����� ��� : String str = "Korea"
	 * Ŭ���� ��ü Ÿ������ �����ϴ� ���
	 * 			String str3 = new String("Korea")
	 * ���ڿ� ������ �����ϴ� ����� ���� ������ ��(==)�� ����� �ٸ��� ��Ÿ����
	 * ���� ���ڿ� ������ ���� ������ �񱳸� �Ҷ� "����" EQ(==)�� ����ϸ� �ȵȴ�
	 */
	public static void main(String[] args) {
		String str1 = "Korea";
		String str2 = "Korea";
		String str3 = new String("Korea");
		String str4 = new String("Korea");
		
		String str5 = "KOREA";
		
		System.out.printf("%s, %s, %s, %s, %s\n", str1, str2, str3, str4, str5);
		
		System.out.println(str1 == str2);
		
		System.out.println(str1 == str3);
		System.out.println(str3 == str4);
		
		System.out.println(str1 == str5);
	}
}
