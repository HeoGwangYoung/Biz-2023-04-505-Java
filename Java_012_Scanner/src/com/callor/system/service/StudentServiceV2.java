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
			System.out.print((i+1) + " 번째 학생의 학번을 입력 >> ");
			String num = scan.nextLine();
			stList[i].setStNum(num);
			
			System.out.print((i+1) + " 번째 학생의 이름을 입력 >> ");
			String name = scan.nextLine();
			stList[i].setStName(name);
			
			System.out.print((i+1) + " 번째 학생의 학과을 입력 >> ");
			String dept = scan.nextLine();
			stList[i].setStDept(dept);
			
			int intgrade = 0;
			while (true) {
				System.out.print((i+1) + " 번째 학생의 학년을 입력 >> ");
				String grade = scan.nextLine();
				try {
					intgrade = Integer.valueOf(grade);
				} catch (Exception e) {
					System.out.println("학년은 정수로만 입력");
					continue;
				}
				if (intgrade > 4 || intgrade < 1) {
					System.out.println("학년의 입력값 : 1 ~ 4");
					continue;
				}
				break;
			}
			stList[i].setStGrade(intgrade);
			
			System.out.print((i+1) + " 번째 학생의 전화번호을 입력 >> ");
			String tel = scan.nextLine();
			stList[i].setStTel(tel);
		}
		scan.close();
	}
	public void printStudents() {
		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t학과\t\t학년\t전화번호");
		System.out.println("-".repeat(70));
		for (int i = 0; i < stList.length; i++) {
			System.out.printf("%s\t%s\t%s\t%4d\t%s\n", stList[i].getStNum(), stList[i].getStName(), 
					stList[i].getStDept(), stList[i].getStGrade(), stList[i].getStTel());
		}
		System.out.println("=".repeat(70));
	}
}
