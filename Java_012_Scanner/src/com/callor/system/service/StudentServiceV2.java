package com.callor.system.service;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServiceV2 {

	StudentDto[] stList = new StudentDto[5];
	
	public void initStList () {
		for (int i = 0; i < stList.length; i++) {
			stList[i] = new StudentDto();
		}
	}
	
	public void inputStudents() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < stList.length; i++) {
			System.out.print((i+1) + " ��° �л��� �й��� �Է� >> ");
			String num = scan.nextLine();
			stList[i].setStNum(num);
			
			System.out.print((i+1) + " ��° �л��� �̸��� �Է� >> ");
			String name = scan.nextLine();
			stList[i].setStName(name);
			
			System.out.print((i+1) + " ��° �л��� �а��� �Է� >> ");
			String dept = scan.nextLine();
			stList[i].setStDept(dept);
			
			int intgrade = 0;
			while (true) {
				System.out.print((i+1) + " ��° �л��� �г��� �Է� >> ");
				String grade = scan.nextLine();
				try {
					intgrade = Integer.valueOf(grade);
				} catch (Exception e) {
					System.out.println("�г��� �����θ� �Է�");
					continue;
				}
				if (intgrade > 4 || intgrade < 1) {
					System.out.println("�г��� �Է°� : 1 ~ 4");
					continue;
				}
				break;
			}
			stList[i].setStGrade(intgrade);
			
			System.out.print((i+1) + " ��° �л��� ��ȭ��ȣ�� �Է� >> ");
			String tel = scan.nextLine();
			stList[i].setStTel(tel);
		}
		scan.close();
	}
	public void printStudents() {
		System.out.println("=".repeat(70));
		System.out.println("�й�\t�̸�\t�а�\t\t�г�\t��ȭ��ȣ");
		System.out.println("-".repeat(70));
		for (int i = 0; i < stList.length; i++) {
			System.out.printf("%s\t%s\t%s\t%4d\t%s\n", stList[i].getStNum(), stList[i].getStName(), 
					stList[i].getStDept(), stList[i].getStGrade(), stList[i].getStTel());
		}
		System.out.println("=".repeat(70));
	}
}
