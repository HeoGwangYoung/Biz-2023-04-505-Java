package com.callor.classes.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.ScoreDto;

public class ScoreServiceV2 {
	
	private List<ScoreDto> scList;
	
	
	public void makeScoreList(List<ScoreDto> scList, int listSize) {

		
		for (int i = 0; i < listSize; i++) {
			// 학번과 점수를 scoreDto 객체변수를 만들어 저장
			ScoreDto score = new ScoreDto();
			score.setStNum(String.format("%04d", i + 1));
			score.setScKor((int) (Math.random() * 50) + 51);
			score.setScEng((int) (Math.random() * 50) + 51);
			score.setScMath((int) (Math.random() * 50) + 51);
			// 리스트에 추가
			scList.add(score);
		}
	}

	// scoreList 변수를 ScoreServiceV2 클래스의 다른 method에서 사용하기 위하여
	// 클래스 영역으로 scope를 이동한다 클래스영역으로 scope가 이동된 객체변수는 선언만 수행한다
	// 선언만 수행된 객체변수는 사용하려고 하면 NullpointerException이 발생할 수 있다
	// makeScore() method 가 시작되는 곳에서 scoreList를 초기화 해 줘야 한다
	public void makeScoreList(int listSize) {
		// scoreList 변수의 scope 가 makeScore { } 블럭이다
		// 만약 다른 method에서 scoreList 변수값을 사용하려면 scope 영역을 변경해 주어야한다
		scList = new ArrayList<>();
		this.makeScoreList(scList, listSize);
	}
/*
		for (int i = 0; i < listSize; i++) {
			ScoreDto score = new ScoreDto();
			score.setStName(String.format("%04d", i + 1));
			score.setScKor((int) (Math.random() * 50) + 51);
			score.setScEng((int) (Math.random() * 50) + 51);
			score.setScMath((int) (Math.random() * 50) + 51);
			scList.add(score);
		}
*/
//	public void printScoreList(List<ScoreDto> scoreList) {
//		System.out.println();
//		for (ScoreDto scoreDto : scoreList) {
//			
//		}
//	}
}