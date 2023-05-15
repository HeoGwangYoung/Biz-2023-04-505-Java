package com.callor.student.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.student.utils.Line;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentDto> stList;
	protected Scanner scan;

	public StudentServiceImplV1() {
		stList = new ArrayList<>();
		scan = new Scanner(System.in);
	}

	/*
	 * insertStudent() 는 StudentService interface에 정의 되지않은 method
	 * 
	 * 이 method는 상속받은 것이 아니고 V1 클래스에서 임의로 생성한 method이다
	 */
	public void insertStudent() {
		while (true) {
			System.out.println(Line.dLIne(60));
			System.out.println("학생정보 추가 (종료하려면 QUIT 입력)");
			System.out.println(Line.sLIne(60));

			System.out.print("학번 >> ");
			String stNum = scan.nextLine();
			if (stNum.equals("QUIT")) {
				break;
			}

			System.out.print("이름 >> ");
			String stName = scan.nextLine();
			if (stName.equals("QUIT")) {
				break;
			}

			System.out.print("학과 >> ");
			String stDept = scan.nextLine();
			if (stDept.equals("QUIT")) {
				break;
			}

			int StGrade = 0;
			while (true) {
				System.out.print("학년 >> ");
				String StrStGrade = scan.nextLine();
				if (StrStGrade.equals("QUIT")) {
					break;
				}
				
				try {
					StGrade = Integer.valueOf(StrStGrade);
				} catch (Exception e) {
					System.out.println("잘못된 입력입니다 1 ~ 4 의 정수를 입력해 주세요");
					continue;
				}
				if(StGrade < 1 || StGrade > 4) {
					System.out.println("1 ~ 4 의 범위를 벗어났습니다");
					continue;
				}
				break;
			}
			if(StGrade == 0) {
				break;
			}
			
			System.out.print("전화번호 >> ");
			String stTel = scan.nextLine();
			if (stNum.equals("QUIT")) {
				break;
			}

			StudentDto stDto = new StudentDto();
			stDto.stNum = stNum;
			stDto.stName = stName;
			stDto.stDept = stDept;
			stDto.stGrade = StGrade;
			stDto.stTel = stTel;

			stList.add(stDto);
		} // end while
		System.out.println("학생정보 입력 종료");
	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printStudent() {

		System.out.println(Line.dLIne(100));
		System.out.println("대한 고교 학생 리스트");
		System.out.println(Line.dLIne(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호");
		System.out.println(Line.sLIne(100));
		if (stList == null || stList.size() < 1) {
			System.out.println("표시할 데이터가 없음");
			return;
		}
		for (StudentDto dto : stList) {
			System.out.printf("%s\t", dto.stNum);
			System.out.printf("%s\t", dto.stName);
			System.out.printf("%s\t", dto.stDept);
			System.out.printf("%d\t", dto.stGrade);
			System.out.printf("%s\n", dto.stTel);
		}
		System.out.println(Line.dLIne(100));
	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDto> getStudentList() {
		// TODO Auto-generated method stub
		return null;
	}

}
