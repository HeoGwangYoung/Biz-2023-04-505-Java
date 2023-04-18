package com.callor.controller.var;

public class VarA {

	public static void main(String[] args) {
		int intKor = 94;
		int intEng = 93;
		int intMath = 96;

		System.out.printf("국어 : %3d\n", intKor);
		System.out.printf("영어 : %3d\n", intEng);
		System.out.printf("수학 : %3d\n", intMath);

		int intTotal = intKor + intEng + intMath;
		
		// 소수점이하 평균 오차를 찾기위해 형변환
		float floatAvg = (float)intTotal / 3;

		System.out.println("-------------------------");
		System.out.printf("총점 : %d,  평균 : %5.2f\n", intTotal, floatAvg);
	}
}
