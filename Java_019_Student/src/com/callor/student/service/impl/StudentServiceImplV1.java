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

	static int indexCount = 0;

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
			System.out.println(Line.dLIne(100));
			System.out.println("학생정보 입력 (종료하려면 QUIT 입력)");
			System.out.println(Line.sLIne(100));

			String stNum = "";
			int intNum = 0;

			StudentDto localStDto = null;

			while (true) {
				System.out.print("학번(정수) >> ");
				stNum = scan.nextLine();
				if (stNum.equals("QUIT")) {
					break;
				}
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("학번은 정수로 입력하세요");
					continue;
				}

				localStDto = returnDupDto(intNum);

				break;
			}
			if (stNum.equals("QUIT")) {
				break;
			}

			System.out.printf("이름(%s) >> ", localStDto.stName == null ? "신규" : localStDto.stName);
			String stName = scan.nextLine();
			if (stName.equals("QUIT")) {
				break;
			}

			System.out.printf("학과(%s) >> ", localStDto.stDept == null ? "신규" : localStDto.stDept);
			String stDept = scan.nextLine();
			if (stDept.equals("QUIT")) {
				break;
			}

			int StGrade = 0;
			while (true) {
				System.out.printf("학년(%s) >> ", localStDto.stGrade == 0 ? "신규" : localStDto.stGrade);
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
				if (StGrade < 1 || StGrade > 4) {
					System.out.println("1 ~ 4 의 범위를 벗어났습니다");
					continue;
				}
				break;
			}
			if (StGrade == 0) {
				break;
			}

			System.out.printf("전화번호(%s) >> ", localStDto.stTel == null ? "신규" : localStDto.stTel);
			String stTel = scan.nextLine();
			if (stNum.equals("QUIT")) {
				break;
			}

			StudentDto stDto = new StudentDto();

			stDto.stNum = String.format("%04d", intNum);
			stDto.stName = stName;
			stDto.stDept = stDept;
			stDto.stGrade = StGrade;
			stDto.stTel = stTel;

			if (localStDto.stName != null) {
				stList.set(indexCount, stDto);
			} else {
				stList.add(stDto);
			}

		} // end while
		System.out.println("학생정보 입력 종료");
	}

	@Override
	public void loadStudent() {

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

	protected StudentDto returnDupDto(int intNum) {

		StudentDto stdto = new StudentDto();
		indexCount = 0;

		for (StudentDto studentDto : stList) {
			if (studentDto.stNum.equals(String.format("%04d", intNum))) {
				return studentDto;
			}
			indexCount++;
		}

		return stdto;
	}

	// TODO Auto-generated method stub

}
