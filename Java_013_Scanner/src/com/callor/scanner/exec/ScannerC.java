package com.callor.scanner.exec;

import com.callor.scanner.service.PrimeServiceV1;

public class ScannerC {

	public static void main(String[] args) {
		PrimeServiceV1 service = new PrimeServiceV1();
		
		while (true) {
			int num = service.getNum();
			if (num < 0) {
				System.out.println("GAME OVER");
				return;
			}
			
			int result = service.primeYesNo(num);
			
			if (result > 0) {
				System.out.println(num + "은 소수");
			} else {
				System.out.println(num + "은 소수 아님");
			}
		}
	}
}
