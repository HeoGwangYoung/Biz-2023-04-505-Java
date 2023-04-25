package com.callor.classes.exec;

public class ExecD {

	public static void main(String[] args) {
		int stu1Kor = 80;
		int stu2Kor = 79;
		int stu3Kor = 95;
		int stu4Kor = 73;
		int stu5Kor = 72;

		int total = stu1Kor + stu2Kor + stu3Kor + stu4Kor + stu5Kor;
		float avg = (float) total / 5;
		System.out.println("ÇÕ°è : " + total);
		System.out.println("Æò±Õ : " + avg);
	}
}
