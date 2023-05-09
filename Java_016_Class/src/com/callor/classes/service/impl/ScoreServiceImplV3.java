package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScData;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.models.StudentDto;
import com.callor.classes.service.ScoreService;
import com.callor.classes.service.StudentService;

/*
 * interface(class)를 implements 한 클래스는 interface에 선언된 모든 method를 의무적으로 구현해야 한다
 * interface에 선언된 method를 한개라도 생략하면 클래스 코드는 문법오류가 발생하고 실행 불가 상태가 된다
 */
public class ScoreServiceImplV3 implements ScoreService{

	List<ScoreDto> scList = new ArrayList<>();

	// ScData.SCORE 배열을 loading 하여 scList 데이터로 변환하기
	@Override
	public void makeScore() {
		for (String str : ScData.SCORE) {
			String[] score = str.split(",");

			ScoreDto scDto = new ScoreDto(score[ScData.ST_NUM], Integer.valueOf(score[ScData.SC_KOR]),
					Integer.valueOf(score[ScData.SC_ENG]), Integer.valueOf(score[ScData.SC_MATH]),
					Integer.valueOf(score[ScData.SC_MUSIC]), Integer.valueOf(score[ScData.SC_ART]),
					Integer.valueOf(score[ScData.SC_SOFTWARE]),
					Integer.valueOf(score[ScData.SC_DATABASE]));

			scList.add(scDto);
		}

	}

	@Override
	public void makeScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		StudentService service = new StudentServiceImplV1();
		service.loadStudent();

		System.out.println("=".repeat(70));
		System.out.println("학번\t이름\t학과\t\t국어\t영어\t수학\t음악\t미술");
		System.out.println("-".repeat(70));
		for (ScoreDto scoreDto : scList) {
			StudentDto stDto = service.getStudent(scoreDto.getStNum());

			System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\n",
					stDto.stNum, stDto.stName, stDto.stDept,
					scoreDto.getScKor(), scoreDto.getScEng(), scoreDto.getScMath(),
					scoreDto.getScMusic(), scoreDto.getScArt());
		}
		System.out.println("=".repeat(70));
	}

	@Override
	public void printScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub

	}

}
