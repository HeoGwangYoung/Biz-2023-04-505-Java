package com.callor.classes.module;

public class ServiceA {

	public void score(int korSc, int engSc, int mathSc, int hisSc, int musSc, int artSc, int athSc) {
		int total = korSc + engSc + mathSc + hisSc + musSc + artSc + athSc;
		float avg = (float)total / 7;
		
		System.out.println("���� : " + korSc);
		System.out.println("���� : " + engSc);
		System.out.println("���� : " + mathSc);
		System.out.println("���� : " + hisSc);
		System.out.println("���� : " + musSc);
		System.out.println("�̼� : " + artSc);
		System.out.println("ü�� : " + athSc);
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
	}
}
