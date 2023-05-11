package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.config.DataIndex;
import com.callor.books.config.Utils;
import com.callor.books.models.AuthorDto;
import com.callor.books.service.AuthorService;

public class AuthorServiceImplV1 implements AuthorService{

	List<AuthorDto> auList;
	
	
	
	public AuthorServiceImplV1() {
		auList = new ArrayList<>();
	}

	@Override
	public void loadAuthor() {
		String authorFile = "src/com/callor/books/data/저자정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;
		
		try {
			is = new FileInputStream(authorFile);
		} catch (FileNotFoundException e) {
			System.out.println(authorFile + " 이 존재하지 않습니다");
		}
		
		scan = new Scanner(is);
		
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");
			
			AuthorDto auDto = new AuthorDto();
			auDto.setAuAddress(book[DataIndex.AUTHOR.ADDRESS]);
			auDto.setAuCode(book[DataIndex.AUTHOR.CODE]);
			auDto.setAuName(book[DataIndex.AUTHOR.NAME]);
			auDto.setAuTel(book[DataIndex.AUTHOR.TEL]);
			
			auList.add(auDto);
		}
		scan.close();
	}

	//저자코드,저자명,전화번호,주소
	@Override
	public void printAuthorList() {
		System.out.println(Utils.dLine(140));
		System.out.println("저자코드\t저자명\t\t\t\t전화번호\t주소");
		System.out.println(Utils.sLine(140));
		for (AuthorDto auDto : auList) {
			System.out.printf("%s\t\t",auDto.getAuCode());
			if(auDto.getAuName().length() <= 3) {
				System.out.printf("%s\t\t\t\t",auDto.getAuName());
			} else if (auDto.getAuName().length() <= 15){
				System.out.printf("%s\t\t\t",auDto.getAuName());
			} else {
				System.out.printf("%s\t",auDto.getAuName());
			}
			System.out.printf("%s\t",auDto.getAuTel());
			System.out.printf("%s\n",auDto.getAuAddress());
		}
		System.out.println(Utils.sLine(140));
	}

	@Override
	public AuthorDto getAuthor(String code) {
		if(auList.isEmpty()) {
			this.loadAuthor();
		}
		for (AuthorDto auDto : auList) {
			if (code.equals(auDto.getAuCode())) {
				return auDto;
			}
		}
		return null;
	}

	@Override
	public List<AuthorDto> getAuthorList() {
		if(auList.isEmpty()) {
			this.loadAuthor();
			return auList;
		}
		return auList;
	}
}
