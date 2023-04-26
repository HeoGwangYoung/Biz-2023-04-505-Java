package com.callor.classes.exec;

public class ExecJ {

	// 매개변수 num 변수로 전달받은 값이 prime 이면 num을 아니면 0을 return 하는 method 선언
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[50];
		boolean checkFirst = true;
		int lastIndex = -1;
		int firstIndex = -1;
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		for (int i = 0; i < nums.length; i++) {
						
			if(prime(nums[i]) > 0 && checkFirst) {
				firstIndex = i;
				checkFirst = false;
			}
			
			if(prime(nums[i]) > 0) {
				lastIndex = i;
			}
		}
		// 방법2) for 2번사용 1번째 firstIndex찾고 2번째 for문에서 firstIndex 부터 반복문 시작
		if (firstIndex > -1) {
			System.out.println("첫번째 인덱스 : " + firstIndex + " 값 : " + nums[firstIndex]);
			System.out.println("마지막 인덱스 : " + lastIndex + " 값 : " + nums[lastIndex]);
		}
	}
}