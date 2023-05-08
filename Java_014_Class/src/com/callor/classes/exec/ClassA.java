package com.callor.classes.exec;

import java.util.Iterator;

public class ClassA {

	public static void main(String[] args) {

		// 정수형 배열 10개 생성
		int[] nums = new int[10];

		// 각 개별요소(nums 0번요소 ~ nums 9번 요소) 에 값 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.println("처음으로 짝수가 저장된 index : " + i + "\t값 : " + nums[i]);
				break;
			}
		}
	}

}
