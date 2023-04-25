package com.callor.classes.exec;

import com.callor.classes.module.ServiceA;

public class ExecA {

	public static void main(String[] args) {
		ServiceA serviceA = new ServiceA();
		int rndKor = (int) (Math.random() * 50) + 51;
		int rndEng = (int) (Math.random() * 50) + 51;
		int rndMath = (int) (Math.random() * 50) + 51;
		int rndHis = (int) (Math.random() * 50) + 51;
		int rndMus = (int) (Math.random() * 50) + 51;
		int rndArt = (int) (Math.random() * 50) + 51;
		int rndAth = (int) (Math.random() * 50) + 51;
		
		serviceA.score(rndKor, rndEng, rndMath, rndHis, rndMus, rndArt, rndAth);
	}
}
