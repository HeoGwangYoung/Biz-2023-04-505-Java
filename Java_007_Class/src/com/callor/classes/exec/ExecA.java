/*
 * Java�� package
 * Java�� �ҽ��ڵ带 package ������ �����Ѵ� package = folder�� ���� �������� ����ȴ�
 * base-package : com.callor.classes
 * 3����, 3�ܰ� package ������ base-package��� �Ѵ� base-package�� �Ϻ� Application ID(�ĺ���)������ �Ѵ�
 * 
 */
package com.callor.classes.exec;

public class ExecA {
	/*
	 * ���� 1���� ���޹޾Ƽ� �Ű������� num1�� �ް� num1 ������ ���޹��� ���� �Ҽ����� �Ǻ��Ͽ� 
	 * �Ҽ��̸� num1�� return �ϰ� �ƴϸ� 0�� return�ϴ� method����
	 * 
	 * ���� �⺻���� ���¸� ���� method���� method�� ����, method prototype �̶�� �Ѵ�
	 */
	public static int prime(int num1) {
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				return 0;
			}
		}
		return num1;
	}
	public static void main(String[] args) {
		/*
		 * prime() method���� ���� 11�� �����Ͽ� �Ҽ��ΰ��� �Ǻ��ϰ� �� ����� Console�� ����ϱ�
		 */
		int result = prime(11);
		if(result > 0) {
			System.out.println(result + " �� �Ҽ�");
		}
	}
}
