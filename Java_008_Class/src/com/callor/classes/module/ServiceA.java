package com.callor.classes.module;

public class ServiceA {

	public void score(int korSc, int engSc, int mathSc, int hisSc, int musSc, int artSc, int athSc) {
		int total = korSc + engSc + mathSc + hisSc + musSc + artSc + athSc;
		float avg = (float)total / 7;
		
		System.out.println("±¹¾î : " + korSc);
		System.out.println("¿µ¾î : " + engSc);
		System.out.println("¼öÇÐ : " + mathSc);
		System.out.println("¿ª»ç : " + hisSc);
		System.out.println("À½¾Ç : " + musSc);
		System.out.println("¹Ì¼ú : " + artSc);
		System.out.println("Ã¼À° : " + athSc);
		System.out.println("ÃÑÁ¡ : " + total);
		System.out.println("Æò±Õ : " + avg);
	}
}
