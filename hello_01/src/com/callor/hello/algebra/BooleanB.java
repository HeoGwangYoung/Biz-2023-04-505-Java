package com.callor.hello.algebra;

/*
 * �Ҹ� ����(�ο� ����)
 * � ������ ����� true �Ǵ� false �� ��츸 �����ϴ� ����
 * �������� ������ ����� AND(&&), OR(||)���� �����Ͽ� ��������� �Ǵ��Ѵ�.
 * ������� AND, OR �����ڷ� �����Ͽ� ���Ҷ��� �Ǵ��ϴ� �������
 * 2�� ����� ���� �� ��ŭ ���ؾ� �Ѵ�.
 */
public class BooleanB {
	
	public static void main(String[] args) {
		System.out.println(30 > 40 || 40 < 30);
		System.out.println(30 > 40 && 40 < 30);
		System.out.println(40 < 30 || 30 > 40);
		System.out.println(40 > 30 || 30 > 40);
		
		System.out.println(30 > 40 || 40 < 30 || 20 > 10);
		
		System.out.println(30 != 40);
	}
}
