package com.callor.classes;

import java.util.Scanner;

public class ClassD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� >> ");	// prompt
		scan.nextLine();	// ��� ���ڿ� �Է¹ޱ�
		
		System.out.print("���� �Է� >> ");		// prompt
		scan.nextInt();		// ������ �Է¹ޱ�
		
		System.out.print("�Ǽ� �Է� >> ");		// prompt
		scan.nextFloat();	// float �Ǽ��� �Է¹ޱ�
	}
}
