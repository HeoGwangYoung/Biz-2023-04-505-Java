package com.callor.classes.exec;

import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.StudentServiceImplV4;

public class StudentExecF {

	public static void main(String[] args) {
		
		StudentService stService = new StudentServiceImplV4(); //인터페이스를 구현한 클래스끼리는 뒤의 객체만 수정해주면됨
		stService.loadStudent();
		stService.printStudent();
		
		System.out.println(stService.getStudent("S0010"));
	}
}
