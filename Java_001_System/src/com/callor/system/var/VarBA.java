package com.callor.system.var;

public class VarBA {

	public static void main(String[] args) {
		// ���� ����
		int intNum1 = 0;	//intNum => �밡����ǥ���
		// ������ �Ǽ�
		float floatNum1 = 0.0f;
		// ū ����
		long longNum1 = 0;
		// ������ �Ǽ�
		double douNum1 = 0.0;
		
		// �������� ����ȯ (type cast, convert)
		
		// int�� �����͸� long�� ������ ����
		longNum1 = intNum1; // �ڵ� ����ȯ, �Ͻ��� ����ȯ
		
		// long�� �����͸� int�� ������ ����
		intNum1 = (int)longNum1; // ���� ����ȯ, ����� ����ȯ
		
		floatNum1 = (float)douNum1; // ���� ����ȯ
		douNum1 = floatNum1; // �ڵ� ����ȯ
	}
}
