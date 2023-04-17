package com.callor.var.controller;

public class ControlE {

	public static void main(String[] args) {
		int intRnd = (int) (Math.random() * 10) + 1;

		if (intRnd % 3 == 0) {
			System.out.println(intRnd + "는(은) 3의 배수입니다");
		}
		// intRnd 값이 3의 배수인 경우도 한번 아닌가를 확인하여 다소 비효율적인 코드 진행이 된다
		if (intRnd % 3 != 0) {
			System.err.println(intRnd + "는(은) 3의 배수가 아닙니다");
		}
		
		// 내가 원하는 목적 : 3의 배수 찾기
		if (intRnd % 3 == 0) {
			System.out.println(intRnd + "는(은) 3의 배수입니다");
		// 내가 원하는 목적을 달성하지 못했을 경우
		} else {
			System.out.println(intRnd + "는(은) 3의 배수가 아닙니다");
		}
	}
}
