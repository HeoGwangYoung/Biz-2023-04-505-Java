package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	private List<StudentDto> stdList;

	public StudentServiceImplV1() {
		// 기본 생성자에서 객체를 초기화(사용할 수 있도록 생성)
		stdList = new ArrayList<>();
	}

	@Override
	public void loadStudent() {
		// STUDENT 문자열 배열 데이터를 forEach(확장 for)를 분해하여 개별 문자열을 str에 담고 for() {}에 전달하기
		for (String str : StdData.STUDENT) {

			// str 문자열 변수에 저장된 문자열을 , 기준으로 다시분해 student 배열에 저장하기
			String[] std = str.split(",");

			// StudentDto class type의 stDto 객체를 생성하고
			// Student 배열의 각요소를 StudentDto type 객체 요소 (변수)에 저장하기
			StudentDto stdDto = new StudentDto();

			stdDto.stNum = std[StdData.ST_NUM];
			stdDto.stName = std[StdData.ST_NAME];
			stdDto.stDept = std[StdData.ST_DEPT];
			stdDto.stGrade = Integer.valueOf(std[StdData.ST_GRADE]);
			stdDto.stTel = std[StdData.ST_TEL];
			stdDto.stAddress = std[StdData.ST_ADDRESS];

			stdList.add(stdDto);
		}
	}

	@Override
	public void printStudent() {
		System.out.println("=".repeat(100));
		System.out.println("학번\t이름\t학과\t\t학년\t전화번호\t주소");
		System.out.println("-".repeat(100));
		for (int i = 0; i < stdList.size(); i++) {
			System.out.printf("%s\t%s\t%s\t%4d\t%s\t%s\n", stdList.get(i).stNum, stdList.get(i).stName,
					stdList.get(i).stDept, stdList.get(i).stGrade, stdList.get(i).stTel, stdList.get(i).stAddress);
		}
//		for (StudentDto stdDto : stdList) {
//			System.out.printf("%s\t", stdDto.stNum);
//		}
		System.out.println("=".repeat(100));
	}

	@Override
	public StudentDto getStudent(String stNum) {
		
		for (StudentDto studentDto : stdList) {
			if (stNum.equals(studentDto.stNum)) {
				return studentDto;
			}
		}
		
		return null;
	}

}
