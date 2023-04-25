package com.callor.classes.exec;

import com.callor.classes.model.ScoreDto;

public class ExecC {

	public static void main(String[] args) {
		ScoreDto 全辨悼 = new ScoreDto();
		ScoreDto 捞根锋 = new ScoreDto();
		ScoreDto 己冕氢 = new ScoreDto();
		
		全辨悼.stName = "全辨悼";
		全辨悼.intKor = 100;
		
		捞根锋.stName = "捞根锋";
		捞根锋.intKor = 88;
		
		己冕氢.stName = "己冕氢";
		己冕氢.intKor = 99;
		己冕氢.intEng = 79;
		己冕氢.intMth = 73;
		己冕氢.intHis = 83;
		己冕氢.intArt = 67;
		己冕氢.intMus = 82;
		己冕氢.intAth = 93;
		
		System.out.println("己冕氢 惫绢痢荐 : " + 己冕氢.intKor);
		System.out.println("己冕氢 醚痢 : " + 己冕氢.getTotal());
	}
}
