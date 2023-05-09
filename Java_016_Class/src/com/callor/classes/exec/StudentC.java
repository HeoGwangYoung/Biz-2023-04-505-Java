package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.StdData;
import com.callor.classes.models.StudentDto;

public class StudentC {

	public static void main(String[] args) {
		
		List<StudentDto> stuList = new ArrayList<>();
		
		for (int i = 0; i < StdData.STUDENT.length; i++) {
			
			String[] student = StdData.STUDENT[i].split(",");
			
			StudentDto studentDto = new StudentDto();
			
			studentDto.stNum = student[StdData.ST_NUM];
			studentDto.stName = student[StdData.ST_NAME];
			studentDto.stDept = student[StdData.ST_DEPT];
			studentDto.stGrade = Integer.valueOf(student[StdData.ST_GRADE]);
			studentDto.stTel = student[StdData.ST_TEL];
			studentDto.stAddress = student[StdData.ST_ADDRESS];
			
			stuList.add(studentDto);
		}
	}
}
