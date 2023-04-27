package com.callor.score;

public class ScoreService {
	// 총합을 저장할 인스턴스
	public int korTotal = 0;
	public int engTotal = 0;
	public int mthTotal = 0;
	public int musTotal = 0;
	public int artTotal = 0;
	public int totalofTotal = 0;
	public float totalofAvg = 0f;
	
	// 학생번호와 점수를 생성할 메서드
	public void stInfoInitalize(ScoreDto[] score) {
		int defualtNum = 23001;
		// 매개변수로 ScoreDto 타입의 배열변수를 받아와서 배열요소에 각각 점수를 생성해줌
		for (int i = 0; i < score.length; i++) {
			score[i].stNum = String.format("%d", defualtNum);
			defualtNum ++;
			
			score[i].stKorSc = (int) (Math.random() * 50) + 51;
			score[i].stEngSc = (int) (Math.random() * 50) + 51;
			score[i].stMthSc = (int) (Math.random() * 50) + 51;
			score[i].stMusSc = (int) (Math.random() * 50) + 51;
			score[i].stArtSc = (int) (Math.random() * 50) + 51;
		}
	}

	public void Totalset(ScoreDto[] scores) {
		// 매개변수로 배열변수를 받아와서 서비스 인스턴스(총합)에 더해줌
		for (int i = 0; i < scores.length; i++) {
			korTotal += scores[i].stKorSc;
			engTotal += scores[i].stEngSc;
			mthTotal += scores[i].stMthSc;
			musTotal += scores[i].stMusSc;
			artTotal += scores[i].stArtSc;
			totalofTotal += scores[i].getStTotal();
			totalofAvg += scores[i].getStAvg();
		}
	}
	// 콘솔의 상단부분을 출력해주는 메서드
	public void printTitle() {
		System.out.println("=".repeat(70));
		System.out.println("* 한울 고교 성적 리스트 *");
		System.out.println("=".repeat(70));
		System.out.printf("학번\t\t  국어\t  영어\t  수학\t  음악\t  미술\t 총점\t평균\n");
		System.out.println("-".repeat(70));
	}
	// 매개변수로 배열을 받아와서 배열요소의 인스턴스 정보들을 출력해주는 메서드
	public void printStScore(ScoreDto[] score) {
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s\t\t%5d\t%5d\t%5d\t%5d\t%5d\t%5d\t%.2f\n",
					score[i].stNum, score[i].stKorSc, score[i].stEngSc,
					score[i].stMthSc, score[i].stMusSc, score[i].stArtSc,
					score[i].getStTotal(), score[i].getStAvg());
		}
	}

	//매개변수로 배열을 받아와서(평균을 구할때 배열 요소의 개수로 나눠야 해서 length를 쓰기위함)
	//서비스 인스턴스들(총합) 과 평균을 출력해주는 메서드
	public void printTotal(ScoreDto[] score) {
		System.out.println("-".repeat(70));
		System.out.printf("총점\t\t%5d\t%5d\t%5d\t%5d\t%5d\t%5d\n",
				this.korTotal, this.engTotal, this.mthTotal, 
				this.musTotal, this.artTotal, this.totalofTotal);
		System.out.println();
		System.out.printf("평균\t\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\n", 
				(float)korTotal / score.length, (float)engTotal / score.length, (float)mthTotal / score.length, 
				(float)musTotal / score.length, (float)artTotal / score.length, totalofAvg / score.length);
		System.out.println("=".repeat(70));
	}
	
}
