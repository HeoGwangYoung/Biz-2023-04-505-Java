package guide.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import guide.models.GuideDto;
import guide.service.GuideService;

public class GuideServiceImplV1 implements GuideService{

	List<GuideDto> guList;
	
	
	public GuideServiceImplV1() {
		guList = new ArrayList<>();
	}

	@Override
	public void loadGuide() {
		String guideFile = "src/guide/data/guide.txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(guideFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] guide = line.split(",");
			
			GuideDto guideDto = new GuideDto();
			guideDto.guId = guide[0];
			guideDto.guName = guide[1];
			guideDto.guNum = guide[2];
			guideDto.guGuide = guide[3];
			
			guList.add(guideDto);
		}
		
		scan.close();
	}

	@Override
	public void printGuideList() {
		
		String Name = null;
		
		System.out.println("=".repeat(120));
		System.out.println("id\t종목\t순서\t방법");
//		for (GuideDto guideDto : guList) {
//			System.out.printf("%s\t%s\t%s\t%s\n",guideDto.guId, guideDto.guName, guideDto.guNum, guideDto.guGuide);
//			
//		}
		for (int i = 0; i < guList.size(); i++) {
			
			if(i == 0) {
				Name = guList.get(i).guName;
			} else if(i != 0) {
				Name = guList.get(i - 1).guName;
			}
			
			if(!(Name.equals(guList.get(i).guName))) {
				System.out.println("-".repeat(120));
			}
			
			System.out.printf("%s\t", guList.get(i).guId);
			System.out.printf("%s\t", guList.get(i).guName);
			System.out.printf("%s 회\t", guList.get(i).guNum);
			System.out.printf("%s\n", guList.get(i).guGuide);
		}
		
	}
}
