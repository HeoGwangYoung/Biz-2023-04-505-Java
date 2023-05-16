package com.callor.student.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;
import com.callor.student.utils.Config;
import com.callor.student.utils.Index;

/*
 * insertStudent, printStudent, loadStudent 모두 상속받는다
 */
public class StudentServiceImplV2 extends StudentServiceImplV1 {

	public void loadStudent() {
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(Config.STUDENT_FILE);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int rows = 0;
		scan = new Scanner(is);

		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] student = line.split(",");

			try {
				StudentDto stDto = new StudentDto();
				stDto.stNum = student[Index.STUDENT.ST_NUM];
				stDto.stName = student[Index.STUDENT.ST_NAME];
				stDto.stDept = student[Index.STUDENT.ST_DEPT];
				stDto.stGrade = Integer.valueOf(student[Index.STUDENT.ST_GRADE]);
				stDto.stTel = student[Index.STUDENT.ST_TEL];
				stList.add(stDto);

			} catch (Exception e) {
				System.out.println(rows + " 라인에서 Exception 발생");
			}
		}
		scan.close();
		System.out.println("Load 한 데이터 개수 : " + stList.size());
	}

	@Override
	public void insertStudent() {

		// V2 에서 상속받은 V1의 insertStudent() 를 먼저 실행해 달라
		super.insertStudent();

		// 나머지는 V2에서 처리
		// 학번을 정수 1로 입력하면 문자열로 변환하여 처리
		System.out.println("여기는 V2");
		this.sortList();
		
		OutputStream os = null;
		PrintWriter out = null;

		try {
			os = new FileOutputStream(Config.STUDENT_FILE);
			out = new PrintWriter(os);

			for (StudentDto stDto : stList) {
				out.print(stDto.stNum + ",");
				out.print(stDto.stName + ",");
				out.print(stDto.stDept + ",");
				out.print(stDto.stGrade + ",");
				out.println(stDto.stTel);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.close();

		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void deleteStudent() {
		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.print("삭제할 학번 >> ");
			String strNum = scan.nextLine();

			try {
				num = Integer.parseInt(strNum);
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다 다시 입력해주세요");
				continue;
			}
			break;
		}

		for (StudentDto studentDto : stList) {
			if (studentDto.stNum.equals(String.format("%04d", num))) {
				System.out.print("해당 학생정보\t");
				System.out.println(studentDto.toString());

				System.out.println("정말 삭제 할까요? (Y/N)");
				String yesOrNo = scan.nextLine();

				if (yesOrNo.equals("Y")) {
					System.out.println("데이터를 삭제합니다");
					stList.remove(studentDto);
					this.deleteAndInsert();
					break;

				} else if (yesOrNo.equals("N")) {
					System.out.println("초기 화면으로 돌아갑니다");
					break;
				} else {
					System.out.println("오류");
				}
			} else {
				System.out.println("해당하는 학번을 찾을 수 없습니다");
				System.out.println("초기 화면으로 돌아갑니다");
			}
		}
	}

	private void deleteAndInsert() {
		OutputStream os = null;
		PrintWriter out = null;

		try {
			os = new FileOutputStream(Config.STUDENT_FILE);
			out = new PrintWriter(os);

			for (StudentDto stDto : stList) {
				out.print(stDto.stNum + ",");
				out.print(stDto.stName + ",");
				out.print(stDto.stDept + ",");
				out.print(stDto.stGrade + ",");
				out.println(stDto.stTel);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		out.close();

		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void sortList() {

		for (int i = 0; i < stList.size(); i++) {
			for (int j = i + 1; j < stList.size(); j++) {

				if (Integer.parseInt(stList.get(i).stNum) > Integer.parseInt(stList.get(j).stNum)) {
					
					StudentDto temp = stList.get(i);
					stList.set(i, stList.get(j));
					stList.set(j, temp);
				}
			}
		}
	}
}