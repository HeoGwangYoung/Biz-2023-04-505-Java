package com.callor.classes.exec;

import com.callor.classes.module.ServiceE;

public class ExecN {

	public static void main(String[] args) {
		ServiceE serviceE = new ServiceE();
		int intKor = (int) (Math.random() * 50) + 51;
		int intEng = (int) (Math.random() * 50) + 51;
		int intMath = (int) (Math.random() * 50) + 51;

		serviceE.score(intKor, intEng, intMath);
	}
}
