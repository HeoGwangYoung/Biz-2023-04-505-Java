package com.callor.controller.var;

public class VarA {

	public static void main(String[] args) {
		int intKor = 94;
		int intEng = 93;
		int intMath = 96;

		System.out.printf("���� : %3d\n", intKor);
		System.out.printf("���� : %3d\n", intEng);
		System.out.printf("���� : %3d\n", intMath);

		int intTotal = intKor + intEng + intMath;
		
		// �Ҽ������� ��� ������ ã������ ����ȯ
		float floatAvg = (float)intTotal / 3;

		System.out.println("-------------------------");
		System.out.printf("���� : %d,  ��� : %5.2f\n", intTotal, floatAvg);
	}
}
