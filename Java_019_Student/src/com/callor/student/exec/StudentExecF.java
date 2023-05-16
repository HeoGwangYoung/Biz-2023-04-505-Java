package com.callor.student.exec;

import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StudentServiceImplV2;

public class StudentExecF {

	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImplV2();

		studentService.loadStudent();
		studentService.printStudent();
		studentService.insertStudent();
	}
}
