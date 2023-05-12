package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.Utils;
import com.callor.books.models.PublisherDto;
import com.callor.books.service.PublisherService;

public class PublisherServiceImplV1 implements PublisherService{

	protected List<PublisherDto> pbList;
	
	
	public PublisherServiceImplV1() {
		pbList = new ArrayList<>();
	}

	@Override
	public void loadPublisher() {
		String publisherFile = "src/com/callor/books/data/출판사정보(2023-05-11).txt";
		
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(publisherFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan = new Scanner(is);
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] pb = line.split(",");
			PublisherDto pbDto = new PublisherDto();
			pbDto.setPubCode(pb[0]);
			pbDto.setPubName(pb[1]);
			pbDto.setPubCeo(pb[2]);
			pbDto.setPubTel(pb[3]);
			pbDto.setPubAddress(pb[4]);
			
			pbList.add(pbDto);
		}
		
		scan.close();
	}

	@Override
	public void printPublisherList() {
		System.out.println(Utils.dLine(100));
		System.out.println("출판사코드\t출판사명\t대표\t전화번호\t주소");
		System.out.println(Utils.sLine(100));
		
		for (PublisherDto pbDto : pbList) {
			System.out.printf("%s\t", pbDto.getPubCode());
			System.out.printf("%s\t", pbDto.getPubName());
			System.out.printf("%s\t", pbDto.getPubCeo());
			System.out.printf("%s\t", pbDto.getPubTel());
			System.out.printf("%s\n", pbDto.getPubAddress());
		}
		System.out.println(Utils.dLine(100));
	}

	@Override
	public PublisherDto getPubliser(String code) {
		if(pbList.isEmpty()) {
			this.loadPublisher();
		}
		for (PublisherDto pbDto : pbList) {
			if (code.equals(pbDto.getPubCode())) {
				return pbDto;
			}
		}
		return null;
	}

	@Override
	public List<PublisherDto> getPublisherList() {
		if(pbList.isEmpty()) {
			this.loadPublisher();
			return pbList;
		}
		
		return pbList;
	}

	@Override
	public List<PublisherDto> getPublisherListByName(String name) {
		
		if(pbList.isEmpty()) {
			this.loadPublisher();
		}
		// 문자열을 전달받아 문자열이 포함된 list를 get
		List<PublisherDto> searchList = new ArrayList<>();
		
		for (PublisherDto pbDto : pbList) {
			if(pbDto.getPubName().contains(name)) {
				searchList.add(pbDto);
			}
		}
		
		return searchList;
	}
}
