package com.callor.controller;

public class ControllerE {

	public static void main(String[] args) {

		/*
		 * 51~100���� ������ 1���� ����� �� ���� �Ҽ�(Prime)���� �ƴ��� ã��
		 * prime : 1�� �ڽ� �̿��� ����� ���� �ʴ� ��
		 * 2 ~ (�ڽ� -1) ������ ������ ���� �������� �� �������� �ѹ��� 0�� �ƴ� ��
		 * 
		 * �������� �ѹ��̶� 0�� �Ǹ� prime�� �ƴϴ�
		 */
		int intRnd = (int) (Math.random() * 50) + 51;
//		boolean isPrimeNumber = true;
				
		// �� for() ��ɿ� ���� index ���� 2���� rndNum -1 ���� ���ӵ� ������ ������� for() {}���� ��� �����ϴ�
		for (int i = 2; i < intRnd / 2 + 1; i++) {
			if(intRnd % i == 0) {
//				isPrimeNumber = false;
				System.out.print(intRnd + " ");
				System.out.print(i + "�� ������ �������� ");
				System.out.print(intRnd % i);
				System.out.println(" �� ���� �Ҽ��� �ƴ�");
				// �ݺ����� �����ϸ� ������ �����ϴ� �������� �Ҽ��� �ƴ��� �Ǻ��ϸ� ���̻� �ݺ�����
				// ������ �ʿ䰡 �����Ƿ� ���� �ߴ�
				// break : for() �ݺ����� �ߴ��Ҷ�
				break;
			}
		}

//		if (isPrimeNumber) {
//			System.out.println(intRnd + "��(��) �Ҽ� �Դϴ�");
//		} else {
//			System.out.println(intRnd + "��(��) �Ҽ��� �ƴմϴ�");
//		}
	}

}
