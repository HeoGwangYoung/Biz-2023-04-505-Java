package com.callor.classes.arrays;

public class ArrayF {

	public static void main(String[] args) {

		int nums[] = new int[10];

		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			boolean isPrime = primeDSRCM(nums[i]);
			if (isPrime) {
				System.out.println(nums[i] + " 는 소수");
			} else {
				System.out.println(nums[i] + " 는 \t\t소수 아님");
			}
		}
	}

	/*
	 * 다수의 데이터를 정보처리할 경우 데이터를 수집하고, 수집이 완료되었을때, 한꺼번에 처리를 한다
	 * 데이터가 발생하는 즉시 처리 : 실시간 처리 ex) 티켓예매
	 * 데이터를 모두 수집하고 수집이 완료되었을때 처리 : 배치(Batch) 처리 ex) 급여계산, 인구통계
	 */
	
	
	/*
	 * prime() method에게 정수값 1개를 전달하고 그 정수값이 소수인지 아닌지 알려줘 라고 요청
	 */
	public static boolean primeDSRCM(int Num) {
		int index;
		boolean isPrime = false;
		for (index = 2; index < Num; index++) {
			if (Num % index == 0) {
				break;
			}
		}
		if (Num <= index) {
			isPrime = true;
		}
		return isPrime;
	}
}
