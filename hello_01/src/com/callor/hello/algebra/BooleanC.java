package com.callor.hello.algebra;

public class BooleanC {

	public static void main(String[] args) {
		System.out.println(33 % 2 == 0);
		// 삼항 연산자
		System.out.println(33 % 2 == 0 ? "응" : "아니");
		// ? 왼쪽의 연산 결과가 true이면 첫번째 "응"을 출력하고 false이면 "아니"를 출력
		// 여기에서는 당연히 "아니"가 출력된다
		System.out.println(33 % 2 == 0 ? 33 / 2 : 33 * 2);
		// 연산식은 결과를 알 수 있는 명령문이고 연산식은 다른명령문에 포함가능
		// 연산식의 결과는 메모리에 저장
		System.out.println(33 % 2 == 0 ? "짝수" : "홀수");
	}
}
