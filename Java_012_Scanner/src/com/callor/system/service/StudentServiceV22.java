package com.callor.system.service;

import java.util.Scanner;

import com.callor.system.models.StudentDto;

public class StudentServiceV22 {

	// �л� ����Ʈ�� ���� �迭 ����
	private StudentDto[] stList;

	public void inputStudents() {
		Scanner scan = new Scanner(System.in);

		// ��Ұ� 5���� �迭�� ����
		// �迭�� ��Ҵ� �ʱ�ȭ�� �ȵȻ���. ����� �Ұ��� ����
		stList = new StudentDto[5];

		int intNum = 0;
		// �л� ����ŭ
		while (true) {
			System.out.println("�л������� �Է��ϼ���");
			while (true) {
				System.out.print("�й� ( 1 ~ 5 ) >> ");
				String stNum = scan.nextLine();
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("�й��� ������ �Է��ϼ���");
					continue;
				}
				if (intNum < 0) {
					// method�� �����϶�
					return;
				}
				if (intNum < 1 || intNum > stList.length + 1) {
					System.out.println("�й��� 1 ~ 5 ���� �Է��ϼ���");
					continue;
				}
				break;
			}
			System.out.print("�̸� >> ");
			String stName = scan.nextLine();

			// studentDto type ��ü ����
			StudentDto student = new StudentDto();
			student.setStName(stName);
			student.setStNum(String.format("0%4d", intNum));
			/*
			 * ���� stList �迭�� ��Ҵ� �ʱ�ȭ�� ���� ���� �����̴� �̶� StudentDto type student ��ü�� �����Ͽ���.
			 * student ��ü�� �Ӽ� ���� setting �� �� student ��ü�� �迭�� ��ҿ� ����
			 * 
			 * stList[intNum - 1] ��Ҹ� �ٽ� �ʱ�ȭ ���� �ʾƵ� student ��ü�� �����ϹǷν� �ڵ����� �ʱ�ȭ�� �ȴ�
			 */
			stList[intNum - 1] = student;

		}
	}

	public void printStudents() {
		for (int i = 0; i < stList.length; i++) {
			System.out.println(stList[i].getStNum() + "\t");
			System.out.println(stList[i].getStName() + "\t");
		}
	}
}
