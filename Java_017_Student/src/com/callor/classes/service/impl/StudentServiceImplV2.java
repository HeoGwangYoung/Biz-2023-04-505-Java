package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.classes.config.Line;
import com.callor.classes.datas.DataIndex;
import com.callor.classes.models.StudentDto;

public class StudentServiceImplV2 extends StudentServiceImplV1{

	public StudentServiceImplV2() {
		stdList = new ArrayList<>();
	}

	@Override
	public void loadStudent() {
		// student.csv 파일에서 데이터load => stdList 에저장
		String studentFile = "src/com/callor/classes/datas/student.csv";
		Scanner fileScan = null;
		
		InputStream is = null;
		
		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		fileScan = new Scanner(is);
		
		while(fileScan.hasNext()) {
			String[] student = fileScan.nextLine().split(",");
			
			StudentDto stDto = new StudentDto();
			stDto.stNum = student[DataIndex.STUDENT.ST_NUM];
			stDto.stName = student[DataIndex.STUDENT.ST_NAME];
			stDto.stDept = student[DataIndex.STUDENT.ST_DEPT];
			stDto.stGrade = Integer.parseInt(student[DataIndex.STUDENT.ST_GRADE]);
			stDto.stTel = student[DataIndex.STUDENT.ST_TEL];
			stDto.stAddress = student[DataIndex.STUDENT.ST_ADDRESS];
			
			stdList.add(stDto);
		}
		
		fileScan.close();
	}

	@Override
	public void printStudent() {
		
		int lineCounter = 0;
		// 출력
		System.out.println(Line.dLINE(140));
		System.out.println("학번\t  이름\t\t학과\t\t학년\t전화번호\t주소");
		System.out.println(Line.sLINE(140));
		for (StudentDto stdDto : stdList) {
			System.out.print(stdDto.stNum + "\t");
			System.out.printf("%5s\t", stdDto.stName);
			System.out.print(stdDto.stDept + "\t");
			System.out.printf("%4d\t", stdDto.stGrade);
			System.out.print(stdDto.stTel + "\t");
			System.out.print(stdDto.stAddress + "\n");
			
			lineCounter++;
			
			if(lineCounter  % 5 == 0) {
				System.out.println(Line.sLINE(140));
			}
		}
		System.out.println(Line.dLINE(140));
	}

	@Override
	public StudentDto getStudent(String stNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
