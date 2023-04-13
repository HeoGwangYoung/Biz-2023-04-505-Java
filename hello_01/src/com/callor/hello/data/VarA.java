package com.callor.hello.data;

public class VarA {
	
	public static void main(String[] args) {
		/*
		 * 기억장소 어딘가에 "정수(int, 왜냐하면 150이 정수니까)"를 저장할 수있는 공간을 한개 예약하고
		 * num1 이라는 이름표(label)을 붙여라
		 * 변수 num1 이라고 부른다 그리고, 변수 num1에 정수 150을 보관하라
		 */
		var num1 = 150; // var => java10 이상 에서만 사용가능
		var num2 = 76;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}
}
