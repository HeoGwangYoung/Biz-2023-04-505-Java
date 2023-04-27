package com.callor.classes.arrays;

public class ArrayA {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d\t", nums[i]);
		}
		System.out.println();

		// 배열에 저장된 정수값을 오름차 순으로 정렬하기
		
		// 먼저 전체배열을 순회하는 for()를 만들고 현재 index 위치의 값과 index + 1 ~ 끝까지 와 비교한다
		// 비교한 결과에서 큰 값을 오른쪽으로, 작은값을 왼쪽으로 배열 요소의 값을 서로 교환 한다
		// 이 명령을 전체 배열 개수만큼 반복하면 배열에 저장된 값이 오름차순 정렬된다
		
		// nums[0] 과 nums[1] ~ nums[4] 까지 순서대로 비교
		// nums[1] 과 nums[2], nums[3], nums[4] 와 순서대로 비교
		// nums[2] 와 nums[3], nums[4] 와 순서대로 비교
		// nums[3] 와 nums[4]를 비교
		
		// 하여 큰 값은 오른 쪽으로 작은값을 왼쪽으로 계속해서 교환하기
		for (int out = 0; out < nums.length-1; out++) {
			for (int in = out + 1; in < nums.length; in++) {
				if (nums[out] > nums[in]) {
					int _tmp = nums[out];
					nums[out] = nums[in];
					nums[in] = _tmp;
				}		
				
			}
			for (int i = 0; i < nums.length; i++) {
				System.out.printf("%3d\t", nums[i]);
			}
			System.out.println();
		}
	}
}
