package com.callor.classes.exec;

import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV2;

public class StudentExecD {

	public static void main(String[] args) {
		StudentService stdService = new StudentServiceImplV2();
		
		stdService.loadStudent();
		stdService.printStudent();
	}
}
