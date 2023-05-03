package com.callor.system.exec;

import com.callor.system.models.StudentDto;

public class StudentB {
	public static void main(String[] args) {
		StudentDto ÀÌ¸ù·æ = new StudentDto();

//		ÀÌ¸ù·æ.stNum = "0001";
		// stNum ¸â¹ö º¯¼ö¿¡ ¹®ÀÚ¿­ "0001"À» setting(´ëÀÔ, ÇÒ´ç, ÀúÀå)ÇØ ´Ş¶ó
		ÀÌ¸ù·æ.setStNum("0001");
		
//		strNum = ÀÌ¸ù·æ.stNum();
		//stNum ¸â¹ö º¯¼ö¿¡ ÀúÀåµÈ ¹®ÀÚ¿­À» ÀĞ¾î¼­ strNum º¯¼ö¿¡ ÀúÀå ÇØ´Ş¶ó
		String strNum = ÀÌ¸ù·æ.getStNum();
		
		ÀÌ¸ù·æ.setStNum("0001");
		ÀÌ¸ù·æ.setStName("ÀÌ¸ù·æ");
		ÀÌ¸ù·æ.setStDept("ÄÄÇ»ÅÍ°øÇĞ");
		ÀÌ¸ù·æ.setStGrade(3);
		ÀÌ¸ù·æ.setStTel("010-1111-1111");
		
		System.out.println(ÀÌ¸ù·æ.toString());
	}
}
