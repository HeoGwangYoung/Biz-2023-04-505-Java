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

		System.out.print("�й��� �Է����ּ��� >> ");
		String num = scan.nextLine();
		student.setStNum(num);

		System.out.print("�̸��� �Է����ּ��� >> ");
		String name = scan.nextLine();
		student.setStName(name);

		System.out.print("�а��� �Է����ּ��� >> ");
		String dept = scan.nextLine();
		student.setStDept(dept);

		int intGrade = 0;
		while (true) {
			System.out.print("�г��� �Է����ּ��� >> ");
			String grade = scan.nextLine();
			try {
				intGrade = Integer.valueOf(grade);
			} catch (Exception e) {
				System.out.println("�г��� �����θ� �Է��ϼ���");
				continue;
			}
			if (intGrade > 4 || intGrade < 1) {
				System.out.println("�г��� ������ 1 ~ 4 �Դϴ�");
				continue;
			}
			break;
		}
		student.setStGrade(intGrade);
		
		System.out.print("��ȭ��ȣ�� �Է����ּ��� >> ");
		String tel = scan.nextLine();
		student.setStTel(tel);

		scan.close();

		System.out.println("�Է��Ͻ� ������ ǥ���մϴ�");
		System.out.println(student.toString());
	}
}
