package com.callor.classes.exec;

import com.callor.classes.module.ServiceC;

public class ExecL {

	public static void main(String[] args) {
		ServiceC serviceC = new ServiceC();
		int rndnum = (int) (Math.random() * 10);
		if (rndnum >= 2 && rndnum <= 9) {
			// num1 변수에 저장된 값을 전달하면서 구구단을 출력하라는 명령
			serviceC.guguDan(rndnum);
		}
	}
}
