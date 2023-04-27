package com.callor.classes.exec;

public class StringA {

	public static void main(String[] args) {
		String str = "Republic of Korea";
		System.out.println(str.substring(10));
		// �ֿܼ� ��¸�
		System.out.printf("%d\n", 20);
		// ���� ����
		String view = String.format("%d", 20);
		System.out.println(view);
		
		/*
		 * String.format()
		 * ���ڿ��� format ���� ���ڿ��� ��ȯ�ϴ� method
		 * System.out.printf() �� �����ѵ�
		 * ..printf() �� ����� �ܼ��� Console�� ����ϴ� �뵵
		 * String.format()�� ����� �ٸ� ���ڿ� ������ ���� �� �� �ִ�
		 * 
		 * printf() �� �Ƹ��� void printf() �� ���̰�
		 * format() �� �Ƹ��� String format() �̰� return ���� ���� ���̴�
		 */
		
		int num = 3;
		// num ������ ����� ���� ���ڿ��� ��ȯ �Ͽ� result ���ڿ� ������ �����ϱ�
		String result = String.format("%d", num);
		System.out.println(result);
		
		result = String.format("�� : %d", num);
		System.out.println(result);
		
		// %5d : ��ü 5���� �ڸ����� Ȯ���ϰ� ���ڸ� ������ �����ϴ� ���ڿ� �����ϱ�
		result = String.format("�� : %5d", num);
		System.out.println(result);
		
		result = String.format("%05d", num);
		System.out.println(result);
		
		// printf() ����Ͽ� ���ڿ� format�� �����ϰ� ������ printf()�� �ܼ��� console�� ����ϴ� �ϸ� �Ҽ� �ִ�
		// printf() method�� void return type�̱� �����̴�
		// printf() method�� ����Ͽ� ����� ������ �����ϰ� �������� String.format()�� ����Ѵ�
		
		result = String.format("S%05d", num);
		System.out.println(result);
		
//		result = String.printf("S%05d", num);	// return �� void�� result�� ����Ұ�
	}
}
