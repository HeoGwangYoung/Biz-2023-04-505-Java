package com.callor.score;


public class Java_OneDay_001_Score {
	
	public static void main(String[] args) {
		// 배열 생성
		ScoreDto[] scores = new ScoreDto[10];
		
		// 객체 생성
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}
		
		// ScoreService클래스 메서드를 사용하기 위해 서비스 객체 생성
		ScoreService serv = new ScoreService();
		
		// 점수 생성 (반드시 출력전에 호출해줘야함)
		serv.stInfoInitalize(scores);
		serv.Totalset(scores);
		
		// 출력
		serv.printTitle();
		serv.printStScore(scores);
		serv.printTotal(scores);
	}
}
