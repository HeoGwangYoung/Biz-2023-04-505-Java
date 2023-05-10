package com.callor.classes.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.callor.classes.config.Line;
import com.callor.classes.models.StudentDto;

/*
 * StudentServiceImplV1 은 StudentService interface 를 implements 하였고
 * StudentServiceImplV3 는 StudentServiceImplV1 을 extends 하였다
 */
public class StudentServiceImplV3 extends StudentServiceImplV1 {

	public StudentServiceImplV3() {
		stdList = new ArrayList<>();
	}

	@Override
	public void loadStudent() {
		// TODO Auto-generated method stub
		String studentFile = "src/com/callor/classes/datas/student.csv";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(studentFile + "이 없습니다 확인하세요");
			return;
		}

		scan = new Scanner(is);
		while (scan.hasNext()) {
			// 한줄씩 파일에서 읽어 line에 저장
			String line = scan.nextLine();
			StudentDto stDto = str2Dto(line);
			/*
			 * String[] student = line.split(",");
			 * 
			 * StudentDto stDto = new StudentDto(); stDto.stNum =
			 * student[DataIndex.STUDENT.ST_NUM]; stDto.stName =
			 * student[DataIndex.STUDENT.ST_NAME]; stDto.stDept =
			 * student[DataIndex.STUDENT.ST_DEPT]; stDto.stGrade =
			 * Integer.parseInt(student[DataIndex.STUDENT.ST_GRADE]); stDto.stTel =
			 * student[DataIndex.STUDENT.ST_TEL]; stDto.stAddress =
			 * student[DataIndex.STUDENT.ST_ADDRESS];
			 */

			stdList.add(stDto);
		} // end while
		scan.close();
	}

	@Override
	public void printStudent() {
		int rows = 0;
		// 출력
		
		printHeader();
		
		for (StudentDto stdDto : stdList) {
			printStudent(stdDto);
			rows++;
			// 5줄마다 구분선을 출력
			// 다만 구분선 출력 위치가 리스트의 끝보다 작을때만
			if (rows % 5 == 0 && rows < stdList.size()) {
				System.out.println(Line.sLINE(140));
			}
		}
		System.out.println(Line.dLINE(140));
	}

	@Override
	public StudentDto getStudent(String stNum) {
		for (StudentDto stdDto : stdList) {
			if (stNum.equals(stdDto.stNum)) {
				return stdDto;
			}
		}

		return null;
	}

}
