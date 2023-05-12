package guide.exec;

import java.util.ArrayList;
import java.util.List;

public class RndPrime {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			numList.add(rndNum);
		}
		findPrimeNum(numList);
	}

	public static void findPrimeNum(List<Integer> numList) {

		int sum = 0;
		int count = 0;
		boolean isPrime = true;
		
		for (int num : numList) {
			for (int i = 2; i < num; i++) {
				isPrime = true;
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				sum += num;
				count++;
			}
		}
		System.out.println("소수 개수 : " + count);
		System.out.println("소수의 합 : " + sum);
	}
}
