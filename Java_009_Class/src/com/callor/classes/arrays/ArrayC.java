package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class ArrayC {

	public static void main(String[] args) {

		// ScoreServiceA俊 急攫等 method甫 荤侩窍扁 困秦 按眉函荐 积己
		ScoreServiceA scoreService = new ScoreServiceA();

		// 3疙切积狼 己利沥焊甫 历厘且 按眉函荐 积己
		// 阿 切积狼 切锅, 捞抚, 苞格痢荐 技泼
		ScoreDto 全辨悼 = new ScoreDto();
		全辨悼.stName = "全辨悼";
		全辨悼.stNum = "0001";
		全辨悼.scKor = scoreService.getScore();
		全辨悼.scEng = scoreService.getScore();
		全辨悼.scMath = scoreService.getScore();

		ScoreDto 捞根锋 = new ScoreDto();
		捞根锋.stName = "捞根锋";
		捞根锋.stNum = "0002";
		捞根锋.scKor = scoreService.getScore();
		捞根锋.scEng = scoreService.getScore();
		捞根锋.scMath = scoreService.getScore();

		ScoreDto 己冕氢 = new ScoreDto();
		己冕氢.stName = "己冕氢";
		己冕氢.stNum = "0003";
		己冕氢.scKor = scoreService.getScore();
		己冕氢.scEng = scoreService.getScore();
		己冕氢.scMath = scoreService.getScore();

		int korTotal = 全辨悼.scKor + 捞根锋.scKor + 己冕氢.scKor;
		int engTotal = 全辨悼.scEng + 捞根锋.scEng + 己冕氢.scEng;
		int mathTotal = 全辨悼.scMath + 捞根锋.scMath + 己冕氢.scMath;
		int totalofTotal = 全辨悼.getTotal() + 捞根锋.getTotal() + 己冕氢.getTotal();

		// 己利钎 title 免仿
		System.out.println("=====================================================");

		System.out.printf("切锅\t捞抚\t惫绢\t康绢\t荐切\t醚痢\t乞闭\n");

		System.out.println("-----------------------------------------------------");

		// 阿 切积狼 己利 沥焊 免仿
		scoreService.scorePrint(全辨悼);
		scoreService.scorePrint(捞根锋);
		scoreService.scorePrint(己冕氢);
		System.out.println("-----------------------------------------------------");
		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal, 3);
	}
}
