package com.callor.classes.exec;

public class ExecI {

	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		int index = -1;
		
		/*
		 * index 초기화를 0으로 실행할 경우 만약 배열에 담긴 값중에서 3의 배수가 하나도 없을 경우
		 * index는 그대로 0이 될 것이고 결과 출력에서 0의 index와 index 0 의 요소의 값이 출력된다
		 * 이러한 논리적인 문제를 해결하기 위해서 index를 -1로 초기화 하고 결과 출력부분에서 index 값을 한번더
		 * 확인할 필요가 있다
		 */
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 3 == 0) {
				index = i;
			}
		}
		/*
		 * index 시작값 : nums.length = 50
		 * index 종료값 : index > 0 조건이 있어서 index 1일 경우에 for() 종료
		 * 49,48,47,46...0 까지 index값을 생성해야 하는데
		 * 여기의 코드는 50,49,48,47...1까지 index 생성되고 있다
		 * 시작하자마자 nums[50] 요소의 값을 읽으려고 시도한다
		 * Index OutofBounds 오류발생
		 */
		//		for (int i = nums.length; i > 0; i--) 잘못된 예
		
//		역주행 반복문 예시
//		for (int i = nums.length - 1; i >= 0; i--) {
//			if(nums[i] % 3 == 0) {
//				System.out.println("마지막 3의 배수 : " + nums[i]);
//				System.out.println("위치 : " + i);
//			}
//		}
		
		// 3의 배수가 하나도 안나온경우를 대비
		if (index >= 0) {
			System.out.println("마지막 위치의 값 : " + nums[index]);
			System.out.println("마지막 위치의 인덱스 : " + index);	
		}
		
	}
}
