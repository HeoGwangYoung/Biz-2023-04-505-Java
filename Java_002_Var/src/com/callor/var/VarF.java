package com.callor.var;

public class VarF {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 43;
		
		// even 짝수, odd 홀수
		// 데이터 type이 true, false로만 나타나는 boolean type
		boolean bEven1 = (num1 % 2 == 0);
		boolean bEven2 = (num2 % 2 == 0);
		
		System.out.println(bEven1);
		System.out.println(bEven2);
	}
}
