package com.callor.classes;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		// Scanner Ŭ����(����)�� ����Ͽ� ���� �����ϱ����� �غ�
		// Scanner Ŭ������ ����Ͽ� scan ��ü �����ϱ�
		/*
		 * �������� ����� ������ ���߿� Ű����� �Է��� ������(����, ���� ��)�� 
		 * ��ǻ���� �����ҿ� �������ִ� ����� �����ϴ� ���� Ŭ����(����)
		 * 
		 * Scanner Ŭ������ ȥ�ڴ� Ű���忡�� �����͸� �����ü� ����
		 * Ű���尡 ���� ���� �˾�ä��, Scanner���� �����Ͽ� �����͸� ���� �� �ֵ��� ���ִ� ���� ������ �ִµ�
		 * �� ������ System.in �̴�
		 * 
		 * Scanner Ŭ������ �ݵ�� ������ method�� System.in ������ ������ �־�� �Ѵ�
		 */
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine(); // �ڵ� blocking
		
		System.out.println("Ű����� �Է��� ���ڿ� : " + str);
	}
}
