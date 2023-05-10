package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.datas.DataSource;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.StudentService;

public class StudentServiceImplV1 implements StudentService {

	protected List<StudentDto> stdList;

	// stdList 객체는 Service 생성자에서 초기화 한다
	public StudentServiceImplV1() {
		// 기본 생성자에서 객체를 초기화(사용할 수 있도록 생성)
		stdList = new ArrayList<>();
	}

	protected StudentDto str2Dto(String str) {
		// STUDENT 문자열 배열 데이터를 forEach(확장 for)를 분해하여 개별 문자열을 str에 담고 for() {}에 전달하기

		// str 문자열 변수에 저장된 문자열을 , 기준으로 다시분해 student 배열에 저장하기
		String[] std = str.split(",");

		// StudentDto class type의 stDto 객체를 생성하고
		// Student 배열의 각요소를 StudentDto type 객체 요소 (변수)에 저장하기
		StudentDto stdDto = new StudentDto();

		stdDto.stNum = std[DataIndex.STUDENT.ST_NUM];
		stdDto.stName = std[DataIndex.STUDENT.ST_NAME];
		stdDto.stDept = std[DataIndex.STUDENT.ST_DEPT];
		stdDto.stGrade = Integer.valueOf(std[DataIndex.STUDENT.ST_GRADE]);
		stdDto.stTel = std[DataIndex.STUDENT.ST_TEL];
		stdDto.stAddress = std[DataIndex.STUDENT.ST_ADDRESS];

		return stdDto;
	}

	@Override
	public void loadStudent() {
		for (String str : DataSource.STUDENT) {
			StudentDto stdDto = str2Dto(str);
			stdList.add(stdDto);
		}
	}


	protected void printStudent(StudentDto stdDto) {
		System.out.printf("%s\t%s\t%s\t%4d\t%s\t%s\n", stdDto.stNum,stdDto.stName,
				stdDto.stDept, stdDto.stGrade, stdDto.stTel, stdDto.stAddress);
	}
	
	protected void printHeader() {
		System.out.println(Line.dLINE(100));
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		System.out.println(Line.sLINE(100));
	}
	
	@Override
	public void printStudent() {
		printHeader();
		for (StudentDto stdDto : stdList) {
			printStudent(stdDto);
		}
		System.out.println(Line.dLINE(100));
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
