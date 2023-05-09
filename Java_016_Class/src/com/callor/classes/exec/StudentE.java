package com.callor.classes.exec;

import com.callor.classes.service.ScoreService;
import com.callor.classes.service.StudentService;
import com.callor.classes.service.impl.ScoreServiceImplV3;
import com.callor.classes.service.impl.StudentServiceImplV1;

public class StudentE {	
	public static void main(String[] args) {
		ScoreService scService = new ScoreServiceImplV3();
		StudentService stService = new StudentServiceImplV1();
		stService.loadStudent();
		scService.makeScore();
		scService.printScore();
	}
}
