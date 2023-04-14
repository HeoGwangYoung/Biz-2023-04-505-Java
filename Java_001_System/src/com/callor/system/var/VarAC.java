package com.callor.system.var;

public class VarAC {

	public static void main(String[] args) {
		/*
		 * int num1;
		 * 정수형 변수 num1 을 선언(예약)만 해라
		 * 예약만 한 변수는 쓰기(Write, 할당, 저장, 대입) 전용이다
		 */
		int num1;	//명시적 선언
		// System.out.println(num1); err => The local variable num1 may not have been initialized
		num1 = 100;
		num1 = 200;
		num1 = 0;
		
		
		/*
		 * 정수형 변수 num2를 선언하고, 0으로 초기화 하여라
		 */
		int num2 = 0;
		
		
		// num3 = 100; err => num3 cannot be resolved to a variable
		// 변수는 사용전에 반드시 선언(과 초기화)를 수행해야 한다.
		int num3 = 0;
		num3 = 100;
		
		// 변수의 사용
		// 	=> 변수에 값 할당, 저장, 대입하기, 변수에서 값 읽어 오기
		System.out.println(num3);
	}
}
