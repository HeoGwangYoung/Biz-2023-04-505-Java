package com.callor.system.var;

public class VarBC {

	public static void main(String[] args) {
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = 30;
		intNum2 = 40;
		// 두 변수에 저장된 값의 크기를 비교하는 연산
		System.out.println(intNum1 > intNum2);	// false
		System.out.println(intNum1 < intNum2);	// true
		System.out.println(intNum1 == intNum2);	// false
		
		System.out.println(intNum1 >= intNum2);	// false
		System.out.println(intNum1 <= intNum2);	// true
		System.out.println(intNum1 != intNum2);	// true
		
		// 각 변수에 저장된 값이 짝수인가?
		System.out.println(intNum1 % 2 == 0);
		System.out.println(intNum2 % 2 == 0);
		
		System.out.println();
		
		// 두 변수에 저장된 값이 모두 짝수인가?
		System.out.println(intNum1 % 2 == 0 && intNum2 % 2 == 0);
		// 두 변수에 저장된 값중에 한개라도 짝수인가?
		System.out.println(intNum1 % 2 == 0 || intNum2 % 2 == 0);
		
		System.out.println();
		
		// 부울대수 연산 - 이 코드를 쓰면 위 코드처럼 and, or연산 사용 안해도 됨
		
		// Y1	Y2	+	*
		// 0	0	0	0
		// 0	1	1	0
		// 1	0	1	0
		// 1	1	2	1
		
		int intYes1 = intNum1 % 2;
		int intYes2 = intNum2 % 2;
		
		System.out.println(intYes1 * intYes2 > 0);
		System.out.println(intYes1 + intYes2 > 0);
	}
}
