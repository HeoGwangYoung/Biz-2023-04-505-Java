package com.callor.system.service;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServiceV1 {

	StudentDto student;

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public void inputStudent() {
		Scanner scan = new Scanner(System.in);

		System.out.print("학번을 입력해주세요 >> ");
		String num = scan.nextLine();
		student.setStNum(num);

		System.out.print("이름을 입력해주세요 >> ");
		String name = scan.nextLine();
		student.setStName(name);

		System.out.print("학과를 입력해주세요 >> ");
		String dept = scan.nextLine();
		student.setStDept(dept);

		int intGrade = 0;
		while (true) {
			System.out.print("학년을 입력해주세요 >> ");
			String grade = scan.nextLine();
			try {
				intGrade = Integer.valueOf(grade);
			} catch (Exception e) {
				System.out.println("학년은 정수로만 입력하세요");
				continue;
			}
			if (intGrade > 4 || intGrade < 1) {
				System.out.println("학년의 범위는 1 ~ 4 입니다");
				continue;
			}
			break;
		}
		student.setStGrade(intGrade);
		
		System.out.print("전화번호를 입력해주세요 >> ");
		String tel = scan.nextLine();
		student.setStTel(tel);

		scan.close();

		System.out.println("입력하신 정보를 표시합니다");
		System.out.println(student.toString());
	}
}
