package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;

public class ArrayA {

	public static void main(String[] args) {
		ScoreDto 全辨悼 = new ScoreDto();
		全辨悼.stName = "全辨悼";
		全辨悼.stNum = "0001";
		全辨悼.scKor = (int)(Math.random() * 50) + 51;
		全辨悼.scEng = (int)(Math.random() * 50) + 51;
		全辨悼.scMath = (int)(Math.random() * 50) + 51;
		
		ScoreDto 捞根锋 = new ScoreDto();
		捞根锋.stName = "捞根锋";
		捞根锋.stNum = "0002";
		捞根锋.scKor = (int)(Math.random() * 50) + 51;
		捞根锋.scEng = (int)(Math.random() * 50) + 51;
		捞根锋.scMath = (int)(Math.random() * 50) + 51;
		
		ScoreDto 己冕氢 = new ScoreDto();
		己冕氢.stName = "己冕氢";
		己冕氢.stNum = "0003";
		己冕氢.scKor = (int)(Math.random() * 50) + 51;
		己冕氢.scEng = (int)(Math.random() * 50) + 51;
		己冕氢.scMath = (int)(Math.random() * 50) + 51;
		
		System.out.println("=====================================================");
		
		System.out.printf("切锅\t捞抚\t惫绢\t康绢\t荐切\t醚痢\t乞闭\n");
		
		System.out.println("-----------------------------------------------------");
		
		System.out.printf("%s\t%s\t%4d\t%4d\t%4d\t%4d\t%.1f\n", 全辨悼.stNum, 全辨悼.stName, 全辨悼.scKor, 
				全辨悼.scEng, 全辨悼.scMath, 全辨悼.getTotal(), 全辨悼.getAvg());
		
		System.out.printf("%s\t%s\t%4d\t%4d\t%4d\t%4d\t%.1f\n", 捞根锋.stNum, 捞根锋.stName, 捞根锋.scKor, 
				捞根锋.scEng, 捞根锋.scMath, 捞根锋.getTotal(), 捞根锋.getAvg());
		
		System.out.printf("%s\t%s\t%4d\t%4d\t%4d\t%4d\t%.1f\n", 己冕氢.stNum, 己冕氢.stName, 己冕氢.scKor, 
				己冕氢.scEng, 己冕氢.scMath, 己冕氢.getTotal(), 己冕氢.getAvg());
	}
}
