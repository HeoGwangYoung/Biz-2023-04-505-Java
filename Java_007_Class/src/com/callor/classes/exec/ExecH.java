package com.callor.classes.exec;

import com.callor.classes.module.MyClassC;

public class ExecH {

	/*
	 * 51 ~ 100 ���� ���� ������ �������� �����Ͽ� MyClassC�� prime() method���� �����ϰ� �Ҽ����� �ƴ���
	 * ����� Console�� ���
	 */
	public static void main(String[] args) {
		// MyClassC type�� myC ��ü ���� (����� �ʱ�ȭ)
		// myC�� MyClassC�� �븮�� ������ ������ ���̴�
		MyClassC myC = new MyClassC();
		int rndNum = (int)(Math.random() * 50) + 51;
		// myC �븮�ڸ� ���Ͽ� prime(int) method�� ȣ���ϰ�
		// ����� result ������ �ޱ�
		int result = myC.prime(rndNum);
		
		// result�� ����� ���� 0���� ũ�� �Ҽ�, �ƴϸ� �Ҽ� �ƴ�
		if(result > 0) {
			System.out.println(rndNum + "\t�Ҽ�");
		} else {
			System.out.println(rndNum + "\t�Ҽ� �ƴ�");
		}
	}
}
