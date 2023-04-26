package com.callor.classes.arrays;

import com.callor.classes.model.ScoreDto;
import com.callor.classes.service.ScoreServiceA;

public class HomeWork {

	public static void main(String[] args) {
		ScoreDto[] scores = new ScoreDto[10];

		// Å¬·¡½º ¹è¿­ »ý¼º
		for (int i = 0; i < scores.length; i++) {
			scores[i] = new ScoreDto();
		}

		// °¢ °´Ã¼¿¡ ÇÐ¹ø°ú ÀÌ¸§ ÀúÀå
		scores[0].stNum = "0001";
		scores[0].stName = "È«±æµ¿";
		scores[1].stNum = "0002";
		scores[1].stName = "ÀÌ¸ù·æ";
		scores[2].stNum = "0003";
		scores[2].stName = "¼ºÃáÇâ";
		scores[3].stNum = "0004";
		scores[3].stName = "Àåº¸°í";
		scores[4].stNum = "0005";
		scores[4].stName = "ÀÓ²©Á¤";
		scores[5].stNum = "0006";
		scores[5].stName = "±èÃ¶¼ö";
		scores[6].stNum = "0007";
		scores[6].stName = "±èÈñ°æ";
		scores[7].stNum = "0008";
		scores[7].stName = "ÀÌ±âµ¿";
		scores[8].stNum = "0009";
		scores[8].stName = "¹ÚÃ¶¼ö";
		scores[9].stNum = "0010";
		scores[9].stName = "ÇÑµ¿ÈÄ";
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		// °¢ °´Ã¼¿¡ Á¡¼ö ÀúÀå ¹× ÃÑÇÕ °è»ê 
		for (int i = 0; i < scores.length; i++) {
			scores[i].scKor = (int) (Math.random() * 50) + 51;
			scores[i].scEng = (int) (Math.random() * 50) + 51;
			scores[i].scMath = (int) (Math.random() * 50) + 51;
			korTotal += scores[i].scKor;
			engTotal += scores[i].scEng;
			mathTotal += scores[i].scMath;
		}
		
		System.out.println("=".repeat(70));
		System.out.println("ÇÐ¹ø\tÀÌ¸§\t±¹¾î\t¿µ¾î\t¼öÇÐ\tÃÑÁ¡\tÆò±Õ");
		System.out.println("-".repeat(70));
		
		ScoreServiceA scoreService = new ScoreServiceA();
		
		// Á¡¼ö Ãâ·Â
		for (int i = 0; i < scores.length; i++) {
			scoreService.scorePrint(scores[i]);
		}
		System.out.println("-".repeat(70));
		scoreService.scoreTotalPrint(korTotal, engTotal, mathTotal, 10);
		System.out.println("=".repeat(70));
	}

}
