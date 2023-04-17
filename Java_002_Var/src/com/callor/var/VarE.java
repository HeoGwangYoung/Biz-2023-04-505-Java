package com.callor.var;

public class VarE {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		num1 = 30;
		num2 = 40;
		
		int plus1 = num1 + num2;
		int minus1 = num1 - num2;
		int times1 = num1 * num2;
		int devide1 = num1 / num2;
		
		System.out.println("µ¡¼À: " + plus1);
		System.out.println("»¬¼À: " + minus1);
		System.out.println("°ö¼À: " + times1);
		System.out.println("³ª´°¼À: " + devide1);
		
		System.out.printf("%d + %d = %d\n", num1, num2, plus1);
		System.out.printf("%d - %d = %d\n", num1, num2, minus1);
		System.out.printf("%d * %d = %d\n", num1, num2, times1);
		System.out.printf("%d / %d = %d\n", num1, num2, devide1);
	}
}
