package com.callor.controller.var;

public class VarC {

	public static void main(String[] args) {
		String str = "ABC";	//str 변수에는 A가 담긴 공간의 주소를 담음 - 클래스 변수의 특징
		System.out.println(str);
		str = "Korea";
		str = "대한민국";
		str = "우리나라";
		// 3개의 문자열을 연결하여 str 변수에 저장
		str = "Republic" + "Of" + "Korea";
		System.out.println(str);
	}
}
