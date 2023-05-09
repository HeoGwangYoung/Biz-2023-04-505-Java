package com.callor.classes.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScData;
import com.callor.classes.models.ScoreDto;
import com.callor.classes.service.ScoreService;
/*
 * interface(class)를 implements 한 클래스는 interface에 선언된 모든 method를 의무적으로 구현해야 한다
 * interface에 선언된 method를 한개라도 생략하면 클래스 코드는 문법오류가 발생하고 실행 불가 상태가 된다
 */
public class ScoreServiceImplV3 implements ScoreService{

	List<ScoreDto> scList = new ArrayList<>();
	StudentServiceImplV1 stdserviceV1 = new StudentServiceImplV1();
	
	// ScData.SCORE 배열을 loading 하여 scList 데이터로 변환하기
	@Override
	public void makeScore() {
		for (String str : ScData.SCORE) {
			String[] score = str.split(str);
			
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
		ScoreDto scDto;
		for (int i = 0; i < scList.size(); i++) {
			scDto = scList.get(i);
			scDto.getStNum()
		}
		
	}

	@Override
	public void printScore(List<ScoreDto> scList) {
		// TODO Auto-generated method stub
		
	}
	
}
