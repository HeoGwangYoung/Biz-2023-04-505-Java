package com.callor.classes;

import java.util.Scanner;

public class ClassB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸�? : >> "); //������Ʈ
		String strName = scan.nextLine();
		System.out.println("�Է��� �̸��� : " + strName);
	}
}
