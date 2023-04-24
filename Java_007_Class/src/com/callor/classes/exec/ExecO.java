package com.callor.classes.exec;

import com.callor.classes.module.ServiceF;

public class ExecO {

	public static void main(String[] args) {
		ServiceF serviceF = new ServiceF();
		
		int intKor = (int) (Math.random() * 50) + 51;
		int intEng = (int) (Math.random() * 50) + 51;
		int intMth = (int) (Math.random() * 50) + 51;
		int intHis = (int) (Math.random() * 50) + 51;
		int intMus = (int) (Math.random() * 50) + 51;
		int intArt = (int) (Math.random() * 50) + 51;
		int intP_E = (int) (Math.random() * 50) + 51;
		
		serviceF.score(intKor, intEng, intMth, intHis, intMus, intArt, intP_E);
	}
}
