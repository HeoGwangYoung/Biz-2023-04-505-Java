package com.callor.exam.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.exam.models.GuideDto;
import com.callor.exam.service.GuideService;
import com.callor.exam.utils.Index;

public class GuideServiceImplV1 implements GuideService{

	// 객체에 final 키워드 부착시 반드시 생성자에서 생성해줘야함
	protected final List<GuideDto> guideList;
	
	public GuideServiceImplV1() {
		guideList = new ArrayList<>();
	}

	@Override
	public void loadGuide() {
		String guideFile = "src/com/callor/exam/guide.txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(guideFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		scan = new Scanner(is);
		int rows = 0;
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] guide = line.split(",");
			
			GuideDto guDto = new GuideDto();
			try {
				guDto.id = guide[Index.GUIDE.GU_ID];
				guDto.item = guide[Index.GUIDE.GU_ITEM];
				guDto.seq = Integer.parseInt(guide[Index.GUIDE.GU_SEQ]);
				guDto.guide = guide[Index.GUIDE.GU_GUIDE];
				guideList.add(guDto);
			} catch (Exception e) {
				System.out.println(rows + " 번째 에서 Exception 발생");
			}
			rows++;
		}
		
		scan.close();
		System.out.println("로딩된 데이터 개수 : " + guideList.size());
	}

	@Override
	public void printGuide() {
		System.out.println("=".repeat(150));
		System.out.println("ID\t종목명\t순서\t가이드");
		System.out.println("-".repeat(150));
		
		
		String id = null;
		for (GuideDto guideDto : guideList) {
			
			if(id != null && ! id.equals(guideDto.id)) {
				System.out.println("-".repeat(150));
			}
			id = guideDto.id;
			
			System.out.printf("%s\t", guideDto.id);
			System.out.printf("%s\t\t\t", guideDto.item);
			System.out.printf("%s\t\t", guideDto.seq);
			System.out.printf("%s\n", guideDto.guide);
			
		}
	}

}
