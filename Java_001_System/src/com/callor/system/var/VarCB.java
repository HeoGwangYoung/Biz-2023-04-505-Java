package com.callor.system.var;

public class VarCB {

	public static void main(String[] args) {
		
		int intNum1 = 30;
		float floatNum1 = 25.0f;
		
		// intNum1 ������ ���� 20�� ���Ͽ� �ٸ� ������ �����ϰ��� �Ѵ�
		// �̶� ����� ������ ���� intResult�� �����ϰ� ����� intResult�� �����Ѵ�
		int intResult = 0;
		intResult = intNum1 + 20;
		
		// �� ��� ������ floatNum1 ������ �����Ͽ��µ� ����� ���� ���� �׷��� ����� floatNum1�� ����
		// floatNum1�� ����� ������ �Ǵ��� ���� ����� ����� ������ type�� �޶� �ڵ尡 ����Ǵ� ��������
		// ������ �߻��� ���ִ� ������ ����� ��Ȯ�� ��ġ�� type�� ������ ����� �����ϴ� ���� ����
		floatNum1 = intNum1 + 20;
		
		// intNum1 % 2 �� ����� �������̴�, ���� �߿������ʴ�. ������ �ݵ�� ����� ������ ������ type��
		// ������ �̾�� �Ѵ�
		int intYes1 = intNum1 % 2;
		
		// intNum1 % 2 == 0 ������ ��������� boolean type�̴�. ���� �߿������ʴ�. ������� �����Ϸ���
		// �ݵ�� boolean type�� ������ �����ؾ� �Ѵ�
		boolean bYes = intNum1 % 2 == 0;
		
		// ���� <-> boolean ������ ��ȯ�� �� �� ����
		// intYes1 = intNum1 % 2 == 0; //err => Type mismatch: cannot convert from boolean to int
		// bYes = intNum1 % 2;
	}
}
