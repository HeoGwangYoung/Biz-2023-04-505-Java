package com.callor.score;

public class ScoreDto {
	// 학생 점수를 담을 인스턴스 영역
	String stNum;	//학번
	int stKorSc;	//국어 점수
	int stEngSc;	//영어 점수
	int stMthSc;	//수학 점수
	int stMusSc;	//음악 점수
	int stArtSc;	//미술 점수
	
	public int getStTotal() { //객체 내 점수 인스턴스의 총합을 리턴해주는 메서드
		int result = 0;
		result += this.stKorSc;
		result += this.stEngSc;
		result += this.stMthSc;
		result += this.stMusSc;
		result += this.stArtSc;
		
		return result;
	}
	
	public float getStAvg() { // 객체 내 점수 인스턴스의 평균을 리턴해주는 메서드
		float avg = (float)this.getStTotal() / 5;
		return avg;
	}
}
