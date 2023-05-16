package com.callor.student.exec;

import java.util.Scanner;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;
import com.callor.student.utils.Line;

public class StudentExecG {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StudentService stService = new StudentServiceImplV2();
		stService.loadStudent();

		while (true) {
			printMenu();
			int select = 0;

			try {
				select = Integer.parseInt(scan.nextLine());
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다");
				continue;
			}

			if (select == 1) {
				stService.printStudent();
			} else if (select == 2) {
				stService.insertStudent();
			} else if (select == 3) {
				/*
				 * deleteStudent() method는 Service interface 에 없는 method이다
				 * 따라서 method를 포함하고 있는 class type으로 stService를 객체 형변환을 해주어야만 사용할수 있다
				 */
				((StudentServiceImplV2)stService).deleteStudent();
			} else if (select == 9) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("잘못입력하셨습니다");
				continue;
			}
		}
	}

	public static void printMenu() {
		System.out.println(Line.dLIne(100));
		System.out.println("대한 고교 학사관리 2023");
		System.out.println(Line.dLIne(100));
		System.out.println("실행할 업무를 선택하세요");
		System.out.println(Line.sLIne(100));
		System.out.println("1. 학생 리스트 확인");
		System.out.println("2. 학생정보 추가/수정");
		System.out.println("3. 학생정보 삭제");
		System.out.println("9. 업무종료");
		System.out.println(Line.sLIne(100));
		System.out.print("업무선택 >> ");
	}
}
