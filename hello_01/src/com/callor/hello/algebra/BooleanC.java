package com.callor.hello.algebra;

public class BooleanC {

	public static void main(String[] args) {
		System.out.println(33 % 2 == 0);
		// ���� ������
		System.out.println(33 % 2 == 0 ? "��" : "�ƴ�");
		// ? ������ ���� ����� true�̸� ù��° "��"�� ����ϰ� false�̸� "�ƴ�"�� ���
		// ���⿡���� �翬�� "�ƴ�"�� ��µȴ�
		System.out.println(33 % 2 == 0 ? 33 / 2 : 33 * 2);
		// ������� ����� �� �� �ִ� ��ɹ��̰� ������� �ٸ���ɹ��� ���԰���
		// ������� ����� �޸𸮿� ����
		System.out.println(33 % 2 == 0 ? "¦��" : "Ȧ��");
	}
}
