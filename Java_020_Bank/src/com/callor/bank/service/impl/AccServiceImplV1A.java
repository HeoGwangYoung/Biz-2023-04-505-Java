package com.callor.bank.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.callor.bank.model.AccDto;
import com.callor.bank.model.BuyerDto;
import com.callor.bank.service.AccService;
import com.callor.bank.service.BuyerService;
import com.callor.bank.utils.AnsiConsol;
import com.callor.bank.utils.Config;
import com.callor.bank.utils.Line;

public class AccServiceImplV1A implements AccService{
	
	protected List<AccDto> accList;
	protected Scanner scan;
	protected BuyerService buyerService;
	
	public AccServiceImplV1A() {
		scan = new Scanner(System.in);
		accList = new ArrayList<>();
		buyerService = new BuyerServiceImplV1A();
	}

	// 새로운 계좌번호를 자동으로 생성하기
	/*
	 * 계좌번호 format
	 * 
	 * 1000-2023-05-18-0001
	 * 
	 * "1000" : 은행 코드
	 * "2023-05-18" : 계좌를 신설한 날짜
	 * "0001" : 일련 번호
	 */
	protected String getNewAccNum() {
		
		// 컴퓨터의 현재 시각을 get 하는 클래스
		// System.currentTimeMillis()
		// 		1970.1.1 00:00:00.000 부터 시작하여
		//		현재시점까지 카운트된 밀리세컨드 값
		// 이 값을 Date 클래스의 생성자에 전달하면
		// 현재 날짜, 시각 정보를 알수 있는 객체로 생성해 준다
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat todayFormat = new SimpleDateFormat("YYYY-MM-dd");
		String todayString = todayFormat.format(date);
		
		int maxNum = 0;
		String numBank = "1000";
		for (AccDto accDto : accList) {
			// 1000-2023-05-18-0001
			// 1000-2023-05-18-0002
			// 1000-2023-05-18-0003
			// 1000-2023-05-18-0004
			// 1000-2023-05-18-0005
			String accNum = accDto.acNum;
			
			// 처음의 4글자를 잘라서 bank 코드 추출하기
			numBank = accNum.substring(0,4);
			
			// 날짜 부분 추출하기
			String numDate = accNum.substring(4, todayString.length());
			
			if(numDate != null && numDate.equals(todayString)) {
				// 일련번호 부분만 추출하기
				String strLastNum = accNum.substring(numBank.length() + todayString.length());
				int lastNum = Integer.valueOf(strLastNum);
				if(maxNum > lastNum) maxNum = lastNum;
			}
		} // end for
		
		// maxNum 는 0또는 최대값
		String newNum = String.format("%s%s%04d", numBank, todayString, maxNum + 1);
		return newNum;
	}
	/*
	 * 신규계좌 등록하기
	 * 1. 고객번호를 입력받고,
	 * 2. 고객번호가 고객정보 있는가 확인
	 * 		BuyerServiceImplV1.getBuyer() method를 사용하여 고객정보 찾기
	 * 		없으면 : 고객정보를 등록하세요 라고 메시지 표현
	 * 3. 고객번호가 있으면 신규 계좌를 생성 : List<AccDto> type accList에 추가
	 */
	@Override
	public void accInit() {
		Config.bankTitle("계좌생성");
		
		while(true) {
			
			String accNum = getNewAccNum();
			System.out.println(Line.sLine(100));
			System.out.println("생성된 계좌번호 : " + accNum);
			System.out.println(Line.sLine(100));
			
			String strBuid = "";
			while(true) {
				System.out.println("고객 번호를 입력해 주세요");
				System.out.print("고객번호 >> ");
				strBuid = scan.nextLine();
				if(strBuid.equals("QUIT")) break;
				
				try {
					int intBuid = Integer.valueOf(strBuid);
					strBuid = String.format("%04d", intBuid);
					
					BuyerDto buyerDto = buyerService.getBuyer(strBuid);
					if(buyerDto == null) {
						System.out.println(AnsiConsol.message("RED", "고객정보가 없습니다"));
						System.out.println("고객정보를 먼저 등록해 주세요");
					} else {
						System.out.println(Line.sLine(100));
						System.out.println(buyerDto.toString());
						System.out.println(Line.sLine(100));
					}
					
				} catch (Exception e) {
					System.out.println("고객 번호는 정수로 입력");
				}
				
			}
		}
	}

	@Override
	public void inout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAccList() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadAccList() {
		// TODO Auto-generated method stub
		
	}

}
